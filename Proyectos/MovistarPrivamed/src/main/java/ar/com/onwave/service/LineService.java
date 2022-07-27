package ar.com.onwave.service;

import ar.com.onwave.repository.model.LineModel;
import ar.com.onwave.repository.model.PlanModel;

import java.util.List;

public interface LineService {
    List<LineModel> getLines();
    void addLine(LineModel lineModel);
    void removeLine(LineModel lineModel);
    LineModel getLine(LineModel lineModel);
}
