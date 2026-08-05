package com.ankush.spring.projects.lms.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "leave_table")
public class LeaveRequest {

    @Id
    @Column(name = "leave_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long leaveId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @Column(name = "reason")
    private String Reason;

    @Enumerated(EnumType.STRING)
    @Column(name = "leave_Status")
    private LeaveStatus leaveStatus;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
