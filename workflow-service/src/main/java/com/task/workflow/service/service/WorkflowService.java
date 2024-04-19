package com.task.workflow.service.service;

import com.task.workflow.service.model.Workflow;

public interface WorkflowService {
    Workflow createWorkflow(Workflow workflow);
    String checkRole(Workflow workflow);
}
