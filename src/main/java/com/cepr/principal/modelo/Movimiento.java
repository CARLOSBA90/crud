package com.cepr.principal.modelo;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cuenta")
public class Movimiento {
	
	
	@Id
	@Column(unique=true, name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	@Size(min = 1, max = 200)
	private final String descripcion;
	
	@Column
	@Enumerated(EnumType.STRING)
	private final TipoCuenta tipoCuenta;
	
	@Column
	@Enumerated(EnumType.STRING)
	private final TipoMoneda tipoMoneda;
	
	@Column
	private final BigDecimal importe;
	
	@Column
    private final Date fechaMovimiento;
	
	@Column
	private final long idCuenta;
	
	
	public Movimiento(String descripcion, TipoCuenta tipoCuenta, TipoMoneda tipoMoneda, BigDecimal importe, long idCuenta) {
		
		this.fechaMovimiento = Date.from(Instant.now());
		this.descripcion = descripcion;
		this.tipoCuenta = tipoCuenta;
		this.tipoMoneda = tipoMoneda;
		this.importe = importe;
		this.idCuenta = idCuenta;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public TipoCuenta getTipoCuenta() {
		return tipoCuenta;
	}


	public TipoMoneda getTipoMoneda() {
		return tipoMoneda;
	}


	public BigDecimal getImporte() {
		return importe;
	}


	public Date getFechaMovimiento() {
		return fechaMovimiento;
	}


	public long getIdCuenta() {
		return idCuenta;
	}
	

}
