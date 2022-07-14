package ar.com.onwave.service;

import ar.com.onwave.repository.model.PlanModel;

import java.util.List;

public interface PlanService {
    List<PlanModel> getPlans();
    List<PlanModel> getPlan(Long idPlan);
    void addPlan(PlanModel planModel);
    void modifyPlan(PlanModel planModel, Long idPlan);
    void removePlan(Long idPlan);
}
