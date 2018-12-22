package test.sudo.sudoyers.service;

import org.springframework.beans.factory.annotation.Autowired;
import test.sudo.sudoyers.entity.Tags;
import test.sudo.sudoyers.repository.TagsRepository;

import java.util.List;

public class TagsServiceImpl implements TagsService {
    @Autowired
    private TagsRepository tagsRepository;
    @Override
    public List<Tags> findTagsByJob(Long id) {
        return tagsRepository.findByJobId(id);
    }
}
