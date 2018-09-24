package ifal.edu.tarde.br.SistemaLoja.relatorio;

import java.util.List;

import ifal.edu.tarde.br.SistemaLoja.model.Produto;

public class Relatorio {
	
	private Double maiorPreco = Double.NEGATIVE_INFINITY;
	private Double menorPreco = Double.POSITIVE_INFINITY;
	
	
	public void gerarRelatorioDePreco(List<Produto> produtos) {
		for (Produto produto : produtos) {
			if (produto.getValorProduto() > maiorPreco) {
				maiorPreco = produto.getValorProduto();
			} 
			
			if(produto.getValorProduto() < menorPreco) {
				menorPreco =produto.getValorProduto();
			}
		}	
	}
	
	public Double getMaiorPreco() {
		return maiorPreco;
	}

	public Double getMenorPreco() {
		return menorPreco;
	}



}
