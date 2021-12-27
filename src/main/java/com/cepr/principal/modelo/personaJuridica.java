package com.cepr.principal.modelo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "juridica")
@DiscriminatorValue("j")
public class personaJuridica extends Titular implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1342347807L;
	@Column(length = 100)
	@Size(min = 2, max = 100)
	private String razonSocial;
	@Column
	@Range(min = 1880, max = 2022)
	private int anioFundacion;

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getAnioFundacion() {
		return anioFundacion;
	}

	public void setAnioFundacion(int anioFundacion) {
		this.anioFundacion = anioFundacion;
	}

	@Override
	public String toString() {
		return "personaJuridica ["+super.toString()+", razonSocial=" + razonSocial + ", anioFundacion=" + anioFundacion + "]";
	}
	
}
