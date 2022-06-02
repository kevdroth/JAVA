package ar.com.onwave.servicio.comercial;

import ar.com.onwave.domain.comercial.Equipos;

import java.util.List;

public interface EquipoService {

    public List<Equipos> listarEquipos();

    public void guardar(Equipos equipos);

    public void eliminar(Equipos equipos);

    public Equipos encontrarEquipos(Equipos equipos);

}
