package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IArticuloDAO;
import com.example.demo.dao.IFabricanteDAO;
import com.example.demo.dto.Articulo;
import com.example.demo.dto.Fabricante;

@Service
public class ArticuloServiceImpl implements IArticuloService{

	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo articuloXID(Integer codigo) {
		
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Integer codigo) {
		
		iArticuloDAO.deleteById(codigo);
		
	}
}
