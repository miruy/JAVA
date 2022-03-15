package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest01 {

	public static void main(String[] args) {
		Connection conn = null; 	//�α����� ���� 
		Statement stmt = null;	 	//�ٸ��� ����
		ResultSet rs = null;		//����� ����� ����(��)
		String user = "admin";
		String password = "YUYUyuyu25864966?";
		String url = "jdbc:oracle:thin:@DB202112211148_medium?TNS_ADMIN=/Users/kim-yurim/Documents/workspace/Wallet_DB202112211148/";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공!");

//			StringBuffer sql = new StringBuffer();	StringBufferŬ���� ��ü�� ������ �� 
//			sql.append("select * from \"INFO\"");	�̾�����ٴ� ������ append�޼���� �������� �ۼ�
			String sql = "select * from \"CAFE\" ";		//Buffer�� ���� �ʰ� �׳� String ��ü�� �������� ����
			

			conn = DriverManager.getConnection(url, user, password);	//�������� �α��� 
			stmt = conn.createStatement();	//�α����� ������ ���� 
			rs = stmt.executeQuery(sql);	//������ ���� ��   -> CURD �� select(create)�� executeQuery�޼��� ����� 
			while (rs.next()) {		//��� �ִ� ���� ��� �ݺ�
				System.out.println(rs.getString(1)); //= rs.getLong("NUM") : �������� Į�����ε� ��� ��
				System.out.println(rs.getString(2)); //= rs.getString("NAME")
				System.out.println(rs.getString(3)); //= rs.getDate(3) : �������� ������ �����ε� ��� ����
				System.out.println(rs.getDate(4)); //= rs.getString(4)
				System.out.println(rs.getLong(5)); //= rs.getString(4)
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
