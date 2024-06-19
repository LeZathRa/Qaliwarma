/*package com.less.qliwarma.modelo;


import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank; 


@Entity
@Table(name="categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_categoria;
	
	@Column(name="nombre_categoria")
    @NotBlank(message = "Este campo es necesario, ingrese nombre")
	private String nombre_categoria;
	
	@OneToMany(mappedBy = "categoria")
	private List<Producto> productos;
	
	public Categoria() {
	}
	public Categoria(Integer id_categoria, String nombre_categoria, List<Producto> productos) {
		super();
		this.id_categoria = id_categoria;
		this.nombre_categoria = nombre_categoria;
		this.productos = productos;
	}
	
	public Integer getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(Integer id_categoria) {
		this.id_categoria = id_categoria;
	}

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	@Override
	public String toString() {
		return "Categoria [id_categoria=" + id_categoria + ", nombre_categoria=" + nombre_categoria + ", productos="
				+ productos + "]";
	}
	
}

*/