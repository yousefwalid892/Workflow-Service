package com.task.workflow.service.controller;

import com.task.workflow.service.model.Workflow_Steps;
import com.task.workflow.service.service.Workflow_StepsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workflow_steps")
@RequiredArgsConstructor
public class Workflow_StepsController {
    @Autowired
    private final Workflow_StepsServiceImpl workflowStepsService;

    @PostMapping("/create")
    public Workflow_Steps createSteps(Workflow_Steps workflowSteps) {
            return workflowStepsService.createSteps(workflowSteps);
    }
}