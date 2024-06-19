/*package com.less.qliwarma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.less.qliwarma.interfaces.EncargadoRepository;
import com.less.qliwarma.modelo.Encargado;



@Service
public class EncargadoServiceImpl implements EncargadoService{
	
	@Autowired
	private EncargadoRepository encargadoRepository;
	
	@Override
	public Encargado save(Encargado encargado) {
		return encargadoRepository.save(encargado);
	}
	
	@Override
	public Optional<Encargado> get(Integer id_encargado) {
		return encargadoRepository.findById(id_encargado);
	}

	@Override
	public void delete(Integer id_encargado) {
		encargadoRepository.deleteById(id_encargado);
	}

	@Override
	public List<Encargado> getAllEncargados() {
		return encargadoRepository.findAll();
	}

}
*/