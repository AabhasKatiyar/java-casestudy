package com.university.complaint.service;

import com.university.complaint.model.Complaint;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ComplaintService {

    private final List<Complaint> complaintList = new ArrayList<>();
    private final AtomicLong idGenerator = new AtomicLong(1001);

    public Complaint registerComplaint(Complaint complaint) {
        if (complaint.getDescription() == null || complaint.getDescription().trim().isEmpty()) {
            throw new IllegalArgumentException("Complaint description cannot be empty");
        }
        if (complaint.getCategory() == null || complaint.getCategory().trim().isEmpty()) {
            throw new IllegalArgumentException("Complaint category cannot be empty");
        }

        complaint.setId(idGenerator.getAndIncrement());
        complaint.setStatus("PENDING");
        complaint.setCreatedAt(LocalDateTime.now());
        complaintList.add(complaint);
        return complaint;
    }

    public List<Complaint> getAllComplaints() {
        return new ArrayList<>(complaintList);
    }

    public Optional<Complaint> getComplaintById(Long id) {
        return complaintList.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }

    public Optional<Complaint> updateComplaintStatus(Long id, String newStatus) {
        Optional<Complaint> existing = getComplaintById(id);
        existing.ifPresent(complaint -> complaint.setStatus(newStatus.toUpperCase()));
        return existing;
    }
}
