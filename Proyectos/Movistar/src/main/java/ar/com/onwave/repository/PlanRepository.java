package ar.com.onwave.repository;

import ar.com.onwave.repository.model.PlanModel;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PlanRepository {
    List<PlanModel> findAllPlans();
    List<PlanModel> findPlan(Long idPlan);
    void createPlan(PlanModel planModel);
    void updatePlan(PlanModel planModel, Long idPlan);
    void deletePlan(Long idPlan);
}
