package member.model.dao;

import member.model.vo.Member;
import static common.JDBCTemplate.*;

import java.sql.*;

public class MemberDao {
	public MemberDao() {
	}

	public Member loginCheck(Connection conn, String userId, String userPwd) {
		Member member = null; // 실패하면 null로 처리해야하기 때문에 객체 생성을 여기서 하지 않는다.
		PreparedStatement pstmt = null;//로그인이 실패 = null, 아니면 로그인 성공!
		ResultSet rset = null;

		String query = "select * from member where userid = ? and userpwd = ?";

		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);

			rset = pstmt.executeQuery();

			if (rset.next()) {
				member = new Member(); // 로그인 성공했을 때 객체 생성되야하기 때문에 if문 안에서 생성해줘야한다.

				member.setUserId(userId); // member.setUserId(rset.getString("userid"));
				member.setUserPwd(userPwd); // member.setUserPwd(rset.getString("userpwd"));
				member.setUserName(rset.getString("USERNAME"));
				member.setGender(rset.getString("GENDER"));
				member.setAge(rset.getInt("AGE"));
				member.setPhone(rset.getString("PHONE"));
				member.setEmail(rset.getString("EMAIL"));
				member.setHobby(rset.getString("HOBBY"));
				member.setEtc(rset.getString("ETC"));
				member.setEnrollDate(rset.getDate("ENROLL_DATE"));
				member.setLastModified(rset.getDate("LASTMODIFIED"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(rset);
			close(pstmt);
		}

		return member;
	}
	
	
}