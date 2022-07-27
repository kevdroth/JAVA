package ar.com.onwave.repository;

import ar.com.onwave.repository.model.LineModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineDao extends JpaRepository<LineModel, Long> {
}
