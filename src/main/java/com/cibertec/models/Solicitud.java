package com.cibertec.models;

import jakarta.persistence.*;

@Entity
@Table
public class Solicitud {
     
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column
	private String nombreLector;
	
	@Column
	private String nombreLibro;
	
	@Column
	private String fecha;
	
	@Column
	private String estado;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreLector() {
		return nombreLector;
	}

	public void setNombreLector(String nombreLector) {
		this.nombreLector = nombreLector;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	
	
}
