package co.com.bancolombia.containers.repositories;

import org.springframework.data.repository.CrudRepository;

import co.com.bancolombia.containers.entities.Cuenta;

public interface CuentaRepository extends CrudRepository<Cuenta, Long>{

}
