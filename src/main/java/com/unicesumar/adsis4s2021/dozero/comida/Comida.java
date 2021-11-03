package com.unicesumar.adsis4s2021.dozero.comida;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comida {

	@Id
	private String id;
	//a
	@Column(nullable = false)
	private String igredientes;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private Integer tempoDePreparo;
	
	public Comida() {
		id = UUID.randomUUID().toString();
	}

	public String getIgredientes() {
		return igredientes;
	}

	public void setIgredientes(String igredientes) {
		this.igredientes = igredientes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comida other = (Comida) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
