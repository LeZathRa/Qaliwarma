/*package com.less.qliwarma.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.less.qliwarma.interfaces.CategoriaRepository;
import com.less.qliwarma.modelo.Categoria;



@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    @Override
    public Optional<Categoria> getCategoria(Integer idCategoria) {
        return categoriaRepository.findById(idCategoria);
    }
    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaRepository.save(categoria);
    }
    @Override
    public void eliminarCategoria(Integer idCategoria) {
        categoriaRepository.deleteById(idCategoria);
    }
}
*/