package com.task.workflow.service.repository;

import com.task.workflow.service.model.Workflow_Steps;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Workflow_StepsRepo extends JpaRepository<Workflow_Steps,Integer> {
}
