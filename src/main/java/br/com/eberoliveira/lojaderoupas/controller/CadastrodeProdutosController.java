package br.com.eberoliveira.lojaderoupas.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.eberoliveira.lojaderoupas.business.bean.Cadastro_Produtos_Bean;

/**
 * Servlet implementation class CadastrodeProdutosController
 */
@WebServlet("/cadastro-produtos")
public class CadastrodeProdutosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Cadastro_Produtos_Bean produtoBean;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrodeProdutosController() {
        super();
        // TODO Auto-generated constructor stub
        
        produtoBean = new Cadastro_Produtos_Bean();
    }
    
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("produtos", produtoBean.getProdutos());
				
		request.getRequestDispatcher("/cadastro-de-produtos.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
