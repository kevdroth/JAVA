package ar.com.onwave.service.impl;

import ar.com.onwave.repository.PlanRepository;
import ar.com.onwave.repository.model.PlanModel;
import ar.com.onwave.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    private PlanRepository planRepository;

    public PlanServiceImpl(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    @Override
    public List<PlanModel> getPlans() {
        return planRepository.findAllPlans();
    }

    @Override
    public List<PlanModel> getPlan(Long idPlan) {
        return planRepository.findPlan(idPlan);
    }

    @Override
    public void addPlan(PlanModel planModel) {
        planRepository.createPlan(planModel);
    }

    @Override
    public void modifyPlan(PlanModel planModel, Long idPlan) {
        planRepository.updatePlan(planModel, idPlan);
    }

    @Override
    public void removePlan(Long idPlan) {
        planRepository.deletePlan(idPlan);
    }
}
