package de.luyi.oahan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class SQLAccess {
	private Connection mysqlConnect = null;
	private Statement mysqlStatement = null;
	private PreparedStatement mysqlPreparedStatement = null;
	private ResultSet mysqlResultSet = null;
	
	private Connection mssqlConnect = null;
	private Statement mssqlStatement = null;
	private PreparedStatement mssqlPreparedStatement = null;
	
	public void readDataBase() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			mysqlConnect = DriverManager.getConnection("jdbc:mysql://localhost:3336/td_oa?" 
					+ "user=root&password=myoa888");
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			mssqlConnect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
					+ "databaseName=hwatt;user=sa;password=myoa888"); 
			
			// Statements allow to issue SQL queries to the database
			mysqlStatement = mysqlConnect.createStatement();
			// Result set get the result of the SQL query
			mysqlResultSet = mysqlStatement.executeQuery("SELECT data_35 as employeeid, "
					+ "data_26 beginday, data_27 as endday, data_22 AS vacationtype, "
					+ "data_31 AS reason FROM flow_data_41 WHERE data_34=0;");
			
			mssqlPreparedStatement = mssqlConnect
					.prepareStatement("INSERT INTO [hwatt].[dbo].[KQZ_Vacation] ([EmployeeID], "
							+ "[VacationType], [IsDayAdjust], [BeginTime], [EndTime], [NewBeginTime], "
							+ "[NewEndTime],[ISCHECK], [REASON]) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?);");
			
			DateFormat datefmtday = new SimpleDateFormat("yyyy年MM月dd日");
			DateFormat datefmtbegin = new SimpleDateFormat("yyyy-MM-dd 00:00:00.000");
			DateFormat datefmtend = new SimpleDateFormat("yyyy-MM-dd 23:59:59.000");			
			KQZ_Vacation kva = new KQZ_Vacation();
			while (mysqlResultSet.next()) {
				kva.setEmployeeID(mysqlResultSet.getInt(1));
				kva.setBeginDay(datefmtday.parse(mysqlResultSet.getString(2)));
				kva.setEndDay(datefmtday.parse(mysqlResultSet.getString(3)));
				kva.setVacationType(mysqlResultSet.getString(4));
				kva.setREASON(mysqlResultSet.getString(5));
				
				ArrayList<Date> dayarrl = kva.getVacationday();
				Iterator<Date> it = dayarrl.iterator();
				while(it.hasNext()) {
					Date vacday = it.next();
					mssqlPreparedStatement.setInt(1, kva.getEmployeeID());
					mssqlPreparedStatement.setShort(2, kva.getVacationType());
					mssqlPreparedStatement.setShort(3, kva.getIsDayAdjust());
					mssqlPreparedStatement.setString(4, datefmtbegin.format(vacday));
					mssqlPreparedStatement.setString(5, datefmtend.format(vacday));
					mssqlPreparedStatement.setString(6, datefmtbegin.format(vacday));
					mssqlPreparedStatement.setString(7, datefmtend.format(vacday));
					mssqlPreparedStatement.setShort(8, kva.getISCHECK());
					mssqlPreparedStatement.setString(9, kva.getREASON());
					mssqlPreparedStatement.execute();
				}
			}

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	// You need to close the mysqlResultSet
	private void close() {
		try {
			if (mysqlResultSet != null) {
				mysqlResultSet.close();
			}
			if (mysqlStatement != null) {
				mysqlStatement.close();
			}
			if (mysqlConnect != null) {
				mysqlConnect.close();
			}
		} catch (Exception e) {

		}
	}
}
