package ar.com.onwave.servicio.comercial;

import ar.com.onwave.dao.comercial.EquiposDao;
import ar.com.onwave.domain.comercial.Equipos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EquipoServiceImpl implements EquipoService{

    @Autowired
    private EquiposDao equiposDao;

    @Override
    @Transactional(readOnly = true)
    public List<Equipos> listarEquipos() {
        return (List<Equipos>) equiposDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Equipos equipos) {
        equiposDao.save(equipos);
    }

    @Override
    public void eliminar(Equipos equipos) {
        equiposDao.delete(equipos);
    }

    @Override
    @Transactional(readOnly = true)
    public Equipos encontrarEquipos(Equipos equipos) {
        return equiposDao.findById(equipos.getIdEquipos()).orElse(null);
    }
}
