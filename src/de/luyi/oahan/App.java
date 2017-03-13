package de.luyi.oahan;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
	public static void main(String[] args) {
		String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=myoa888";

		try {
			// Load SQL Server JDBC driver and establish connection.
			System.out.print("Connecting to SQL Server ... ");
			try (Connection connection = DriverManager.getConnection(connectionUrl)) {
				System.out.println("Done.");
			}
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}
