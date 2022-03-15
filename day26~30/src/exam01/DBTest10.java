package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBTest10 {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String user = "tester";
		String password = "1234";
		String url = "jdbc:oracle:thin:@192.168.0.109:1521:xe";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("클래스 로딩 성공!");
			
			StringBuffer sql = new StringBuffer();
			sql.append("update \"INFO\" set \"NAME\"=?, \"ADDRESS\"=? where \"NUM\"=?");
			
			System.out.print("검색할 번호:");
			int searchNum = Integer.parseInt(in.nextLine());
			System.out.print("수정할 이름:");
			String name = in.nextLine();
			System.out.print("수정할 주소:");
			String address = in.nextLine();
			
			conn = DriverManager.getConnection(
					url, 
					user, 
					password);
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setInt(3, searchNum);
			
			int result = pstmt.executeUpdate(); //insert, update, delete
			
			System.out.println(result + "행이 수정되었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
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
