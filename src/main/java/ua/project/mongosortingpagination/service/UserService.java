package ua.project.mongosortingpagination.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import ua.project.mongosortingpagination.entity.UserEntity;
import ua.project.mongosortingpagination.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final MongoTemplate mongoTemplate;

    public Page<UserEntity> findAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public List<UserEntity> findUsersBy(String sortParam) {
        Query query = new Query();
        query.with(Sort.by(Sort.Order.desc(sortParam)));

        return mongoTemplate.find(query, UserEntity.class);
    }
}
