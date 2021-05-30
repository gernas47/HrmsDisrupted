package kodlama.io.hrms.business.concretes;


import kodlama.io.hrms.business.abstracts.JobPositionService;
import kodlama.io.hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao dao;

    @Autowired
    public JobPositionManager(JobPositionDao dao){
        this.dao = dao;
    }

    @Override
    public void add(JobPosition jobPosition) {
        this.dao.save(jobPosition);
    }

    @Override
    public List<JobPosition> getAll() {
        return this.dao.findAll();
    }
}
