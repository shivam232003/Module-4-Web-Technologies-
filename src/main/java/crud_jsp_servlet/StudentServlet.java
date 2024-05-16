package crud_jsp_servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StudentServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("register")) {
			
			Student s = new Student();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setMobile(request.getParameter("mobile"));
			s.setGender(request.getParameter("gender"));
			s.setPassword(request.getParameter("password"));
			System.out.println(s);
			StudentDao.addStudent(s);
			response.sendRedirect("stu-login.jsp");
			
		}
		
		else if(action.equalsIgnoreCase("login")) {
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
			boolean flag = StudentDao.checkEmail(email);
			
			if(flag == true) {
				Student s = StudentDao.studentLogin(email, password);
				if(s == null) {
					request.setAttribute("msg", "Incorrect Password !");
					request.getRequestDispatcher("stu-login.jsp").forward(request, response);
				}
				else {
					HttpSession session = request.getSession();
					session.setAttribute("student", s);
					request.getRequestDispatcher("stu-home.jsp").forward(request, response);
				}
			}
			else {
				request.setAttribute("msg1", "Account not registered");
				request.getRequestDispatcher("stu-login.jsp").forward(request, response);
			}
		}
		
		
	}

}
