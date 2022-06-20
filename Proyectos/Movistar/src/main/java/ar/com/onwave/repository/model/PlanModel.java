package ar.com.onwave.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanModel {
    int idPlan;
    String nombre;
    double precio;
    String internet;
    String minutos;
    String sms;
}
