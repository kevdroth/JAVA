package ar.com.onwave.repository;

import ar.com.onwave.repository.model.PlanModel;

import java.util.List;

public interface PlanRepository {
    List<PlanModel> findAllPlans();
    public int addPlan(PlanModel planModel);
}
