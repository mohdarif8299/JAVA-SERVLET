import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BirthdayWish extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");  
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("name");
		pw.print("<h1 style='font-family:cursive;font-size:25px;letter-spacing:2px'>Wishing you a very Happy Birthday </h1>");
		pw.println("<h2 style='font-family:cursive;font-size:25px;letter-spacing:2px;color:#ff7800'> "+name+" </h2>");
	}
}
