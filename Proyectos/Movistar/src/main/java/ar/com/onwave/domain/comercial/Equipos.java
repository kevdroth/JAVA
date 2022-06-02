package ar.com.onwave.domain.comercial;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "equipos")
public class Equipos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipos;

    @NotEmpty
    private String registrado;

    @NotEmpty
    private String imeiRegistrado;

    @NotEmpty
    private String marcaTrafica;

    @NotEmpty
    private String modeloTrafica;

    @NotEmpty
    private String imeiTrafica;

    @NotEmpty
    private String sim;
}
