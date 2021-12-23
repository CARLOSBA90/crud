package com.cepr.principal.modelo;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.persistence.InheritanceType;


@Entity
@Table(name = "titular")
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="type")
public abstract class Titular {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 145452563676L;
	@Id
	@Column(unique=true, name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;    // Identificador del registro
	@Column(unique=true, length = 20)
	@Size(min = 3, max = 20)
	private String rut; /// Registro Unico Tributario
	
	
	public Long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}
	

	@Override
	public String toString() {
		return "Titular [id=" + id + ", rut=" + rut + "]";
	}
	
	
	
	
}
