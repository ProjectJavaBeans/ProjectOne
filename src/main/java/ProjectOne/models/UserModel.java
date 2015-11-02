package ProjectOne.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ohlaph on 11/1/2015.
 */
@Entity
public class UserModel implements Serializable {

    private String username;
    private String password;
    private String role;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
