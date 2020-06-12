package br.com.eberoliveira.lojaderoupas.business.bean;

import java.util.ArrayList;
import java.util.List;

public class Cadastro_Produtos_Bean {
	
	private List<ProdutosBean> produtos;
	
	public Cadastro_Produtos_Bean() {
		produtos = new ArrayList<>();
			
		produtos.add(novoProduto("Agasalho Infantil",       "Roupas Infantis",
				199.99f, "Agasalho-Infantil.jpg"));
		produtos.add(novoProduto("Agasalho Feminino",      "Roupas Femininas",
				299.99f,"Agasalho-Feminino.jpg"));
		produtos.add(novoProduto("Boot Preto",            "Sapatos Femininos", 
				499f, "Boot-Preto.jpg"));
		produtos.add(novoProduto("Calça Feminina",         "Roupas Femininas",
				129.99f, "Calca-Feminina.jpg"));
		produtos.add(novoProduto("Camisa Floral",         "Roupas Masculinas",
				49.9f, "Camisa-Floral.jpg"));
		produtos.add(novoProduto("Camisa Manga Comprida", "Roupas Masculinas",
				90f, "Camisa-Manga-Comprida.jpg"));
		produtos.add(novoProduto("Camiseta Preta",        "Roupas Masculinas",
				50f, "Camiseta-Preta.png"));
		produtos.add(novoProduto("Camisa Varias Cores",   "Roupas Masculinas",
				99.9f, "Camisa-Varias-Cores.jpg"));
		produtos.add(novoProduto("Camisa Vermelha",       "Roupas Masculinas",
				70f, "Camisa-Vermelha.png"));
		produtos.add(novoProduto("Camiseta Feminina",      "Roupas Femininas",
				69f, "Camiseta-Feminina.jpg"));
		produtos.add(novoProduto("Conjunto Feminino",      "Roupas Femininas",
				88.99f, "Conjunto-Feminino.jpg"));
		produtos.add(novoProduto("Cinto Marron", "         Cintos Masculinos",
				299.99f, "Cinto-Marron.jpg"));
		produtos.add(novoProduto("Kit Terno e Revólver",  "Roupas Masculinas",
				4599.89f, "Kit-Terno-e-Revolver.jpg"));
		produtos.add(novoProduto("Sapato Marron",        "Sapatos Masculinos",
				329.99f, "Sapato-Marron.jpg"));
		produtos.add(novoProduto("Sapato Preto",         "Sapatos Masculinos",
				299.99f, "Sapato-Preto.jpg"));
		produtos.add(novoProduto("Tênis Preto",          "Sapatos Masculinos",
				299.99f, "Tenis-Preto.jpg"));
		produtos.add(novoProduto("Terno Cinza",           "Roupas Masculinas",
				580f, "Terno-Cinza.jpg"));
		produtos.add(novoProduto("Terno Preto",           "Roupas Masculinas",
				590f, "Terno-Preto.jpg"));
		produtos.add(novoProduto("Terno Vermelho",        "Roupas Masculinas",
				790f, "Terno-Vermelho.jpg"));
		produtos.add(novoProduto("Vestido Preto",          "Roupas Femininas",
				189.99f, "Vestido-Preto.jpg"));
	}
	
	private ProdutosBean novoProduto(String nome, String categoria,
			Float preco, String nomeImagem) {
		
		Integer codigo = produtos.size();
		
		ProdutosBean produtoBean = new ProdutosBean();
		produtoBean.setCodigo(codigo);
		produtoBean.setNome(nome);
		produtoBean.setCategoria(categoria);
		produtoBean.setPreco(preco);
		produtoBean.setNomeImagem(nomeImagem);
  
		return produtoBean;
	}

	public List<ProdutosBean> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutosBean> produtos) {
		this.produtos = produtos;
	}
	
	
}		
	
	


