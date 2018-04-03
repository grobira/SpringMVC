package app.Model;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class User {
    @Id @GeneratedValue
    private int id;
    @NonNull
    private String name;

    public User(int id, String name) {
        this.id= id;
        this.name=name;
    }
}
