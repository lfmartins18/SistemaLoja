package ifal.edu.tarde.br.SistemaLoja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifal.edu.tarde.br.SistemaLoja.model.Produto;
import ifal.edu.tarde.br.SistemaLoja.repositories.ProdutoRepository;

@Controller
@RequestMapping("/produto")
public class ProdutoControllers {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping(value= "/list1")
	public String list(ModelMap model) {
		List<Produto> produtos = produtoRepository.findAll();
		model.addAttribute("clienteList", produtos);
		
		return "produto/list1";
	}
}
