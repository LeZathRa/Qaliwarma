/*package com.less.qliwarma.modelo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_producto;
	private String nombre;
	private String descripcion;
	private String imagen;
	private Integer cantidad;
	private LocalDateTime fechaCreacion;
    private LocalDateTime fechaUltimaModificacion;
	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private Categoria categoria;
	
	public Producto(Integer id_producto, String nombre, String descripcion, String imagen, Integer cantidad, Categoria categoria,
			LocalDateTime fechaCreacion,LocalDateTime fechaUltimaModificacion) {
		super();
		this.id_producto = id_producto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.cantidad = cantidad;
		this.categoria = categoria;
		this.fechaCreacion = fechaCreacion;
		this.fechaUltimaModificacion=fechaUltimaModificacion;
	}
	
	public Producto() {
	}
	
	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(LocalDateTime fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }
    @PrePersist
    public void onCreate() {
        fechaCreacion = LocalDateTime.now();
        fechaUltimaModificacion = LocalDateTime.now();
    }

    @PreUpdate
    public void onUpdate() {
        fechaUltimaModificacion = LocalDateTime.now();
    }
    public String getFormattedFechaCreacion() {
        if (fechaCreacion != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return fechaCreacion.format(formatter);
        } else {
            return "Fecha de creación no disponible";
        }
    }


    public String getFormattedFechaUltimaModificacion() {
    	if (fechaUltimaModificacion != null) {
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            return fechaUltimaModificacion.format(formatter);
    	} else {
    		return "No hubo cambios";
    	}
    }

	
}
/* */
