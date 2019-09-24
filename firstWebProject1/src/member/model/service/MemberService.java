package member.model.service;

import java.sql.*;
import board.model.dao.MemberDao;
import member.model.vo.Member;
import static common.JDBCTemplate.*;

public class MemberService {
	private MemberDao mdao = new MemberDao();
	public MemberService() {}
	
	public Member loginCheck(String userId, String userPwd) {
		Connection conn = getConnection();
		Member member = mdao.loginCheck(conn, userId, userPwd);
		close(conn);
		return member;
	}
	
	public Member selectMember(String userId) {
		Connection conn = getConnection();
		Member member = mdao.selectOne(conn, userId);
		close(conn);
		return member;
	}
}
