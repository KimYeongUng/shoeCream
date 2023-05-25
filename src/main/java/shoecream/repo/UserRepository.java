package shoecream.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shoecream.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User save(User user);
}
