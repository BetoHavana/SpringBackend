package com.projects.universidad.users;
import java.util.List;
import org.springframework.data.repository.Repository;


public interface UserRepository extends Repository<User, Integer>{
    List<User>findAll();
    User findByUserid(String userid);
    User save(User objUser);
    void delete(User objUser);
}