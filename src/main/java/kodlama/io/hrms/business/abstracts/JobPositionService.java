package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.JobPosition;

import java.util.List;

public interface JobPositionService {
    void add(JobPosition jobPosition);
    List<JobPosition> getAll();
}
