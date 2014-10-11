package com.example.web;

import com.example.model.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WineSelect extends HttpServlet{
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
		out.println("Wine Selection Advice");		
		String c = request.getParameter("color");
		
		WineExpert be = new WineExpert();
		List result = be.getBrands(c);
		request.setAttribute("styles", result);
		RequestDispatcher view = request.getRequestDispatcher("wine_result.jsp");
		view.forward(request, response);
		}
	}