package ar.com.onwave.controller;

import ar.com.onwave.repository.model.PlanModel;
import ar.com.onwave.service.PlanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/plan")
public class PlanController {
    private PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping("/getAll")
    public List<PlanModel> getPlans() {
        return planService.getPlans();
    }

    @GetMapping("/get/{idPlan}")
    public List<PlanModel> getPlan(Long idPlan) {
        return planService.getPlan(idPlan);
    }

    @PostMapping("/add")
    public void addPlan(PlanModel planModel) {
        planService.addPlan(planModel);
    }

    @PostMapping("/update/{idPlan}")
    public void modifyPlan(PlanModel planModel, Long idPlan) {
        planService.modifyPlan(planModel, idPlan);
    }

    @GetMapping("/delete/{idPlan}")
    public void removePlan(Long idPlan) {
        planService.removePlan(idPlan);
    }
}
