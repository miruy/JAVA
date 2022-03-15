package Food2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FoodDAO {

	private OjdbcTemplate ojdbcTemplate;

	public FoodDAO(OjdbcTemplate ojdbcTemplate) {
		this.ojdbcTemplate = ojdbcTemplate;
	}

	public int insert(FoodVO fv) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into FOOD (NUM, MENU, VOTE) values(FOOD_SEQ.nextval, ?, 1)");
		Connection conn = ojdbcTemplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, fv.getMenu());
			result = pstmt.executeUpdate();

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
		return result;
	}

	public ArrayList<FoodVO> select() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from \"FOOD\"");
		Connection conn = ojdbcTemplate.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<FoodVO> al = new ArrayList<FoodVO>();

		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();

			while(rs.next()) {
				FoodVO fv = new FoodVO(
						rs.getInt("NUM"),
						rs.getString("MENU"),
						rs.getInt("VOTE"));
				al.add(fv);
			}

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
		return al;
	}

	public int update(String food) {
		StringBuffer sql = new StringBuffer();
		sql.append("update \"FOOD\" set \"VOTE\" = vote+1 where \"MENU\" = ?");
		Connection conn = ojdbcTemplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, food);
			result = pstmt.executeUpdate();
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
		return result;
	}
}
