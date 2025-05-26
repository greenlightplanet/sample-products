package com.order.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @Autowired
    private ServiceStatusRepository serviceStatusRepository;

    @Autowired
    private UserFeedbackService feedbackService;

    @GetMapping("/get/status")
    public String getServiceStatus(){
        serviceStatusRepository.findAll();
        return "Success";
    }

    @PostMapping("/api/feedback")
    public ResponseEntity<UserFeedback> submitFeedback(@RequestBody UserFeedbackDto dto) {
        UserFeedback result = feedbackService.saveFeedback(dto);
        return ResponseEntity.ok(result);
    }

}
