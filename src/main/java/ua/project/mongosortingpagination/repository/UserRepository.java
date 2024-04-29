package ua.project.mongosortingpagination.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import ua.project.mongosortingpagination.entity.UserEntity;

public interface UserRepository extends MongoRepository<UserEntity, String> {
    Page<UserEntity> findAll(Pageable pageable);

}
