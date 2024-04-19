package com.task.workflow.service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Workflow_Steps")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Workflow_Steps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "workflow")
    private String workflow;
    @Column(name = "step")
    private int step;
    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;
}
// @Enumerated(EnumType.STRING)
//    @Column(name = "entity_type")
//    private EntityType entity_type;
//    @Column(name = "action")
//    private String action;
