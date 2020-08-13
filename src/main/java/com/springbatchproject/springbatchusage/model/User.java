package com.springbatchproject.springbatchusage.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private Long userId;
    private String name;
    private Long departmentId;
    private Double salary;

    public User(){}

    public User(Long userId, String name, Long departmentId, Double salary) {
        this.userId = userId;
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
