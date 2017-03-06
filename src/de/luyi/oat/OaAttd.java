package de.luyi.oat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class OaAttd {
	public void run() {
		try {
			// 调用Class.forName()方法加载驱动程序
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载MySQL驱动！");

			String url = "jdbc:mysql://localhost:3336/TD_OA"; // JDBC的URL
			Connection conn;

			conn = DriverManager.getConnection(url, "root", "myoa888");
			Statement stmt = conn.createStatement(); // 创建Statement对象
			System.out.println("成功连接到数据库！");

			String sql = "select staff_id, staff_name from hr_staff_info"; // 要执行的SQL
			ResultSet rs = stmt.executeQuery(sql);// 创建数据对象
			System.out.println("staffid" + "\t" + "staffname");
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.println();
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
