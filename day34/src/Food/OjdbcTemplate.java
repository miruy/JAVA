package Food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OjdbcTemplate {

	private static OjdbcTemplate instance;
	private static String user = "admin";
	private static String password = "YUYUyuyu25864966?";
	private static String url = "jdbc:oracle:thin:@DB202112211148_medium?TNS_ADMIN=/Users/kim-yurim/Documents/workspace/Wallet_DB202112211148/";

	private OjdbcTemplate() {}
	
	public static OjdbcTemplate getInstance() {
		instance = new OjdbcTemplate();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공!");
			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return instance;
		
	}

	public Connection getConnection() throws SQLException {
		Connection conn = null;
		return DriverManager.getConnection(url, user, password);
	}

}
