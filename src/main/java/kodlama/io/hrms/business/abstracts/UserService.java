package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> getAll();
}
