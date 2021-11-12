package com.unicesumar.adsis4s2021.dozero.celular;

import javax.persistence.Entity;

import com.unicesumar.adsis4s2021.dozero.base.BaseEntity;

@Entity
public class Celular extends BaseEntity{
	
	private String marca;
	
	public Celular() {
		super();
	}
	
	public String getMarca() {
		return marca;
	}
		
}
