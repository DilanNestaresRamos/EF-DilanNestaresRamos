package com.ef.dilannestares.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="Reserva")
@Entity
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationTye.IDENTITY)
	private Integer idReserva;
	private Double Costo;
	
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	public Double getCosto() {
		return Costo;
	}
	public void setCosto(Double costo) {
		Costo = costo;
	}
	
	
}
