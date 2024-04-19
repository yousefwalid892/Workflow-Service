package com.task.workflow.service.service;

//import com.task.workflow.service.model.EntityType;
//import com.task.workflow.service.model.Role;
import com.task.workflow.service.model.Workflow_Steps;
import com.task.workflow.service.repository.Workflow_StepsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Workflow_StepsServiceImpl implements Workflow_StepsService{
    @Autowired
    private final Workflow_StepsRepo workflowStepsRepo;
    @Override
    public Workflow_Steps createSteps(Workflow_Steps workflowSteps) {
      //  workflowSteps.setRole(Role.valueOf("ADMIN"));
      //  workflowSteps.setEntity_type(EntityType.valueOf("BOOK"));
        return workflowStepsRepo.save(workflowSteps);
    }
}
