/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notix.repository;

import com.notix.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jibin
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    
    public Employee findById(String empId);
}
