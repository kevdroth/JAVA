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

    @GetMapping
    public List<PlanModel> getPlans(){
        return planService.getPlans();
    }

}
