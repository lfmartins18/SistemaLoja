package ifal.edu.tarde.br.SistemaLoja.relatorio;

import java.util.ArrayList;
import java.util.List;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import ifal.edu.tarde.br.SistemaLoja.model.Produto;


public class RelatorioTest {

	@Test
	public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemCrescente() {
		
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
		
		assertEquals(maiorPrecoEsperado,relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		
	}
	
	@Test
    public void deveEncontrarOMaiorPrecoEMenorPrecoDosProdutosEmOrdemDecrescente() {

	
		Produto celular = new Produto("Samsumg G", 20, 500.0);
		Produto tv = new Produto("LG HD", 20, 400.0);
		Produto dvd = new Produto("A galinha pintadinha V.10", 20, 300.0);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Relatorio relatorio =  new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		Double maiorPrecoEsperado = 500.0;
		Double menorPrecoEsperado = 300.0;
	
		
		assertEquals(maiorPrecoEsperado,relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
    }
    
	@Test
	public void deveEncontarPrecoDeUmUnicoProduto() {

		Produto celular = new Produto("Samsumg G", 20, 500.0);
		
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);

		
		Relatorio relatorio =  new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		Double maiorPrecoEsperado = 500.0;
		Double menorPrecoEsperado = 500.0;
	
		
		assertEquals(maiorPrecoEsperado,relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
    }
	
    @Test
	public void deveEncontarValorAleatorios() {


		Produto celular = new Produto("Samsumg G", 20, 500.0);
		Produto tv = new Produto("LG HD", 20, 600.0);
		Produto dvd = new Produto("A galinha pintadinha V.10", 20, 300.0);
		
		List<Produto> produtos = new ArrayList<>();
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Relatorio relatorio =  new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
		Double maiorPrecoEsperado = 600.0;
		Double menorPrecoEsperado = 300.0;
	
		
		assertEquals(maiorPrecoEsperado,relatorio.getMaiorPreco());
		assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		
    }
    

}
