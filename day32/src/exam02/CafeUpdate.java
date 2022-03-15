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
			System.out.println("클래스 로딩 성공!");
			
			System.out.println("               *변경*");
			System.out.println("1.아이디	2.비밀번호    3.거주지역      4.회원등급");
			System.out.print("변경할 정보 입력 : ");
			int choice = sc.nextInt();
			
				if(choice == 1) {
					StringBuffer sql = new StringBuffer();
					sql.append("update \"CAFE\" set \"ID\" = ?");
					sql.append(" where \"NUM\" = ?");
					
					System.out.println("변경할 회원의 회원번호 입력 : ");
					long num = sc.nextLong();
					sc.nextLine();
					System.out.println("변경할 아이디 입력 : ");
					String id = sc.nextLine();
					
					
					conn = DriverManager.getConnection(url, user, password);
					pstmt = conn.prepareStatement(sql.toString());
					pstmt.setString(1, id);
					pstmt.setLong(2, num);

					int result = pstmt.executeUpdate();

					if (result == -1) {
						System.out.println("변경 실패!");
					} else {
						System.out.println(result + "행이 변경되었습니다.");
					}
				}else if(choice == 2) {
					System.out.println("변경할 회원의 회원번호 입력 : ");
					Long num = sc.nextLong();
					sc.nextLine();

					StringBuffer sql2 = new StringBuffer();
					sql2.append("select \"PASSWORD\" from \"CAFE\"");
					sql2.append(" where \"NUM\" = ?");

					System.out.println("기존 비밀번호 입력 : ");
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
						
						System.out.println("변경할 비밀번호 입력 : ");
						String newPwd = sc.nextLine();

						conn = DriverManager.getConnection(url, user, password);
						pstmt = conn.prepareStatement(sql.toString());
						pstmt.setString(1, newPwd);
						pstmt.setLong(2, num);
						int result = pstmt.executeUpdate();

						if (result == -1) {
							System.out.println("변경 실패!");
						} else {
							System.out.println(result + "행이 변경되었습니다.");
						}
					} else {
						System.out.println("기존 비밀번호와 일치하지 않습니다.");
					}

				}else if(choice == 3) {
					StringBuffer sql = new StringBuffer();
					sql.append("update \"CAFE\" set \"RESIDENCE\" = ?");
					sql.append(" where \"NUM\" = ?");
					
					System.out.println("변경할 회원의 회원번호 입력 : ");
					long num = sc.nextLong();
					sc.nextLine();
					System.out.println("변경할 거주지역 입력 : ");
					String resid = sc.nextLine();
					
					conn = DriverManager.getConnection(url, user, password);
					pstmt = conn.prepareStatement(sql.toString());
					pstmt.setString(1, resid);
					pstmt.setLong(2, num);

					int result = pstmt.executeUpdate();

					if (result == -1) {
						System.out.println("변경 실패!");
					} else {
						System.out.println(result + "행이 변경되었습니다.");
					}
				}else if(choice == 4) {
					StringBuffer sql = new StringBuffer();
					sql.append("update \"CAFE\" set \"RATING\" = ?");
					sql.append(" where \"NUM\" = ?");

					System.out.println("변경할 회원의 회원번호 입력 : ");
					long num = sc.nextLong();
					sc.nextLine();
					System.out.println("변경할  등급 입력(1~5) : ");
					long resid = sc.nextLong();

					if (resid > 5) {
						System.out.println("등급 기준을 초과했습니다.");
					} else {
						conn = DriverManager.getConnection(url, user, password);
						pstmt = conn.prepareStatement(sql.toString());
						pstmt.setLong(1, resid);
						pstmt.setLong(2, num);

						int result = pstmt.executeUpdate();

						if (result == -1) {
							System.out.println("변경 실패!");
						} else {
							System.out.println(result + "행이 변경되었습니다.");
						}
					}
				}else if(choice > 4) {
				System.out.println("잘못 입력하였습니다.");
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
