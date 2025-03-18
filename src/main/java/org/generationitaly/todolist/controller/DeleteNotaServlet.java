package org.generationitaly.todolist.controller;

import java.io.IOException;
import org.generationitaly.todolist.repository.impl.NotaRepositoryImpl;
import org.generationitaly.todolist.repository.NotaRepository;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/note")
public class DeleteNotaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private NotaRepository notaRepository = new NotaRepositoryImpl();

	/**
	 * Default constructor.
	 */

	public DeleteNotaServlet() {
		super();
		System.out.println("constructor 'DeletePersonaServlet()' invoked!");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("method 'DeleteNotaServlet.doPost(request, response)' invoked!");
		// <input name="id" type="hidden" value="<%= persona.getId() %>">
		long id = Long.parseLong(request.getParameter("id"));
		System.out.println("param 'id': " + id);
		notaRepository.deleteById(id);
		response.sendRedirect("nota");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
