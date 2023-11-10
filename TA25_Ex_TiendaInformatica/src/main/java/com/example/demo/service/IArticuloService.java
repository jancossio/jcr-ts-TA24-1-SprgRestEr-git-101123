package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Articulo;

public interface IArticuloService {

	public List<Articulo>listarArticulos();
	
	public Articulo guardarArticulo(Articulo articulo);
	
	public Articulo articuloXID(Integer codigo);
	
	public Articulo actualizarArticulo(Articulo articulo);

	public void eliminarArticulo(Integer codigo);
}
