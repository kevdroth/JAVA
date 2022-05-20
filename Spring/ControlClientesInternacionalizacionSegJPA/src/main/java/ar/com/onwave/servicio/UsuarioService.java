package ar.com.onwave.servicio;

import ar.com.onwave.dao.UsuarioDao;
import ar.com.onwave.domain.Rol;
import ar.com.onwave.domain.Usuario;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("userDetailsService") //es un bind de spring, tipo Servicio y se llama userDetailsService
@Slf4j //escribir a consola
public class UsuarioService implements UserDetailsService {

    @Autowired //inyectar una instancia de tipo Usuario Dao
    private UsuarioDao usuarioDao; //interactua con usuarios como con roles

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findByUsername(username);

        if(usuario == null){
            throw new UsernameNotFoundException(username);
        }

        var roles = new ArrayList<GrantedAuthority>(); //tipo precisado por Spring para manejar los roles

        for (Rol rol : usuario.getRoles()){
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }

        return new User(usuario.getUsername(), usuario.getPassword(), roles);

    }
}
