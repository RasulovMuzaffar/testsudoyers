package test.sudo.sudoyers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.sudo.sudoyers.entity.Freelancer;

@Repository
public interface FreelancerRepository extends JpaRepository<Freelancer, Long> {
}
