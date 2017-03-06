package de.luyi.oat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prepared {
	public void run() {
		Connection con = null;
		PreparedStatement pst = null;
		
		Statement st = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://localhost:3336/TD_OA";
		String user = "root";
		String password = "myoa888";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载MySQL驱动");
			con = DriverManager.getConnection(url, user, password);
			pst = con.prepareStatement("UPDATE `flow_data_50` SET `run_id`=? WHERE `id`=5");
			pst.setInt(1, 30);
			pst.execute();
			
//			st = con.createStatement();
//			st.executeUpdate("UPDATE flow_data_50 SET run_id=30 WHERE id=5");
			
		} catch (SQLException | ClassNotFoundException ex) {
			Logger lgr = Logger.getLogger(Version.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);
		} finally {
			try {
				if (pst != null) {
					pst.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException ex) {
				Logger lgr = Logger.getLogger(Version.class.getName());
				lgr.log(Level.SEVERE, ex.getMessage(), ex);
			}
		}
	}
}
