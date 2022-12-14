package com.ef.dilannestares.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Turista")
@Entity
public class Turista{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTurista;
	private String nombreTurista;
	private Integer nroCelular;
	private String direccion;
	
	public Integer getIdTurista() {
		return idTurista;
	}
	public void setIdTurista(Integer idTurista) {
		this.idTurista = idTurista;
	}
	public String getNombreTurista() {
		return nombreTurista;
	}
	public void setNombreTurista(String nombreTurista) {
		this.nombreTurista = nombreTurista;
	}
	public Integer getNroCelular() {
		return nroCelular;
	}
	public void setNroCelular(Integer nroCelular) {
		this.nroCelular = nroCelular;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
