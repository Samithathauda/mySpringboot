package com.example.RealProject.service;

import com.example.RealProject.repository.CustomerRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    CustomerRepo customerRepo1 ;

    public CustomerService(CustomerRepo customerRepo) {
        customerRepo1 =  customerRepo;
    }

    public String getCustomer(String id,String name) {
        customerRepo1.savecustomerDet(id ,  name);
    return         customerRepo1.savecustomerDet(id ,  name);


}

}
