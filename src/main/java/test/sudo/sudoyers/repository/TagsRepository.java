package test.sudo.sudoyers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import test.sudo.sudoyers.entity.Tags;

import java.util.List;

public interface TagsRepository extends JpaRepository<Tags, Long> {
    @Query(value = "select * from tags where id = ?1", nativeQuery = true)
    List<Tags> findByJobId(Long id);
}
