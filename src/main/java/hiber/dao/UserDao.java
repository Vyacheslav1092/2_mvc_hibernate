package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getUserById(Long id);
    void addUser(User user);
    void updateUser(User user);
    void removeUser(Long id);
}
