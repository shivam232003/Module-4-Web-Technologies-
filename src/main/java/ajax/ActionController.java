package ajax;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionController
 */
@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ActionController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");

		if (action.equalsIgnoreCase("insert")) {

			StudentBean s = new StudentBean();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setContact(request.getParameter("contact"));
			StDao.insertStudent(s);
			response.sendRedirect("show1.jsp");
		} 
		else if (action.equalsIgnoreCase("edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			StudentBean s = StDao.getDataById(id);
			request.setAttribute("s", s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		} 
		else if (action.equalsIgnoreCase("update")) {
			StudentBean s = new StudentBean();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			s.setContact(request.getParameter("contact"));
			StDao.UpdateData(s);
			response.sendRedirect("show1.jsp");
		}
		else if (action.equalsIgnoreCase("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			StDao.DeleteData(id);
			response.sendRedirect("show1.jsp");
		}

	}
}