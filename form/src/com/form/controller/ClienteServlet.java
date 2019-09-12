package com.form.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.form.entidade.Cliente;
import com.form.persistence.ClienteDAO;
import com.form.validacao.Validation;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

@WebServlet("/ClienteServlet")
public class ClienteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			Validation validation = new Validation();
			
			Cliente cliente = new Cliente();

			cliente.setNome(req.getParameter("nome"));
			cliente.setCpf(req.getParameter("cpf"));
			cliente.setRg(req.getParameter("rg"));
			cliente.setSexo(req.getParameter("sexo"));
			cliente.setCorrentista(req.getParameter("correntista"));
			cliente.setSeguros(req.getParameterValues("seguro"));
			cliente.setDiasVisita(req.getParameterValues("visitas"));

			validation.validacao(cliente);
			
			ArrayList<String> error = validation.validacao(cliente);
			
			if (error.size() > 0) {
				
				StringBuffer erros = new StringBuffer();
				for (String valor : error) {
					erros.append(valor);
					erros.append(", ");
				}
				
				req.setAttribute("mensagem",erros.toString());
				req.getRequestDispatcher("/cadastro.jsp").forward(req, resp);
			}else {
				
				ClienteDAO dao = new ClienteDAO();
				dao.criar(cliente);
				req.setAttribute("mensagem", "Dados Gravados");
				req.getRequestDispatcher("/index.jsp").forward(req, resp);
			}
			

		} catch (Exception e) {
			req.setAttribute("mensagem", e.getMessage());
		} 
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		processRequest(req, resp);
	}

}
