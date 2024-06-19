/*package com.less.qliwarma.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.less.qliwarma.interfaces.ProductoRepository;
import com.less.qliwarma.modelo.Producto;


@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
		
	}

	@Override
	public Optional<Producto> get(Integer id_producto) {
		return productoRepository.findById(id_producto);
	}
	
	@Override
	public void delete(Integer id_producto) {
		productoRepository.deleteById(id_producto);
	}
}

*/