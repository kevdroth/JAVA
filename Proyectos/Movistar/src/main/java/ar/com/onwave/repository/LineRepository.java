package ar.com.onwave.repository;

import ar.com.onwave.repository.model.EquipmentModel;
import ar.com.onwave.repository.model.LineModel;

import java.util.List;

public interface LineRepository {
    List<LineModel> findAllLines();
    List<LineModel> findLine(Long idLinea);
    void createLine(LineModel lineModel);
    void deleteLine(Long idLinea);
    void updateLine(LineModel lineModel, Long idLinea);
}
