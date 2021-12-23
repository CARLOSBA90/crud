package com.cepr.principal.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cepr.principal.modelo.personaFisica;

@Repository
public interface RepositorioFisica extends JpaRepository<personaFisica, Long>{

}
