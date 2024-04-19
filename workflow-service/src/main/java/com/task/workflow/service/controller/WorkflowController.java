package com.task.workflow.service.controller;

import com.task.workflow.service.model.Workflow;
import com.task.workflow.service.service.WorkflowServiceImpl;
import lombok.RequiredArgsConstructor;
import org.hibernate.jdbc.Work;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workflowService")
@RequiredArgsConstructor
public class WorkflowController {
   @Autowired
   private final WorkflowServiceImpl workflowServiceimpl;

   @PostMapping("/create")
   public Workflow createWorkflow(Workflow workflow){
      return workflowServiceimpl.createWorkflow(workflow);
   }

   @PostMapping("/check")
   public String checkRole(Workflow workflow) {
       return workflowServiceimpl.checkRole(workflow);
   }
}
