package ar.com.onwave.service.impl;

import ar.com.onwave.repository.LineRepository;
import ar.com.onwave.repository.model.LineModel;
import ar.com.onwave.service.LineService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineServiceImpl implements LineService {

    private LineRepository lineRepository;

    public LineServiceImpl(LineRepository lineRepository) {
        this.lineRepository = lineRepository;
    }

    @Override
    public List<LineModel> getLines() {
        return this.lineRepository.findAllLines();
    }

    @Override
    public List<LineModel> getLine(Long idLinea) {
        return this.lineRepository.findLine(idLinea);
    }

    @Override
    public void addLine(LineModel lineModel) {
        this.lineRepository.createLine(lineModel);
    }

    @Override
    public void removeLine(Long idLinea) {
        this.lineRepository.deleteLine(idLinea);
    }

    @Override
    public void modifyLine(LineModel lineModel, Long idLinea) {
        this.lineRepository.updateLine(lineModel,idLinea);
    }
}
