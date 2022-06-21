package ar.com.onwave.controller;

import ar.com.onwave.repository.model.PlanModel;
import ar.com.onwave.service.PlanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/plan")
public class PlanController {

    private PlanService planService;

    public PlanController(PlanService planService){
        this.planService = planService;
    }

    @GetMapping("/api/v1/plan/list")
    public List<PlanModel> getPlans(){
        return planService.getPlans();
    }

    @GetMapping("/api/v1/plan/add")
    public int addPlans(PlanModel planModel) {
        return planService.addPlans(planModel);
    }
}
