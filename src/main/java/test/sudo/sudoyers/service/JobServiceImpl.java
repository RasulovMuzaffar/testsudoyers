package test.sudo.sudoyers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.sudo.sudoyers.entity.Jobs;
import test.sudo.sudoyers.entity.Tags;
import test.sudo.sudoyers.repository.JobsRepository;
import test.sudo.sudoyers.repository.TagsRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobsRepository jobsRepository;
    @Autowired
    private TagsRepository tagsRepository;

    public List<Jobs> getAllJobs() {
//        tagsRepository.findById(1L);
//        Set<Tags> tags = tagsRepository.findByJobId(1L);
//        jobsRepository.findAll().get(0).setTags(tags);
        return jobsRepository.findAll();
    }
}
