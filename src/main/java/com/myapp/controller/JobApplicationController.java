package com.myapp.controller;

import com.myapp.entity.JobApplication;
import com.myapp.service.JobApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/job-applications")
public class JobApplicationController {

    @Autowired
    private JobApplicationService service;

    @GetMapping
    public List<JobApplication> getAllApplications() {
        return service.getAllApplications();
    }

    @GetMapping("/{id}")
    public Optional<JobApplication> getApplicationById(@PathVariable Long id) {
        return service.getApplicationById(id);
    }

    @PostMapping
    public JobApplication createApplication(@RequestBody JobApplication application) {
        return service.saveApplication(application);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        service.deleteApplication(id);
    }
}

