package org.generationitaly.todolist.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Time;

import org.generationitaly.todolist.entity.Nota;
import org.generationitaly.todolist.repository.NotaRepository;
import org.generationitaly.todolist.repository.impl.NotaRepositoryImpl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/crea-note")
public class SaveNotaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private NotaRepository notaRepository = new NotaRepositoryImpl();


	/*- private ContattoRepository contattoRepository = ContattoRepositoryImpl.getInstance(); */
	public SaveNotaServlet() {
		super();
		System.out.println("constructor 'SaveNotaServlet()' invoked!");
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("crea-note.jsp");
	    dispatcher.forward(request, response);
		System.out.println("method 'SaveNotaServlet.doGet(request, response)' invoked!");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("method 'SaveNotaServlet.doPost(request, response)' invoked!");
		/*- <input id="input-nome" name="nome" type="text" placeholder="Mario"> */
		String titolo = request.getParameter("corpoTesto");
		/*- <input id="input-cognome" name="cognome" type="text" placeholder="Rossi"> */
		String completata = request.getParameter("completata");

		System.out.println("param 'titolo': " + titolo);
		System.out.println("param 'completata': " + completata);

		Nota nota = new Nota();
		nota.setCorpoTesto(titolo);
		nota.setCompletata(true);

		notaRepository.save(nota);
		response.sendRedirect("nota");
	}

}