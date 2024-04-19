package com.task.workflow.service.service;

import com.task.workflow.service.model.Workflow;
import com.task.workflow.service.repository.WorkflowRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkflowServiceImpl implements WorkflowService {
    @Autowired
    private final WorkflowRepo workflowRepo;

    @Override
    public Workflow createWorkflow(Workflow workflow) {
        return workflowRepo.save(workflow);
    }

    @Override
    public String checkRole(Workflow workflow) {
        workflowRepo.findById(workflow.getId()).orElseThrow();
        String status = (workflowRepo.getStatusByRoleAndWorkflow(workflow.getRole(), workflow.getWorkflow())
                .getStatus().toString());
        return status;
    }
}
