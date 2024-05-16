package Validation_JSP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FormValidationServlet")
public class FormValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		boolean isValid = true;
		String errorMsg = "";

		if (!fname.matches("[a-zA-Z]+")) {
			errorMsg += "First Name must contain only alphabets.";
			isValid = false;
		}

		if (!lname.matches("[a-zA-Z]+")) {
			errorMsg += "Last Name must contain only alphabets.";
			isValid = false;
		}

		if (!mobile.matches("[0-9]+")) {
			errorMsg += "Mobile must contain 10 numbers.<br>";
			isValid = false;
		}

		if (!email.matches("[a-zA-Z]+")) {
			errorMsg += "Invalid email format.<br>";
			isValid = false;
		}

		if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%&_]).{8,}$")) {
			errorMsg += "Password must contain at least one uppercase letter, one lowercase letter, one digit, one special character from @, #, $, %, _, &, and be at least 8 characters long.<br>";
			isValid = false;
		}

		if (isValid) {
			out.println("<h2>Form submitted successfully!</h2>");
		}

		else {
			out.println("<h2>Form submission failed:</h2>");
			out.println(errorMsg);
		}

	}
}
