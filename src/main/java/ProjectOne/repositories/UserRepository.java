package ProjectOne.repositories;

import ProjectOne.models.UserModel;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ohlaph on 11/1/2015.
 */
public interface UserRepository extends CrudRepository<UserModel, Long> {
    public UserModel findByUserName(String username);

}
