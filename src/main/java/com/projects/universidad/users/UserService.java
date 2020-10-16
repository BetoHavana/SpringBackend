package com.projects.universidad.users;
import java.util.List;

public interface UserService {
    List<User>listar();
    User listarId(String user_id);
    User add(User objUser);
    User edit(User objUser);
    User delete(String user_id);
}

