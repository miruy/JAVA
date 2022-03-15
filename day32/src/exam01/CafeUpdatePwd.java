package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CafeUpdatePwd {

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
			Long num = sc.nextLong();
			sc.nextLine();

			StringBuffer sql2 = new StringBuffer();
			sql2.append("select \"PASSWORD\" from \"CAFE\"");
			sql2.append(" where \"NUM\" = ?");

			System.out.println("���� ��й�ȣ �Է� : ");
			String oriPwd = sc.nextLine();

			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql2.toString());
			pstmt.setLong(1, num);
			ResultSet rs = pstmt.executeQuery();
			
			String sqlPw = " ";
			
			while(rs.next()) {
				sqlPw = rs.getString("PASSWORD");
			}
			
			if (sqlPw.equals(oriPwd)) {
				
				StringBuffer sql = new StringBuffer();
				sql.append("update \"CAFE\" set \"PASSWORD\" = ?");
				sql.append(" where \"NUM\" = ?");
				
				System.out.println("������ ��й�ȣ �Է� : ");
				String newPwd = sc.nextLine();

				conn = DriverManager.getConnection(url, user, password);
				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setString(1, newPwd);
				pstmt.setLong(2, num);
				int result = pstmt.executeUpdate();

				if (result == -1) {
					System.out.println("���� ����!");
				} else {
					System.out.println(result + "���� ����Ǿ����ϴ�.");
				}
			} else {
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
