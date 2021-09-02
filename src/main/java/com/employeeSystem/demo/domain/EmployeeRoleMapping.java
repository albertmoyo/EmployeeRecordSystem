package com.employeeSystem.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@IdClass(EmployeeRoleMapping.class)
@ToString
@Getter
@Setter
public class EmployeeRoleMapping implements Serializable {
    @Id
    @Column(name = "employee_id")
    private int employeeId;
    @Id
    @Column(name = "role_id")
    private int roleId;
    @Column(name = "effective_date")
    private Date effectiveDate;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "employeeId", referencedColumnName = "employee_id")
    @JsonIgnore
    private Employee employee;

    @ManyToOne
    @PrimaryKeyJoinColumn(name = "roleId", referencedColumnName = "id")
    @JsonIgnore
    private RoleMaster rolemaster;
}
