package test.sudo.sudoyers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.sudo.sudoyers.repository.FreelancerRepository;

@Service
public class FreelanceServiceImpl {
    @Autowired
    private FreelancerRepository freelancerRepository;

}
