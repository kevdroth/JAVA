package ar.com.onwave.holamundospringdata.dao;

import ar.com.onwave.holamundospringdata.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
