package ar.com.onwave.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LineModel {
    Long idLinea;
    Long idPlan;
    String numero;
}
