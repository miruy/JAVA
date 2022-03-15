package StudentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AchievDao {

	private JdbcTamplate jdbcTamplate;

	public AchievDao(JdbcTamplate jdbcTamplate) {
		this.jdbcTamplate = jdbcTamplate;
	}

	public int insert(String name, String subject, int score, String grade) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into ACHIEV (SCORE_NUM, SCORE , GRADE, STUDENT_ID, SUBJECT_NUM)");
		sql.append("values(ACHIEV_SEQ.nextval, ?, ?,");
		sql.append(" (select STUDENT_ID from STUDENT where STUDENT_NAME = ?),");
		sql.append(" (select SUBJECT_NUM from SUBJECT where SUBJECT_NAME = ?))");
		Connection conn = jdbcTamplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, score);
			pstmt.setString(2, grade);
			pstmt.setString(3, name);
			pstmt.setString(4, subject);
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

	public int update(String name, String subject, int score, String grade) {
		StringBuffer sql = new StringBuffer();
		sql.append("update ACHIEV set SCORE = ?, GRADE = ? where SUBJECT_NUM =");
		sql.append(" (select SUBJECT_NUM from SUBJECT where SUBJECT_NAME = ?");
		sql.append("and STUDENT_ID = (select STUDENT_ID from STUDENT where STUDENT_NAME = ?))");
		Connection conn = jdbcTamplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, score);
			pstmt.setString(2, grade);
			pstmt.setString(3, subject);
			pstmt.setString(4, name);
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

	public ArrayList<AchievVo> select() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from ACHIEV");
		Connection conn = jdbcTamplate.getConnection();
		ArrayList<AchievVo> al = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AchievVo achvo = new AchievVo(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				al.add(achvo);
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
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return al;
	}

	public ArrayList<AchievVo> selectName(String name) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from ACHIEV where STUDENT_ID = ");
		sql.append("(select STUDENT_ID from STUDENT where STUDENT_NAME = ?)");
		Connection conn = jdbcTamplate.getConnection();
		ArrayList<AchievVo> al = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AchievVo achvo = new AchievVo(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				al.add(achvo);
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
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return al;
	}

	public ArrayList<AchievVo> selectId(int id) {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from ACHIEV where STUDENT_ID = ?");
		Connection conn = jdbcTamplate.getConnection();
		ArrayList<AchievVo> al = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				AchievVo achvo = new AchievVo(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
				al.add(achvo);
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
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return al;
	}

}
