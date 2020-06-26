package com.comunidad.api.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "accesovisitante")
public class AccesoVisitante implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date fecha;
	private Long temperatura;
	@OneToOne
	@JoinColumn(unique = true)
	// @JsonIgnoreProperties
	private Visitante visitante;
	private static final long serialVersionUID = 1L;

	public AccesoVisitante() {
		super();
	}

	public AccesoVisitante(Long id, Date fecha, Long temperatura, Visitante visitante) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.temperatura = temperatura;
		this.visitante = visitante;
	}

	@Override
	public String toString() {
		return "AccesoVisitante [id=" + id + ", fecha=" + fecha + ", temperatura=" + temperatura + ", visitante="
				+ visitante + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Long temperatura) {
		this.temperatura = temperatura;
	}

	public Visitante getVisitante() {
		return visitante;
	}

	public void setVisitante(Visitante visitante) {
		this.visitante = visitante;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
