package StudentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SubjectDao {
	private JdbcTamplate jdbcTamplate;

	public SubjectDao(JdbcTamplate jdbcTamplate) {
		this.jdbcTamplate = jdbcTamplate;
	}

	public int insert(SubjectVo subvo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into SUBJECT (SUBJECT_NUM, SUBJECT_NAME) values(SUBJECT_SEQ.nextval, ?)");
		Connection conn = jdbcTamplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, subvo.getSubjectName());
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
	
	public int update(String subName, int subNum) {
		StringBuffer sql = new StringBuffer();
		sql.append("update SUBJECT set SUBJECT_NUM = ? where SUBJECT_NAME = ?");
		Connection conn = jdbcTamplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, subNum);
			pstmt.setString(2, subName);
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

	public ArrayList<SubjectVo> select() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from SUBJECT");
		Connection conn = jdbcTamplate.getConnection();
		ArrayList<SubjectVo> al = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				SubjectVo subvo = new SubjectVo(rs.getInt(1), rs.getString(2));
				al.add(subvo);
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
	
	public int delete(int subNum) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from SUBJECT where SUBJECT_NUM = ?");
		Connection conn = jdbcTamplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, subNum);
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
