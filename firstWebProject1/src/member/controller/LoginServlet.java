package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.service.MemberService;
import member.model.vo.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 처리용 컨트롤러
		//1. 전송온 값에 한글이 있다면, 인코딩 처리함(아이디 패스워드 둘다 영문 숫자이기 때문에 패스)
		//2. 전송온 값 꺼내서 변수에 옮기기
		String userId = request.getParameter("userid"/*input태그의 name*/);
		String userPwd = request.getParameter("userpwd");//geParmeter는 문자열로 값을 받기 때문에 문자열로 담는다
		System.out.println(userId + ", " + userPwd);//자바쪽은 수정하면 서버쪽에서 restart시켜줘야 한다.name이 틀리면 null.
		
		//3. model service로 추출한 값 보내고 결과받기
		Member loginMember = new MemberService().loginCheck(userId, userPwd);
		
		//4. 받은 결과를 가지고 성공/실패에 대한 뷰를 선택해서 내보냄
		if(loginMember != null) {
			//로그인 성공시에, 로그인 상태 관리를 위한 세션 객체 생성함
			HttpSession session = request.getSession();
			
			//session.setMaxInactiveInterval(15*60);//15분 자동 로그아웃//설정 하지 않으면 기본 30분이후 로그아웃
			//세션 객체 존재하지 않으면 만들어라[ () 일때]
			//System.out.println("session id : " + session.getId());
			session.setAttribute("loginMember", loginMember);
			//성공에 대한 서비스 요청한 클라이언트에게 뷰를 내보냄
			response.sendRedirect("/first/index.jsp");//상대결로만 쓸 수 있다.
			
		}else {
			//뷰를 지정하고, 뷰로 값도 함께 내보낼 때 사용함
			//절대경로 사용 못 함 (상대경로만 사용할 수 있음)
			//모든 서블릿은 루트(content directory : web)에서 실행되고 있음
			RequestDispatcher view = request.getRequestDispatcher("views/common/error.jsp");
			//뷰에 출력시킬 값을 request 객체에 기록 저장함
			request.setAttribute("message", "로그인 실패! 아이디나 암호를 확인하고 다시 로그인하세요.");//갯수 제한 없다
			//뷰를 내보냄(url이 바뀌지 않는다[대상만 변함])
			view.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("doPost()..");
		doGet(request, response);
	}

}
