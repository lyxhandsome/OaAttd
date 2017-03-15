package de.luyi.oahan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

public class SQLAccess {
	private Connection mysqlConnect = null;
	private Statement mysqlStatement = null;
	private PreparedStatement mysqlPreparedStatement = null;
	private ResultSet mysqlResultSet = null;
	
	private Connection mssqlConnect = null;
	private Statement mssqlStatement = null;
	private PreparedStatement mssqlPreparedStatement = null;
	private ResultSet mssqlResultSet = null;
	
	private KQZ_Vacation kva;

	public void readDataBase() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			mysqlConnect = DriverManager.getConnection("jdbc:mysql://localhost:3336/td_oa?" + "user=root&password=myoa888");
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
			mssqlConnect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;"
					+ "databaseName=hwatt;user=sa;password=myoa888"); 
			
			// Statements allow to issue SQL queries to the database
			mysqlStatement = mysqlConnect.createStatement();
			// Result set get the result of the SQL query
			mysqlResultSet = mysqlStatement.executeQuery("SELECT * FROM flow_data_41 WHERE data_34=0;");
			while (mysqlResultSet.next()) {
				kva.setEmployeeID(mysqlResultSet.getInt(2));
				
			}
			
//			writeResultSet(mysqlResultSet);
//
//			// PreparedStatements can use variables and are more efficient
//			mysqlPreparedStatement = mysqlConnect
//					.prepareStatement("insert into  td_oa.comments values (default, ?, ?, ?, ? , ?, ?)");
//			// "myuser, webpage, datum, summary, COMMENTS from
//			// td_oa.comments");
//			// Parameters start with 1
//			Calendar cal = Calendar.getInstance();
//			cal.set(2008, 1, 7, 1, 6, 7);
//			long time = cal.getTime().getTime();
//			
//			mysqlPreparedStatement.setString(1, "Test");
//			mysqlPreparedStatement.setString(2, "TestEmail");
//			mysqlPreparedStatement.setString(3, "TestWebpage");
//			mysqlPreparedStatement.setDate(4, new java.sql.Date(time));
//			mysqlPreparedStatement.setString(5, "TestSummary");
//			mysqlPreparedStatement.setString(6, "TestComment");
//			mysqlPreparedStatement.executeUpdate();
//
//			mysqlPreparedStatement = mysqlConnect
//					.prepareStatement("SELECT myuser, webpage, datum, summary, COMMENTS from td_oa.comments");
//			mysqlResultSet = mysqlPreparedStatement.executeQuery();
//			writeResultSet(mysqlResultSet);
//
//			// Remove again the insert comment
//			mysqlPreparedStatement = mysqlConnect.prepareStatement("delete from td_oa.comments where myuser=?; ");
//			mysqlPreparedStatement.setString(1, "Test");
//			mysqlPreparedStatement.executeUpdate();
//
//			mysqlResultSet = mysqlStatement.executeQuery("select * from td_oa.comments");
//			writeMetaData(mysqlResultSet);

		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}

	}

	private void writeMetaData(ResultSet mysqlResultSet) throws SQLException {
		// Now get some metadata from the database
		// Result set get the result of the SQL query
		System.out.println("The columns in the table are: ");
		System.out.println("Table: " + mysqlResultSet.getMetaData().getTableName(1));
		for (int i = 1; i <= mysqlResultSet.getMetaData().getColumnCount(); i++) {
			System.out.println("Column " + i + " " + mysqlResultSet.getMetaData().getColumnName(i));
		}
	}

	private void writeResultSet(ResultSet mysqlResultSet) throws SQLException {
		// ResultSet is initially before the first data set
		while (mysqlResultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. mysqlResultSet.getSTring(2);
			String user = mysqlResultSet.getString("myuser");
			String website = mysqlResultSet.getString("webpage");
			String summary = mysqlResultSet.getString("summary");
			Date date = mysqlResultSet.getDate("datum");
			String comment = mysqlResultSet.getString("comments");
			System.out.println("User: " + user);
			System.out.println("Website: " + website);
			System.out.println("summary: " + summary);
			System.out.println("Date: " + date);
			System.out.println("Comment: " + comment);
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
