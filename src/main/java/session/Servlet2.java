package session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// String name= req.getParameter("name");
		String Value = "";
		String Name = "";
		Cookie cookies[] = req.getCookies();
		for (Cookie cookie : cookies) {
			Name = cookie.getName();
			Value = cookie.getValue();
		}
		PrintWriter printWriter = resp.getWriter();
		printWriter.write("<html><body><h1>Welcome back to the page    " + Value + "   " + " </h1></body></html>");
	}
}
