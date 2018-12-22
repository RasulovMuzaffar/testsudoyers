package test.sudo.sudoyers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.sudo.sudoyers.entity.Jobs;

@Repository
public interface JobsRepository extends JpaRepository<Jobs, Long> {
}
