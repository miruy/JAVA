package StudentManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentDao {

	private JdbcTamplate jdbcTamplate;

	public StudentDao(JdbcTamplate jdbcTamplate) {
		this.jdbcTamplate = jdbcTamplate;
	}

	public int insert(StudentVo stuvo) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into STUDENT (STUDENT_ID, STUDENT_NAME) values(STUDENT_SEQ.nextval, ? )");
		Connection conn = jdbcTamplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, stuvo.getName());
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

	public int update(String name, int id) {
		StringBuffer sql = new StringBuffer();
		sql.append("update STUDENT set STUDENT_NAME = ? where STUDENT_ID = ?");
		Connection conn = jdbcTamplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;

		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
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

	public ArrayList<StudentVo> select() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from STUDENT");
		Connection conn = jdbcTamplate.getConnection();
		ArrayList<StudentVo> al = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				StudentVo stuvo = new StudentVo(rs.getInt(1), rs.getString(2));
				al.add(stuvo);
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

	public ArrayList<StudentVo> selectName() {
		StringBuffer sql = new StringBuffer();
		sql.append("select * from ACHIEV where STUDENT_ID =");
		sql.append("(select STUDENT_ID from STUDENT where STUDENT_NAME = ?) ");
		Connection conn = jdbcTamplate.getConnection();
		ArrayList<StudentVo> al = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			rs = pstmt.executeQuery();
			while (rs.next()) {
				// 이름 검색으로 성적까지 출력
				StudentVo stuvo = new StudentVo(rs.getInt(1), rs.getString(2));
				al.add(stuvo);
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

	public int delete(String name) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from ACHIEV where STUDENT_ID = ");
		sql.append("select STUDENT_ID from STUDENT where STUDENT_NAME = ?");
		Connection conn = jdbcTamplate.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, name);
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
