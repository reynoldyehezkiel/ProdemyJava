package com.tutorial.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.telusko.web.dao.AlienDAO;
import com.tutorial.web.model.Alien;

/**
 * Servlet implementation class AddAlienController
 */
public class AddAlienController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");
		String tech = request.getParameter("tech");
		AlienDAO dao = new AlienDAO();
		Alien a = dao.addAlien(aid,aname,tech);
		
		// RequestDispatcher
//		request.setAttribute("alien", a);
//		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
//		rd.forward(request, response);
		
		// HttpSession
		HttpSession session = request.getSession();
		session.setAttribute("alien", a);
		response.sendRedirect("addAlien.jsp");
	}

}
