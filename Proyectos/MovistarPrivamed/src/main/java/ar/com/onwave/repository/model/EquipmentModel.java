package ar.com.onwave.repository.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class EquipmentModel {
    Long idEquipo;
    String registrado;
    String imeiRegistrado;
    String marcaTrafica;
    String modeloTrafica;
    String imeiTrafica;
    String sim;
}
