package StudentManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTamplate {
	public JdbcTamplate() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공");
			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		Connection conn = null;
		String user = "admin";
		String password = "YUYUyuyu25864966?";
		String url = "jdbc:oracle:thin:@DB202112211148_medium?TNS_ADMIN=/Users/kim-yurim/Documents/workspace/Wallet_DB202112211148/";
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
