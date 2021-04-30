package com.grupo4.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grupo4.demo.models.entity.Trabajador;
import com.grupo4.demo.models.entity.DAO.ITrabajadorDAO;

@Controller
@RequestMapping("/trabajadores")
public class TrabajadorController {

	//contiene los metodos crud∟
	@Autowired
	private ITrabajadorDAO trabajadordao;
	
	@RequestMapping(value="/listado",method = RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "trabajadores registrados");
		model.addAttribute("trabajadores", trabajadordao.findAll());
		return "trabajadores/listado";
	}
	
	@RequestMapping(value="/formulario")
	public String formularioTrabajadores(Model model) {
		Trabajador trabajador = new Trabajador();
		model.addAttribute("titulo", "formulario trabajadores");
		model.addAttribute("trabajador", trabajador);
		return "trabajadores/formulario";
	}
	
	
	
	
	
}
