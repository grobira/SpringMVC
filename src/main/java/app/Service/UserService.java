package app.Service;

import app.Model.User;
import app.Repository.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    @Qualifier("mongoData")
    private UserMongoRepository userRepository;

    public Collection<User> getAllUsers(){
        return this.userRepository.getAllUsers();
    }
}
