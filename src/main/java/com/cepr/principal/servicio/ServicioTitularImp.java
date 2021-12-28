package com.cepr.principal.servicio;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cepr.principal.modelo.Mensaje;
import com.cepr.principal.modelo.Titular;
import com.cepr.principal.modelo.personaFisica;
import com.cepr.principal.modelo.personaJuridica;
import com.cepr.principal.repositorio.RepositorioFisica;
import com.cepr.principal.repositorio.RepositorioJuridica;
import com.cepr.principal.repositorio.RepositorioTitular;

@Service
public class ServicioTitularImp implements ServicioTitular{
	@Autowired
	private RepositorioTitular titularRep;
	
	@Autowired
	private RepositorioFisica  fisicaRep;
	
	@Autowired
	private RepositorioJuridica juridicaRep;

	@Override
	public List listTitular() {
		return titularRep.findAll();
	}

	@Override
	public Mensaje saveTitular(Titular titular) {
		if(!titularRep.existsByRut(titular.getRut())) { ///DE SER TRUE, NO EXISTE, PROCEDE A GUARDAR
			titularRep.save(titular);
			return new Mensaje("Guardado con exito"); }
			return new Mensaje("RUT duplicado! Registro no valido");
	}

	@Override
	public Boolean deleteTitular(int id) {
		if(titularRep.existsById((long)id))
   		{titularRep.deleteById((long)id);
   		 return true;}
		return false;
	}

	@Override
	public List listFisica() {
		return fisicaRep.findAll();
	}

	@Override
	public List listJuridica() {
		return juridicaRep.findAll();
	}

	///TODO, UN SOLO METODO?
	@Override
	public boolean updateFisica(Long id, personaFisica titular) {
          if(titularRep.existsById(id)) {
        	 fisicaRep.save(titular);
        	 return true;
          }
		return false;
	}

	@Override
	public boolean updateJuridica(Long id, personaJuridica titular) {
        if(titularRep.existsById(id)) {
       	 juridicaRep.save(titular);
       	 return true;
         }
		return false;
	}

	@Override
	public Optional<personaFisica> findFisicaById(Long idTitular) {
		return fisicaRep.findById(idTitular);
	}

	@Override
	public Optional<personaJuridica> findJuridicaById(Long idTitular) {
		return juridicaRep.findById(idTitular);
	}
	
	

}
