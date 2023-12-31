package com.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class IdFilter
 */
@WebFilter("/addAlien")
public class IdFilter extends HttpFilter implements Filter {
       
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		HttpServletRequest req = (HttpServletRequest) request;
		int aid = Integer.parseInt(request.getParameter("aid"));
		String aname = request.getParameter("aname");
		
		if(aid >= 1 && aname.length() >= 3)		
			chain.doFilter(request, response);
		else if(aid < 1)
			out.print("Id can't be minus or zero");
		else if(aname.length() < 3)
			out.print("Name must be more than 2 characters");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
