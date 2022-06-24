package ar.com.onwave.service;

import ar.com.onwave.repository.model.LineModel;

import java.util.List;

public interface LineService {
    List<LineModel> getLines();
    List<LineModel> getLine(Long idLinea);
    void addLine(LineModel lineModel);
    void removeLine(Long idLinea);
    void modifyLine(LineModel lineModel, Long idLinea);
}
