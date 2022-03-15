package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CafeDelete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;

		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");
			
			System.out.println("������ ȸ���� ȸ����ȣ �Է� : ");
			long num = sc.nextLong();
			sc.nextLine();
			//��й�ȣ�� �´��� ���� Ȯ��
			StringBuffer sql2 = new StringBuffer();
			sql2.append("select \"PASSWORD\" from \"CAFE\"");
			sql2.append(" where \"NUM\" = ?");
			
			System.out.println("���� ��й�ȣ �Է� : ");
			String oriPwd = sc.nextLine();
			
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql2.toString());
			pstmt.setLong(1, num);
			ResultSet rs = pstmt.executeQuery();
			String sqlPwd = " ";
			
			while(rs.next()) {
				sqlPwd = rs.getString("PASSWORD");
			}
			
			if(sqlPwd.equals(oriPwd)) {
				String sql = "delete from \"CAFE\" where \"NUM\" = ?";
				
				conn = DriverManager.getConnection(url, user, password);
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, num);
				
				int result = pstmt.executeUpdate();

				if (result == -1) {
					System.out.println("���� ����!");
				} else {
					System.out.println(result + "���� �����Ǿ����ϴ�.");
				}
		
			}else {
				System.out.println("���� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
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
