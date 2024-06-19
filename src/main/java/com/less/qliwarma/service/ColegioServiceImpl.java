/*package com.less.qliwarma.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.less.qliwarma.interfaces.ColegioRepository;
import com.less.qliwarma.modelo.Colegio;

@Service
public class ColegioServiceImpl implements ColegioService{
	
	@Autowired
	private ColegioRepository colegioRepository;

	@Override
	public List<Colegio> getAllColegios() {
		return colegioRepository.findAll();
	}

	@Override
	public Optional<Colegio> getColegio(Integer id_Colegio) {
		return colegioRepository.findById(id_Colegio);
	}

	@Override
	public void guardarColegio(Colegio colegio) {
		colegioRepository.save(colegio);
	}

	@Override
	public void delete(Integer id_Colegio) {
		colegioRepository.deleteById(id_Colegio);
	}

}
*/