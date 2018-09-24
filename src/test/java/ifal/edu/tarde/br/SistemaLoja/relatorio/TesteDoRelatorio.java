package ifal.edu.tarde.br.SistemaLoja.relatorio;

import java.util.ArrayList;
import java.util.List;

import ifal.edu.tarde.br.SistemaLoja.model.Produto;

public class TesteDoRelatorio {

	public static void main(String[] args) {
		Produto celular = new Produto("Samsumg G", 20, 250.0);
		Produto tv = new Produto("LG HD", 20, 300.0);
		Produto dvd = new Produto("A galinha pintadinha V.10", 20, 400.0);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Relatorio relatorio =  new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		Double maiorPrecoEsperado = 400.0;
		Double menorPrecoEsperado = 250.0;
		
		System.out.println( maiorPrecoEsperado.equals(relatorio.getMaiorPreco()));
		System.out.println( menorPrecoEsperado.equals(relatorio.getMenorPreco()));
		
	}
}
