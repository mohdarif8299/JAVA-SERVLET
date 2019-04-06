import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter pw= null;        
		String username = req.getParameter("username");
		        String password = req.getParameter("password");
		   	 pw = res.getWriter();
		        if(username.equals("mohdarif8299@gmail.com")&&password.equals("mohdarif") ){
		        	 pw.print("<h1 style='font-family:fantasy;font-size:20px'>Login Successful</h1>");
		        }
		        else 
		        	pw.println("<strong style='font-family:fantasy;font-size:20px;color:red'>Incorrect Username or Password</strong>");
		        pw.close();
	}
}