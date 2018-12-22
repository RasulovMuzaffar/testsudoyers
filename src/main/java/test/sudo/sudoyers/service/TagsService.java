package test.sudo.sudoyers.service;

import test.sudo.sudoyers.entity.Tags;

import java.util.List;

public interface TagsService {
    List<Tags> findTagsByJob(Long id);
}
