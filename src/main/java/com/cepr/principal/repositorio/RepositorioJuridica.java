package com.cepr.principal.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cepr.principal.modelo.personaJuridica;

@Repository
public interface RepositorioJuridica extends JpaRepository<personaJuridica, Long>{

}