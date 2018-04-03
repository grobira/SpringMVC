package app.Repository;

import app.Model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

@Repository
@Qualifier("mongoData")
public class UserMongoRepository{

    public Collection<User> getAllUsers(){
        return new ArrayList<User>(){
            {
                add(new User(1, "Mario"));
            }
        };
    }
}
