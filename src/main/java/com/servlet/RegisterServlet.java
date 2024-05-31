package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String name =req.getParameter("name");
		String dob =req.getParameter("dob");
		String gender =req.getParameter("qlfy");
		String qlfy =req.getParameter("gender");
		String[] hobbies =req.getParameterValues("hb");
		List al = Arrays.asList(hobbies);
		 
		pw.println( "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>");
		
		pw.println("<div style='width:600px; margin:auto;margin-top:60px'>");
		pw.println("<table class='table table-hover table-striped'>");
		pw.println("<tr>");
		pw.println("<td>Name</td>");
		pw.println("<td>"+name+"</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>DOB</td>");
		pw.println("<td>"+dob+"</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Gender</td>");
		pw.println("<td>"+gender+"</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Qualification</td>");
		pw.println("<td>"+qlfy+"</td>");
		pw.println("</tr>");
		pw.println("<tr>");
		pw.println("<td>Hobbies</td>");
		pw.println("<td>"+al+"</td>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.println("</div>");
		pw.close();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
