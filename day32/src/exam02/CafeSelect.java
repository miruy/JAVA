package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CafeSelect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("Ŭ���� �ε� ����!");
			
			System.out.println("         *�˻�*");
			System.out.println("1.���̵�	2.������	3.�����");
			System.out.print("�˻� ��� �Է� : ");
			int choice = sc.nextInt();
			
				if(choice == 1) {
					StringBuffer sql = new StringBuffer();
					sql.append("select \"NUM\", \"ID\", \"PASSWORD\", \"RESIDENCE\", \"ENROLLMENT\", \"RATING\" from \"CAFE\"");
					sql.append(" where \"ID\" =?");
					sc.nextLine();
					System.out.println("���̵�� �˻� : ");
					String searchId = sc.nextLine();

					conn = DriverManager.getConnection(url, user, password);
					pstmt = conn.prepareStatement(sql.toString());
					pstmt.setString(1, searchId);

					rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getLong("NUM"));
						System.out.println(rs.getString("ID"));
						System.out.println(rs.getString("PASSWORD"));
						System.out.println(rs.getString("RESIDENCE"));
						System.out.println(rs.getDate("ENROLLMENT"));
						System.out.println(rs.getLong("RATING"));
						System.out.println();
					}
				}else if(choice == 2) {
					StringBuffer sql = new StringBuffer();
					sql.append("select \"NUM\", \"ID\", \"PASSWORD\", \"RESIDENCE\", \"ENROLLMENT\", \"RATING\" from \"CAFE\"");
					sql.append(" where \"RESIDENCE\" =?");
					sc.nextLine();
					System.out.println("������������ �˻� : ");
					String resid = sc.nextLine();

					conn = DriverManager.getConnection(url, user, password);
					pstmt = conn.prepareStatement(sql.toString());
					pstmt.setString(1, resid);

					rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getLong("NUM"));
						System.out.println(rs.getString("ID"));
						System.out.println(rs.getString("PASSWORD"));
						System.out.println(rs.getString("RESIDENCE"));
						System.out.println(rs.getDate("ENROLLMENT"));
						System.out.println(rs.getLong("RATING"));
						System.out.println();
					}
				}else if(choice == 3) {
					StringBuffer sql = new StringBuffer();
					sql.append("select * from \"CAFE\"");
					sql.append(" where to_date(\"ENROLLMENT\" ,'YY/MM/DD') =?");
					sc.nextLine();
					System.out.println("����Ϸ� �˻�(ex:YY/MM/DD): ");
					String enrom = sc.nextLine();

					conn = DriverManager.getConnection(url, user, password);
					pstmt = conn.prepareStatement(sql.toString());
					pstmt.setString(1, enrom);

					rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.println(rs.getLong("NUM"));
						System.out.println(rs.getString("ID"));
						System.out.println(rs.getString("PASSWORD"));
						System.out.println(rs.getString("RESIDENCE"));
						System.out.println(rs.getDate("ENROLLMENT"));
						System.out.println(rs.getLong("RATING"));
						System.out.println();
					}
				}else if(choice > 3) {
					System.out.println("�߸� �Է��Ͽ����ϴ�.");
				}
			
				
		}catch (ClassNotFoundException e) {
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
