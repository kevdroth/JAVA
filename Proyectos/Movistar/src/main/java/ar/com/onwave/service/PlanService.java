package ar.com.onwave.service;

import ar.com.onwave.repository.model.PlanModel;

import java.util.List;

public interface PlanService {
    List<PlanModel> getPlans();
}
