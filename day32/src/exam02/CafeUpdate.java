package exam02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CafeUpdate {

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
			
			System.out.println("               *����*");
			System.out.println("1.���̵�	2.��й�ȣ    3.��������      4.ȸ�����");
			System.out.print("������ ���� �Է� : ");
			int choice = sc.nextInt();
			
				if(choice == 1) {
					StringBuffer sql = new StringBuffer();
					sql.append("update \"CAFE\" set \"ID\" = ?");
					sql.append(" where \"NUM\" = ?");
					
					System.out.println("������ ȸ���� ȸ����ȣ �Է� : ");
					long num = sc.nextLong();
					sc.nextLine();
					System.out.println("������ ���̵� �Է� : ");
					String id = sc.nextLine();
					
					
					conn = DriverManager.getConnection(url, user, password);
					pstmt = conn.prepareStatement(sql.toString());
					pstmt.setString(1, id);
					pstmt.setLong(2, num);

					int result = pstmt.executeUpdate();

					if (result == -1) {
						System.out.println("���� ����!");
					} else {
						System.out.println(result + "���� ����Ǿ����ϴ�.");
					}
				}else if(choice == 2) {
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
					ResultSet rs2 = pstmt.executeQuery();
					
					String sqlPw = " ";
					
					while(rs2.next()) {
						sqlPw = rs2.getString("PASSWORD");
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

				}else if(choice == 3) {
					StringBuffer sql = new StringBuffer();
					sql.append("update \"CAFE\" set \"RESIDENCE\" = ?");
					sql.append(" where \"NUM\" = ?");
					
					System.out.println("������ ȸ���� ȸ����ȣ �Է� : ");
					long num = sc.nextLong();
					sc.nextLine();
					System.out.println("������ �������� �Է� : ");
					String resid = sc.nextLine();
					
					conn = DriverManager.getConnection(url, user, password);
					pstmt = conn.prepareStatement(sql.toString());
					pstmt.setString(1, resid);
					pstmt.setLong(2, num);

					int result = pstmt.executeUpdate();

					if (result == -1) {
						System.out.println("���� ����!");
					} else {
						System.out.println(result + "���� ����Ǿ����ϴ�.");
					}
				}else if(choice == 4) {
					StringBuffer sql = new StringBuffer();
					sql.append("update \"CAFE\" set \"RATING\" = ?");
					sql.append(" where \"NUM\" = ?");

					System.out.println("������ ȸ���� ȸ����ȣ �Է� : ");
					long num = sc.nextLong();
					sc.nextLine();
					System.out.println("������  ��� �Է�(1~5) : ");
					long resid = sc.nextLong();

					if (resid > 5) {
						System.out.println("��� ������ �ʰ��߽��ϴ�.");
					} else {
						conn = DriverManager.getConnection(url, user, password);
						pstmt = conn.prepareStatement(sql.toString());
						pstmt.setLong(1, resid);
						pstmt.setLong(2, num);

						int result = pstmt.executeUpdate();

						if (result == -1) {
							System.out.println("���� ����!");
						} else {
							System.out.println(result + "���� ����Ǿ����ϴ�.");
						}
					}
				}else if(choice > 4) {
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
