package exam03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CafeManager {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public CafeManager() {}

	public void connection() throws ClassNotFoundException {
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

	public void insert(String id, String pwd, String resid, long rat) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql = new StringBuffer();
		sql.append("insert into \"CAFE\" (\"NUM\", \"ID\", \"PASSWORD\", \"RESIDENCE\", \"ENROLLMENT\", \"RATING\")");
		sql.append("values(\"CAFE_SEQ\".nextval, ?, ?, ?, systimestamp, ?)");

		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		pstmt.setString(3, resid);
		pstmt.setLong(4, rat);

		int result = pstmt.executeUpdate();

		if (result == -1) {
			System.out.println("삽입 실패");
			System.out.println();
		} else {
			System.out.println(result + "행이 삽입되었습니다.");
			System.out.println();
		}
	}
	public void selectAll() throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from \"CAFE\"");

		pstmt = conn.prepareStatement(sql.toString());
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
	}

	public void select1(String id) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql = new StringBuffer();
		sql.append("select \"NUM\", \"ID\", \"PASSWORD\", \"RESIDENCE\", \"ENROLLMENT\", \"RATING\" from \"CAFE\"");
		sql.append(" where \"ID\" =?");

		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setString(1, id);
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
	}

	public void select2(String resid) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql = new StringBuffer();
		sql.append("select \"NUM\", \"ID\", \"PASSWORD\", \"RESIDENCE\", \"ENROLLMENT\", \"RATING\" from \"CAFE\"");
		sql.append(" where \"RESIDENCE\" =?");

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
	}

	public void select3(String enrom) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from \"CAFE\"");
		sql.append(" where to_date(\"ENROLLMENT\" ,'YY/MM/DD') =?");

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
	}

	public void update1(int num, String id) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql = new StringBuffer();
		sql.append("update \"CAFE\" set \"ID\" = ?");
		sql.append(" where \"NUM\" = ?");

		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setString(1, id);
		pstmt.setLong(2, num);

		int result = pstmt.executeUpdate();

		if (result == -1) {
			System.out.println("변경 실패!");
			System.out.println();
		} else {
			System.out.println(result + "행이 변경되었습니다.");
			System.out.println();
		}
	}

	public void update2(int num, String oriPwd, String newPwd) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql2 = new StringBuffer();
		sql2.append("select \"PASSWORD\" from \"CAFE\"");
		sql2.append(" where \"NUM\" = ?");

		pstmt = conn.prepareStatement(sql2.toString());
		pstmt.setLong(1, num);
		ResultSet rs2 = pstmt.executeQuery();

		String sqlPw = " ";

		while (rs2.next()) {
			sqlPw = rs2.getString("PASSWORD");
		}

		if (sqlPw.equals(oriPwd)) {

			StringBuffer sql = new StringBuffer();
			sql.append("update \"CAFE\" set \"PASSWORD\" = ?");
			sql.append(" where \"NUM\" = ?");

			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newPwd);
			pstmt.setLong(2, num);
			int result = pstmt.executeUpdate();

			if (result == -1) {
				System.out.println("변경 실패!");
				System.out.println();
			} else {
				System.out.println(result + "행이 변경되었습니다.");
				System.out.println();
			}
		} else {
			System.out.println("기존 비밀번호와 일치하지 않습니다.");
			System.out.println();
		}
	}

	public void update3(int num, String resid) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql = new StringBuffer();
		sql.append("update \"CAFE\" set \"RESIDENCE\" = ?");
		sql.append(" where \"NUM\" = ?");

		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setString(1, resid);
		pstmt.setLong(2, num);

		int result = pstmt.executeUpdate();

		if (result == -1) {
			System.out.println("변경 실패!");
			System.out.println();
		} else {
			System.out.println(result + "행이 변경되었습니다.");
			System.out.println();
		}
	}

	public void update4(int num, Long enrom) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql = new StringBuffer();
		sql.append("update \"CAFE\" set \"RATING\" = ?");
		sql.append(" where \"NUM\" = ?");

		if (enrom > 5) {
			System.out.println("등급 기준을 초과했습니다.");
			System.out.println();
		} else {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setLong(1, enrom);
			pstmt.setLong(2, num);

			int result = pstmt.executeUpdate();

			if (result == -1) {
				System.out.println("변경 실패!");
				System.out.println();
			} else {
				System.out.println(result + "행이 변경되었습니다.");
				System.out.println();
			}
		}
	}

	public void delete(int num, String pwd) throws SQLException, ClassNotFoundException {
		connection();
		StringBuffer sql2 = new StringBuffer();
		sql2.append("select \"PASSWORD\" from \"CAFE\"");
		sql2.append(" where \"NUM\" = ?");

		pstmt = conn.prepareStatement(sql2.toString());
		pstmt.setLong(1, num);
		ResultSet rs = pstmt.executeQuery();
		String sqlPwd = " ";

		while (rs.next()) {
			sqlPwd = rs.getString("PASSWORD");
		}

		if (sqlPwd.equals(pwd)) {
			String sql = "delete from \"CAFE\" where \"NUM\" = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, num);

			int result = pstmt.executeUpdate();

			if (result == -1) {
				System.out.println("삭제 실패!");
				System.out.println();
			} else {
				System.out.println(result + "행이 삭제되었습니다.");
				System.out.println();
			}

		} else {
			System.out.println("기존 비밀번호와 일치하지 않습니다.");
			System.out.println();
		}

	}

}