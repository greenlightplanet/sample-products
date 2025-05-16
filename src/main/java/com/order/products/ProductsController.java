package com.order.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @Autowired
    private ServiceStatusRepository serviceStatusRepository;

    @GetMapping("/get/status")
    public String getServiceStatus(){
        serviceStatusRepository.findAll();
        return "Success";
    }

}
