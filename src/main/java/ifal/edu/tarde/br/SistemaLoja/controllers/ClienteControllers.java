package ifal.edu.tarde.br.SistemaLoja.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ifal.edu.tarde.br.SistemaLoja.model.Cliente;
import ifal.edu.tarde.br.SistemaLoja.repositories.ClienteRepository;

@Controller
@RequestMapping("/cliente")
public class ClienteControllers {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping(value= "/list")
	public String list(ModelMap model) {
		List<Cliente> clientes = clienteRepository.findAll();
		model.addAttribute("clienteList", clientes);
		
		return "cliente/list";
	}
	@RequestMapping(value = { "/novoForm" }, method = RequestMethod.GET)
	public String newClient(ModelMap model) {
		
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		model.addAttribute("edit", false);
		
		return "cliente/form";
	}

    @PostMapping(value = "/save")
    public String saveClient(@RequestParam Map<String, String> params) {
    	Cliente cliente =  new Cliente();
    	
    	cliente.setNomeCompleto(params.get("nomeCompleto"));
    	cliente.setEmail(params.get("email"));
    	
    	clienteRepository.saveAndFlush(cliente);
    	return "redirect: cliente/list";
    }
}
