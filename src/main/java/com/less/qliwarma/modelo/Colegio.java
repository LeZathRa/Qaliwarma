/*package com.less.qliwarma.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="colegios")
public class Colegio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_colegio;
	
	@Column(name="nombre_colegio")
	private String nombre_colegio;
	
	@Column(name="imagen_colegio")
	private String imagen_colegio;
	
	@Column(name="ubicacion")
	private String ubicacion;
	
	@Column(name="telefono")
	private String telefono;
	
	@OneToMany(mappedBy = "colegio")
	private List<Encargado> encargados;
	
	public Colegio(){
		
	}
	public Colegio(Integer id_colegio, String nombre_colegio,String imagen_colegio, String ubicacion, String telefono,
			List<Encargado> encargados) {
		super();
		this.id_colegio = id_colegio;
		this.nombre_colegio = nombre_colegio;
		this.imagen_colegio = imagen_colegio;
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.encargados = encargados;
	}
	
	public Integer getId_colegio() {
		return id_colegio;
	}
	public void setId_colegio(Integer id_colegio) {
		this.id_colegio = id_colegio;
	}
	public String getNombre_colegio() {
		return nombre_colegio;
	}
	public void setNombre_colegio(String nombre_colegio) {
		this.nombre_colegio = nombre_colegio;
	}
	public String getImagen_colegio() {
		return imagen_colegio;
	}
	public void setImagen_colegio(String imagen_colegio) {
		this.imagen_colegio = imagen_colegio;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public List<Encargado> getEncargados() {
		return encargados;
	}
	public void setEncargados(List<Encargado> encargados) {
		this.encargados = encargados;
	}
	
}
*/