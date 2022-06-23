package ar.com.onwave.repository.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//PORQUE DATA Y NO ENTITY Y QE ES JSONNAMING
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class EquipmentModel {
    String idEquipo;
    String registrado;
    String imeiRegistrado;
    String marcaTrafica;
    String modeloTrafica;
    String imeiTrafica;
    String sim;
}
