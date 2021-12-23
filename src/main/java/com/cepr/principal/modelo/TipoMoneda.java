package com.cepr.principal.modelo;
import java.math.BigDecimal;
public enum TipoMoneda {
	PESO(new BigDecimal("1000")), 
	DOLAR(new BigDecimal("300")), 
	EURO(new BigDecimal("150"));

	private BigDecimal descubierto;

	TipoMoneda(BigDecimal descubierto) {
		this.descubierto = descubierto;
	}

	public BigDecimal getDescubierto() {
		return descubierto;
	}

}