package com.cepr.principal.controlador;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cepr.principal.modelo.Mensaje;
import com.cepr.principal.modelo.Titular;
import com.cepr.principal.modelo.personaFisica;
import com.cepr.principal.modelo.personaJuridica;
import com.cepr.principal.servicio.ServicioTitular;


@RestController
@RequestMapping("/titular")
public class ControladorTitular {
	
	@Autowired
	ServicioTitular service;
	
	@GetMapping("/get")
	public Iterable<Titular> findAll(){
        return service.listTitular();
    }
	
	@GetMapping("/get/fisica")
	public Iterable<Titular> findAllF(){
        return service.listFisica();
    }
	
	@GetMapping("/get/juridica")
	public Iterable<Titular> findAllJ(){
        return service.listJuridica();
    }
	
	@GetMapping("/get/fisica/{id}")
	public Optional<personaFisica> findFisicacaById(@PathVariable("id") Long idTitular){
        return service.findFisicaById(idTitular);
    }
	
	@GetMapping("/get/juridica/{id}")
	public Optional<personaJuridica> findJuridicaById(@PathVariable("id") Long idTitular){
        return service.findJuridicaById(idTitular);
    }
	
	
	
	@PostMapping("/save/fisica")  ///TODO
    public Mensaje save(@RequestBody personaFisica titular) {
		if(titular!=null && service.saveTitular(titular))
			return new Mensaje("Guardado con exito");
		return new Mensaje("Fallo en el registro");
	}
	
	@PostMapping("/save/juridica")  ///TODO
    public Mensaje save(@RequestBody personaJuridica titular) {
		if(titular!=null && service.saveTitular(titular))
			return new Mensaje("Guardado con exito");
		return new Mensaje("Fallo en el registro");
	}
	
	@DeleteMapping(value="/delete/{id}")
	public Mensaje deleteTitular(@PathVariable("id") int idTitular) {
		if(service.deleteTitular(idTitular))
			return new Mensaje("Borrado con exito");
		return new Mensaje("Fallo en accion: Borrar");
	}
	
	@PutMapping("/update/fisica/{id}")
	public Mensaje updateFisica(@PathVariable Long id, @RequestBody personaFisica titular){
		if(service.updateFisica(id,titular))
			return new Mensaje("Actualizado con exito");
		return new Mensaje("Fallo en accion: Actualizar");
	}
	
	@PutMapping("/update/juridica/{id}")
	public Mensaje updateJuridica(@PathVariable Long id, @RequestBody personaJuridica titular){
		if(service.updateJuridica(id,titular))
			return new Mensaje("Actualizado con exito");
		return new Mensaje("Fallo en accion: Actualizar");
	}
	
	
	
	

}
