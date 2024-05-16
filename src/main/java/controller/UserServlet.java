package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("register")) {
			User u = new User();
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			UserDao.addUser(u);
			
			request.setAttribute("fname", request.getParameter("fname"));
			request.setAttribute("lname", request.getParameter("lname"));
			request.setAttribute("email", request.getParameter("email"));
			request.setAttribute("mobile", request.getParameter("mobile"));
			request.setAttribute("password", request.getParameter("password"));
			request.getRequestDispatcher("Home.jsp").forward(request, response);
		}
		
		else if(action.equalsIgnoreCase("show")) {
			User u = new User();
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setPassword(request.getParameter("password"));
			
			request.setAttribute("msg", "User List");
			request.getRequestDispatcher("Users.jsp").forward(request, response);
			
		}
		
	}

}
