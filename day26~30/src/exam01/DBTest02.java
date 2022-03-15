package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest02 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;	//실행시켜주는 객체 
		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공!");
			
//			StringBuffer sql = new StringBuffer();
//			sql.append("select count(*) from \"INFO\"");
			String sql = "select count(*) from INFO";	//count(*) : 테이블의 시퀀스 수를 반환하는 키워드 
			conn = DriverManager.getConnection(
					url, 
					user, 
					password);
			stmt = conn.createStatement();	//생성시에 인자 안들어감 
			rs = stmt.executeQuery(sql);	//실행시에 인자 들어감 
			if(rs.next()) {
				System.out.println("레코드 수:" + rs.getInt(1));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
