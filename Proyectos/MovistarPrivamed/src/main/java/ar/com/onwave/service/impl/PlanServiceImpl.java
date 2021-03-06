package ar.com.onwave.service.impl;

import ar.com.onwave.repository.PlanDao;
import ar.com.onwave.repository.model.PlanModel;
import ar.com.onwave.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanDao planDao;

    @Override
    @Transactional(readOnly = true)
    public List<PlanModel> getPlans() {
        return planDao.findAll();
    }

    @Override
    @Transactional
    public void addPlan(PlanModel planModel) {
        planDao.save(planModel);
    }

    @Override
    @Transactional
    public void removePlan(PlanModel planModel) {
        planDao.delete(planModel);
    }

    @Override
    @Transactional(readOnly = true)
    public PlanModel getPlan(PlanModel planModel) {
        return planDao.findById(planModel.getIdPlan()).orElse(null);
    }
}
