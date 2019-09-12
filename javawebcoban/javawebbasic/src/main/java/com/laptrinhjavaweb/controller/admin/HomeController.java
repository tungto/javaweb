package com.laptrinhjavaweb.controller.admin;

import javax.imageio.IIOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/admin-home" })
public class HomeController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2686801510274002166L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IIOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IIOException {

	}

}
