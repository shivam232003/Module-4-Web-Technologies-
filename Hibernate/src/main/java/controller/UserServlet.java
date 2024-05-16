package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


import dao.UserDao;
import model.User;

import javax.servlet.http.HttpServletResponse;

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

	/**
	 * @see HttpServlet#doGet(HttpServletrequestuest requestuest, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletrequestuest requestuest, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("register")) {
			User u = new User();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			UserDao.addUser(u);
			request.setAttribute("msg", "data inserted");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
		else if(action.equalsIgnoreCase("login")) {
			
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			boolean flag = UserDao.loginUser(email, password);
			
			if(flag == true) {
				User u = new User();
				u.setName(request.getParameter("name"));
				u.setContact(Long.parseLong(request.getParameter("contact")));
				u.setAddress(request.getParameter("address"));
				u.setEmail(request.getParameter("email"));
				u.setPassword(request.getParameter("password"));
			}
		}
	}

}
