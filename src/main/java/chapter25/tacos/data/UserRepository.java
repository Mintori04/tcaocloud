package chapter25.tacos.data;

import chapter25.tacos.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
    User findByUsername(String username);
}
