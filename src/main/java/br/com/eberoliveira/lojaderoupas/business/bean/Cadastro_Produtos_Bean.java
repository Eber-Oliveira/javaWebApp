package br.com.eberoliveira.lojaderoupas.business.bean;

import java.util.ArrayList;
import java.util.List;

public class Cadastro_Produtos_Bean {
	
	private List<ProdutosBean> produtos;
	
	public Cadastro_Produtos_Bean() {
		produtos = new ArrayList<>();	
		
		produtos.add(novoProduto("Camisa Manga Comprida", "Roupas Masculinas", 90f));
		produtos.add(novoProduto("Camiseta Preta",        "Roupas Masculinas", 50f));
		produtos.add(novoProduto("Camisa Floral",         "Roupas Masculinas", 49.9f));
		produtos.add(novoProduto("Camisa Varias Cores",   "Roupas Masculinas", 99.9f));
		produtos.add(novoProduto("Kit Terno e Revólver",  "Roupas Masculinas", 4599.89f));
		produtos.add(novoProduto("Cinto Marron", "         Cintos Masculinos", 299.99f));
		produtos.add(novoProduto("Sapato Marron",        "Sapatos Masculinos", 329.99f));
		produtos.add(novoProduto("Sapato Preto",         "Sapatos Masculinos", 299.99f));
		produtos.add(novoProduto("Calça Feminina",         "Roupas Femininas", 129.99f));
		produtos.add(novoProduto("Vestido Preto",          "Roupas Femininas", 189.99f));
		produtos.add(novoProduto("Agasalho Feminino",      "Roupas Femininas", 299.99f));
		produtos.add(novoProduto("Conjunto Feminino",      "Roupas Femininas", 88.99f));
		produtos.add(novoProduto("Camiseta Feminina",      "Roupas Femininas", 69f));
		produtos.add(novoProduto("Boot Preto",            "Sapatos Femininos", 499f));
		produtos.add(novoProduto("Agasalho Infantil",       "Roupas Infantis", 199.99f));
			
	
	}
	
	private ProdutosBean novoProduto(String nome, String categoria, Float preco) {
		
		Integer codigo = produtos.size();
		
		ProdutosBean produtoBean = new ProdutosBean();
		produtoBean.setCodigo(codigo);
		produtoBean.setNome(nome);
		produtoBean.setCategoria(categoria);
		produtoBean.setPreco(preco);
  
		return produtoBean;
	}

	public List<ProdutosBean> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutosBean> produtos) {
		this.produtos = produtos;
	}
	
	
}		
	
	


