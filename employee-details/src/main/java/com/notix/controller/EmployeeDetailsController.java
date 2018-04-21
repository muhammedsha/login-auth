/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.notix.controller;

import com.notix.model.Employee;
import com.notix.services.EmployeeService;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jibin
 */
@RestController
@RequestMapping("v1/employees")
public class EmployeeDetailsController {
   @Autowired
    private EmployeeService empService;
    
    Logger logger = LoggerFactory.getLogger(this.getClass());
    private List<Employee> employees;


    @RequestMapping(value="/{empId}", method= RequestMethod.GET)
    public Optional<Employee> getEmployee( @PathVariable("empId") Long empId) {
        Optional<Employee> value = empService.getEmp(empId);
        logger.info("{}",value);
         return value;
    }
    @RequestMapping("/list")
	public List<Employee> findAll() {
		logger.info("Customer.findAll()");
		return employees;
	}
}
