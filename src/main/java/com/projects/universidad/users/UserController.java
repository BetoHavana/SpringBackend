package com.projects.universidad.users;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
//@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    UserService service;
    
    @GetMapping
    public List<User>listar(){
        return service.listar();
    }
    @PostMapping
    public User agregar(@RequestBody User objUser){
    	System.out.print("add controller "+ objUser);
        return service.add(objUser);
    }
    @GetMapping(path = {"/{user_id}"})
    public User listarId(@PathVariable("user_id")String user_id){
        return service.listarId(user_id);
    }
    @PutMapping(path = {"/{user_id}"})
    public User editar(@RequestBody User objUser,@PathVariable("user_id") Integer user_id){
    	objUser.setUserid(user_id);
        return service.edit(objUser);
    }
    @DeleteMapping(path = {"/{user_id}"})
    public User delete(@PathVariable("user_id") String  user_id){
        return service.delete(user_id);
    }
}
