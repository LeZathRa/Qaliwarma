package com.less.qliwarma.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.less.qliwarma.interfaces.IUsuario;
import com.less.qliwarma.modelo.Usuario;



@Service
public class UsuarioServicio implements UserDetailsService{
	
	@Autowired
	private IUsuario repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		Usuario user = repo.findByNombre(username);
		
		List<GrantedAuthority> rol = new ArrayList<>();
		//rol.add(new SimpleGrantedAuthority(user.getRol()));
		
		UserDetails userDet = new User(user.getNombre(),user.getClave(), rol);
		
		return userDet;
	}
	
}

