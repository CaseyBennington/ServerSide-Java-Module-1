package com.example.web;

import com.example.model.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BeerSelect extends HttpServlet{
    /**
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws ServletException
     */
    @Override
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) 
			throws IOException, ServletException {
		response.setContentType("text/html");		
		PrintWriter out = response.getWriter();		
		out.println("Beer Selection Advice");		
		String c = request.getParameter("color");
		
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		}
	}