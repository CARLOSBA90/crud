package com.cepr.principal.modelo;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cuenta")
public class Cuenta {
	
	@Id
	@Column(unique=true, name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(unique=true, updatable = false, nullable = false)
	private long numeroCuenta;
	
	@Column
	private BigDecimal saldo;
	
	@Column
	@Enumerated(EnumType.STRING)
	private TipoMoneda tipoMoneda;
	
	@Column
	@Enumerated(EnumType.STRING)
	private TipoCuenta tipoCuenta;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(long numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public TipoMoneda getTipo() {
		return tipoMoneda;
	}

	public void setTipo(TipoMoneda tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(TipoCuenta tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
    
	

}
