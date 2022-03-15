package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FoodDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public FoodDAO() {
		String user = "admin";
		String password = "YUYUyuyu25864966?";
		String url = "jdbc:oracle:thin:@DB202112211148_medium?TNS_ADMIN=/Users/kim-yurim/Documents/workspace/Wallet_DB202112211148/";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("클래스 로딩 성공!");
			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(String food) throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into FOOD (NUM, MENU, VOTE) values(FOOD_SEQ.nextval, ?, 1)");
		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setString(1, food);
		int result = pstmt.executeUpdate();

		if (result == -1) {
			System.out.println("투표 실패!");
			System.out.println();
		} else {
			System.out.println(result + "표가 등록되었습니다.");
			System.out.println();
		}
	}

	public void select() throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from \"FOOD\"");
		pstmt = conn.prepareStatement(sql.toString());
		rs = pstmt.executeQuery();
		while (rs.next()) {
			System.out.print(rs.getInt("NUM") + ".");
			System.out.print(rs.getString("MENU") + "---->");
			System.out.println(rs.getInt("VOTE") + "표");
		}
		System.out.println();
	}

	public void update(String food) throws SQLException {
		StringBuffer sql = new StringBuffer();
		sql.append("update \"FOOD\" set \"VOTE\" = vote+1 where \"MENU\" = ?");
		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setString(1, food);
		int result = pstmt.executeUpdate();

		if (result == -1) {
			System.out.println("등록 실패!");
		} else {
			System.out.println(result + "표가 등록되었습니다.");
			System.out.println();
		}
	}
	


}
