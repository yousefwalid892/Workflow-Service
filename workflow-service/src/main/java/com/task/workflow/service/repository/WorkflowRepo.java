package com.task.workflow.service.repository;

import com.task.workflow.service.model.Role;
import com.task.workflow.service.model.Workflow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkflowRepo extends JpaRepository<Workflow,Integer> {
    Workflow getStatusByRoleAndWorkflow(Role role,String workflow_type);
}
