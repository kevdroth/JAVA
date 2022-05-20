package ar.com.onwave.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data //lombok - metodos y constructores
@Entity
@Table(name = "rol") //tabla a utilizar
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ai
    private Long idRol;

    @NotEmpty // validacion no vacio
    private String nombre;
}
