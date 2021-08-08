package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping(value = "/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://carrefourbr.vtexassets.com/arquivos/ids/7109498-1200-auto?width=1200&height=auto&aspect=true");
		pedido.setUrlProduto("https://www.carrefour.com.br/smartphone-xiaomi-note-8-64gb-moonlight-white-global-mp28480051/p?utm_medium=sem&utm_source=google_pla_3p&utm_campaign=nata&gclid=CjwKCAjw3riIBhAwEiwAzD3TiaMQAf2_0qnQqUJW1_UVi0xN0qT5BmIa064D7efLwJ0k6-zoIesaiRoC1CUQAvD_BwE");
		pedido.setDescricao("uma descrição qualquer para esse produto");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		
		model.addAttribute("pedidos", pedidos);
		
		
		
		return "home";
	}
	

}
