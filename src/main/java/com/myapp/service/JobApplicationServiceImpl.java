package com.myapp.service;

import com.myapp.entity.JobApplication;
import com.myapp.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class JobApplicationServiceImpl implements JobApplicationService {

    @Autowired
    private JobApplicationRepository repository;

    @Override
    public List<JobApplication> getAllApplications() {
        return repository.findAll();
    }

    @Override
    public Optional<JobApplication> getApplicationById(Long id) {
        return repository.findById(id);
    }

    @Override
    public JobApplication saveApplication(JobApplication application) {
        return repository.save(application);
    }

    @Override
    public void deleteApplication(Long id) {
        repository.deleteById(id);
    }
}
