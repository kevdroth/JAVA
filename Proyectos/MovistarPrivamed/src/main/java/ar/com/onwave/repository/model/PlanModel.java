package ar.com.onwave.repository.model;

import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "plan")
public class PlanModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPlan;

    @NotNull
    String nombre;

    @NotNull
    double precio;

    @NotNull
    String internet;

    @NotNull
    String minutos;

    @NotNull
    String sms;
}
