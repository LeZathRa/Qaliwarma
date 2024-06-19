/*package com.less.qliwarma.modelo;


import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name="encargados")
public class Encargado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_encargado;
	private String imagen_perfil;
	private String nombre_encargado;
	private String apellido_encargado;
	private String correo;
	private String telefono;
	private LocalDate fechaNacimiento;
	private String sexo;
	private String rol_institucion;
	@ManyToOne
	@JoinColumn(name = "id_colegio")
	private Colegio colegio;
	
	public Encargado() {
	}
	
	public Encargado(Integer id_encargado,String imagen_perfil, String nombre_encargado, String apellido_encargado, String correo,
			String rol_institucion,String telefono, LocalDate fechaNacimiento, String sexo, Colegio colegio) {
		super();
		this.id_encargado = id_encargado;
		this.imagen_perfil = imagen_perfil;
		this.nombre_encargado = nombre_encargado;
		this.apellido_encargado = apellido_encargado;
		this.correo = correo;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.rol_institucion = rol_institucion;
		this.colegio = colegio;
	}
	public Integer getId_encargado() {
		return id_encargado;
	}

	public void setId_encargado(Integer id_encargado) {
		this.id_encargado = id_encargado;
	}
	public String getImagen_perfil() {
		return imagen_perfil;
	}

	public void setImagen_perfil(String imagen_perfil) {
		this.imagen_perfil = imagen_perfil;
	}

	public String getNombre_encargado() {
		return nombre_encargado;
	}

	public void setNombre_encargado(String nombre_encargado) {
		this.nombre_encargado = nombre_encargado;
	}

	public String getApellido_encargado() {
		return apellido_encargado;
	}

	public void setApellido_encargado(String apellido_encargado) {
		this.apellido_encargado = apellido_encargado;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Colegio getColegio() {
		return colegio;
	}

	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}
	public String getRol_institucion() {
		return rol_institucion;
	}

	public void setRol_institucion(String rol_institucion) {
		this.rol_institucion = rol_institucion;
	}

}
*/