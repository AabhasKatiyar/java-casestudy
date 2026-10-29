package com.college.feedback.model;

public class Feedback {
    private Long id;
    private String studentName;
    private String subject;
    private String feedback;

    public Feedback() {
    }

    public Feedback(Long id, String studentName, String subject, String feedback) {
        this.id = id;
        this.studentName = studentName;
        this.subject = subject;
        this.feedback = feedback;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
