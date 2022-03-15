package exam01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTes01 {

	public static void main(String[] args) {
		Connection conn = null; // �α��� ����
		Statement stmt = null; // �ٸ��� ����(������ ����)
		ResultSet rs = null; // select�� ����ϱ� ���� ����� ��ȯ�ϴ� ���� ��ü ����
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		String user = "tester";
		String paw = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");
			
			String sql = "select * from \"CAFE\"";
			
			conn = DriverManager.getConnection(url, user, paw);
			stmt = conn.createStatement();	//�α����� ������ ���� 
			rs = stmt.executeQuery(sql);	//statement ������ ���� ������ �Ű����� sql�� ����
			
			while(rs.next()) {
				System.out.println(rs.getLong(1));
				System.out.println(rs.getNString("NAME"));
				System.out.println(rs.getDate(3));
				System.out.println(rs.getString("ADDRESS"));
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
