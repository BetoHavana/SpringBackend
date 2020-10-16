package com.projects.universidad.users;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Alberto
 */
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository repository;
    @Override
    public List<User> listar() {
        return repository.findAll();
    }
    @Override
    public User listarId(String userid) {
        return repository.findByUserid(userid);
    }

    @Override
    public User add(User objUser) {
    	  System.out.print("add service imp "+objUser);
        return repository.save(objUser);
    }

    @Override
    public User edit(User objUser) {
        return repository.save(objUser);
    }

    @Override
    public User delete(String id) {
    	User objUser=repository.findByUserid(id);
        if(objUser!=null){
        	repository.delete(objUser);
        }
       return objUser;
    }
    
}
