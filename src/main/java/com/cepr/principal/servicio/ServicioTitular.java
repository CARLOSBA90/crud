package com.cepr.principal.servicio;
import java.util.List;
import java.util.Optional;

import com.cepr.principal.modelo.Mensaje;
import com.cepr.principal.modelo.Titular;
import com.cepr.principal.modelo.personaFisica;
import com.cepr.principal.modelo.personaJuridica;

public interface ServicioTitular {
	List<Titular> listTitular();
	Mensaje saveTitular(Titular titular);
	Boolean deleteTitular(int id);
	Iterable<Titular> listFisica();
	Iterable<Titular> listJuridica();
	boolean updateFisica(Long id, personaFisica titular);
	boolean updateJuridica(Long id, personaJuridica titular);
	Optional<personaFisica> findFisicaById(Long idTitular);
	Optional<personaJuridica> findJuridicaById(Long idTitular);

}
