import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SQLServlet")
public class SQLServlet extends HttpServlet{

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		List<Student> studs = Arrays.asList(
				new Student(1,"Navin"),
				new Student(2,"Aarti"),
				new Student(3,"Pratik")
		);
		
		request.setAttribute("students", studs);
		RequestDispatcher rd = request.getRequestDispatcher("displaySQL.jsp");
		rd.forward(request, response);
		
	}

	

}
