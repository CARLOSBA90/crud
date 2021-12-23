package com.cepr.principal.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cepr.principal.modelo.Titular;

@Repository
public interface RepositorioTitular extends JpaRepository<Titular, Long>{
	boolean existsByRut(String rut);
}