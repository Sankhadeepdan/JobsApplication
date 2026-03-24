package com.myapp.service;

import com.myapp.entity.JobApplication;
import java.util.List;
import java.util.Optional;

public interface JobApplicationService {

    List<JobApplication> getAllApplications();
    Optional<JobApplication> getApplicationById(Long id);
    JobApplication saveApplication(JobApplication application);
    void deleteApplication(Long id);
}
