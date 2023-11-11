package com.example.demo.frontend.individualE05.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.frontend.individualE05.dto.ProductoDTO;
import com.example.demo.frontend.individualE05.service.ICrudService;

@Controller
@RequestMapping("producto")
public class ControladorProducto {

	@Autowired
	private ICrudService servicio;

	// http://localhost:8081/producto/listar/REST
	@GetMapping("listar/REST")
	public String listarREST(Model model) {
		List<ProductoDTO> productos = servicio.findAllREST();
		model.addAttribute("productos", productos);
		return "rest/index";
	}

	// http://localhost:8081/producto/listar/nuevo/REST
	@GetMapping("listar/nuevo/REST")
	public String agregarREST(Model model) {
		model.addAttribute("producto", new ProductoDTO());
		return "rest/form";
	}

	// http://localhost:8081/producto/REST/id
	@GetMapping("editar/REST/{id}")
	public String editarREST(@PathVariable int id, Model model) {
		ProductoDTO producto = servicio.findByIdREST(id);
		model.addAttribute("producto", producto);
		return "rest/form";
	}

	// http://localhost:8081/producto/grabar/REST
	@PostMapping("grabar/REST")
	public String saveREST(@Valid ProductoDTO p, Model model) {
		servicio.saveREST(p);
		return "redirect:/producto/listar/REST";
	}

	// http://localhost:8081/producto/eliminar/id
	@GetMapping("eliminar/REST/{id}")
	public String deleteREST(@PathVariable int id, Model model) {
		servicio.deleteREST(id);
		return "redirect:/producto/listar/REST";
	}

}
