package ar.com.onwave.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanModel {
    Long idPlan;
    String nombre;
    double precio;
    String internet;
    String minutos;
    String sms;
}
