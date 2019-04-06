import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycleServlet extends HttpServlet {
	public LifeCycleServlet() {
		System.out.println("Default constructor called");
	}
	@Override
	public void init(ServletConfig config) {	
	    System.out.println("Init method called");
	}
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res ){
		System.out.println("Service method");
	}
	@Override 
	public void destroy() {
		System.out.println("Servlet is going to Destroy");
	}
}
