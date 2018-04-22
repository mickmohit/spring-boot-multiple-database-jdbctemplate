package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.repository.SpringJava4sDAO;
 
 
@RestController
@RequestMapping("/all")
public class SpringJava4sController {
 
    @Autowired
    public SpringJava4sDAO dao;
 
    @RequestMapping("/getcustInfo")
    public List < Customer > customerInformation() {
        List < Customer > customers = dao.isData();
        return customers;
    }
 
    @RequestMapping("/testSecondDatasource")
    public String dSverify() {
        return dao.dsVerification();
    }
}
