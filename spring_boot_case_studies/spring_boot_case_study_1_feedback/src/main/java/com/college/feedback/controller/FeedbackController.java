package com.college.feedback.controller;

import com.college.feedback.model.Feedback;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "*")
public class FeedbackController {

    private final List<Feedback> feedbackList = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    @PostMapping
    public ResponseEntity<Feedback> submitFeedback(@RequestBody Feedback feedback) {
        feedback.setId(idCounter.getAndIncrement());
        feedbackList.add(feedback);
        return new ResponseEntity<>(feedback, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Feedback>> getAllFeedback() {
        return ResponseEntity.ok(feedbackList);
    }

    @GetMapping("/subject/{subject}")
    public ResponseEntity<List<Feedback>> getFeedbackBySubject(@PathVariable String subject) {
        List<Feedback> filtered = new ArrayList<>();
        for (Feedback item : feedbackList) {
            if (item.getSubject() != null && item.getSubject().equalsIgnoreCase(subject)) {
                filtered.add(item);
            }
        }
        return ResponseEntity.ok(filtered);
    }
}
