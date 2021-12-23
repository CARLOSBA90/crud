package com.cepr.principal.modelo;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "fisica")
@DiscriminatorValue("f")
public class personaFisica extends Titular implements Serializable {
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1666634533L;
	@Column(length = 12)
	@Range(min = 1, max = 99999999)
	private int cc; ///cedula de ciudadania
	@Column(length = 80)
	@Size(min = 2, max = 80)
	private String nombre;
	@Column(length = 250)
	@Size(min = 2, max = 250)
	private String apellido;

	public int getCc() {
		return cc;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "personaFisica ["+super.toString()+", cc=" + cc + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}
