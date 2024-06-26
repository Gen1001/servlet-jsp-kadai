package forms;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfirmServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String address = request.getParameter("user_address");
		String phone = request.getParameter("phone_number");
		
		name = Objects.toString(name, "");
		email = Objects.toString(email, "");
		address = Objects.toString(address, "");
		phone = Objects.toString(phone, "");
		
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("address", address);
		request.setAttribute("phone", phone);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/pages/confirmPage.jsp");
		dispatcher.forward(request, response);
	}
	
	
}
