package com.employeeSystem.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="employee")
@ToString
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="employee_id")
    //@JsonIgnore
    private Long employeeId;

    @Column(name="first_name")
    private String firstName;
    @Column(name="middle_name")
    private String middleName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="date_of_joining")
    private Date dateOfJoining;
    @Column(name="date_of_exit")
    private Date dateOfExit;
    @Column(name="status")
    @Min(value = 1, message = "Status should be 1")
    @Max(value = 1, message = "Status should be 1")
    private int status;

    @OneToMany(mappedBy = "employee")
    private Set<EmployeeRoleMapping> employeeRoleMapping;


}
