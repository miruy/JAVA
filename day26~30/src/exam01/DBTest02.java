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
		ResultSet rs = null;	//��������ִ� ��ü 
		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");
			
//			StringBuffer sql = new StringBuffer();
//			sql.append("select count(*) from \"INFO\"");
			String sql = "select count(*) from INFO";	//count(*) : ���̺��� ������ ���� ��ȯ�ϴ� Ű���� 
			conn = DriverManager.getConnection(
					url, 
					user, 
					password);
			stmt = conn.createStatement();	//�����ÿ� ���� �ȵ� 
			rs = stmt.executeQuery(sql);	//����ÿ� ���� �� 
			if(rs.next()) {
				System.out.println("���ڵ� ��:" + rs.getInt(1));
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
