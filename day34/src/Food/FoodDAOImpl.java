package Food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FoodDAOImpl implements FoodDAO {

	private OjdbcTemplate ojdbcTemplate;

	public FoodDAOImpl() throws SQLException {
		ojdbcTemplate = OjdbcTemplate.getInstance();
	}

	public int insert(FoodVO fv) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			StringBuffer sql = new StringBuffer();
			sql.append("insert into FOOD (NUM, MENU, VOTE) values(FOOD_SEQ.nextval, ?, 1)");
			conn = ojdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, fv.getMenu());
			result = pstmt.executeUpdate();

			if (result == -1) {
				System.out.println("투표 실패!");
				System.out.println();
			} else {
				System.out.println(result + "표가 등록되었습니다.");
				System.out.println();
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
		return result;
	}

	public ArrayList<FoodVO> select() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<FoodVO> al = new ArrayList<FoodVO>();

		try {
			StringBuffer sql = new StringBuffer();
			sql.append("select * from \"FOOD\"");
			conn = ojdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();

			while (rs.next()) {
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
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			StringBuffer sql = new StringBuffer();
			sql.append("update \"FOOD\" set \"VOTE\" = vote+1 where \"MENU\" = ?");
			conn = ojdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, food);
			result = pstmt.executeUpdate();

			if (result == -1) {
				System.out.println("등록 실패!");
			} else {
				System.out.println(result + "표가 등록되었습니다.");
				System.out.println();
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
		return result;
	}
}
