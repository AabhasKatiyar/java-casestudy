package com.university.complaint.model;

import java.time.LocalDateTime;

public class Complaint {
    private Long id;
    private String category;
    private String description;
    private String status;
    private LocalDateTime createdAt;

    public Complaint() {
    }

    public Complaint(Long id, String category, String description, String status, LocalDateTime createdAt) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
