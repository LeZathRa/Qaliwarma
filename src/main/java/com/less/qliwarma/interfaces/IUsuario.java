package com.less.qliwarma.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.less.qliwarma.modelo.Usuario;


@Repository
public interface IUsuario extends JpaRepository<Usuario, Integer>{
	Usuario findByNombre(String nombre);

}
