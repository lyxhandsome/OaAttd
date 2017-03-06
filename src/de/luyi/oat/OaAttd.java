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
			// ����Class.forName()����������������
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("�ɹ�����MySQL������");

			String url = "jdbc:mysql://localhost:3336/TD_OA"; // JDBC��URL
			Connection conn;

			conn = DriverManager.getConnection(url, "root", "myoa888");
			Statement stmt = conn.createStatement(); // ����Statement����
			System.out.println("�ɹ����ӵ����ݿ⣡");

			String sql = "select staff_id, staff_name from hr_staff_info"; // Ҫִ�е�SQL
			ResultSet rs = stmt.executeQuery(sql);// �������ݶ���
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
