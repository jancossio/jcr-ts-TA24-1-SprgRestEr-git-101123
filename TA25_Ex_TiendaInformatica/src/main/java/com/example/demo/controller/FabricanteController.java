package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Fabricante;
import com.example.demo.service.FabricanteServiceImpl;


@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/all")
	public List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/add")
	public Fabricante salvarFabricante(@RequestBody Fabricante fabricante) {
		
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/{codigo}")
	public Fabricante fabricanteXID(@PathVariable(name="codigo") Integer codigo) {
		
		Fabricante video_xid= new Fabricante();
		
		video_xid=fabricanteServiceImpl.fabricanteXID(codigo);
				
		return video_xid;
	}
	
	@PutMapping("/{codigo}")
	public Fabricante actualizarFabricante(@PathVariable(name="codigo")Integer codigo,@RequestBody Fabricante fabricante) {
		
		Fabricante articulo_seleccionado= new Fabricante();
		Fabricante articulo_actualizado= new Fabricante();
		
		articulo_seleccionado= fabricanteServiceImpl.fabricanteXID(codigo);
		
		articulo_seleccionado.setNombre(fabricante.getNombre());
		
		articulo_actualizado = fabricanteServiceImpl.actualizarFabricante(articulo_seleccionado);
				
		return articulo_actualizado;
	}
	
	@DeleteMapping("/{codigo}")
	public void eliminarFabricante(@PathVariable(name="codigo")Integer codigo) {
		fabricanteServiceImpl.eliminarFabricante(codigo);
	}
}
