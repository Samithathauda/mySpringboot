package com.example.RealProject.repository;


import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepo {

    public String savecustomerDet(String id , String name){


        return "Customer ID succesfully saved: " + id;
    }

}
