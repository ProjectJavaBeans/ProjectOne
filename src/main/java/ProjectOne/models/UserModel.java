package ProjectOne.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Ohlaph on 11/1/2015.
 */
@Entity
@Table(name="users")
public class UserModel implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 8133150339090927424L;
	private String userName;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }
}
