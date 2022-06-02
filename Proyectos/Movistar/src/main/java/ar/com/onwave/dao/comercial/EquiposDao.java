package ar.com.onwave.dao.comercial;

import ar.com.onwave.domain.Persona;
import ar.com.onwave.domain.comercial.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquiposDao extends JpaRepository<Equipos, Long> {
}
