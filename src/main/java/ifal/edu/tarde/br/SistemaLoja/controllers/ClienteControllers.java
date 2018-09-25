package ifal.edu.tarde.br.SistemaLoja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ifal.edu.tarde.br.SistemaLoja.model.Cliente;
import ifal.edu.tarde.br.SistemaLoja.repositories.ClienteRepository;

@Controller
@RequestMapping
public class ClienteControllers {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping(value= "/list")
	public String list(ModelMap model) {
		List<Cliente> clientes = clienteRepository.findAll();
		model.addAttribute("clienteList", clientes);
		
		return "cliente/list";
	}
}
