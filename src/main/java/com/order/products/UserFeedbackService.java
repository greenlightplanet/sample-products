package com.order.products;

import org.springframework.stereotype.Service;

@Service
public class UserFeedbackService {

    private final UserFeedbackRepository repository;

    public UserFeedbackService(UserFeedbackRepository repository) {
        this.repository = repository;
    }

    public UserFeedback saveFeedback(UserFeedbackDto dto) {
        UserFeedback feedback = new UserFeedback();
        feedback.setUserName(dto.getUserName());
        feedback.setArticleId(dto.getArticleId());
        feedback.setRating(dto.getRating());
        feedback.setComments(dto.getComments());
        return repository.save(feedback);
    }
}
