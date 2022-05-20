package ar.com.onwave.dao;

import ar.com.onwave.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long> { //objetos usuarios y pk
    Usuario findByUsername(String username);
}
