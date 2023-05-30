package shoecream.service.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shoecream.domain.User;
import shoecream.repo.UserRepository;

import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public User create(User vo) {
        User user = repository.save(vo);
        log.info("User ID: "+user.getId());
        return user;
    }
}
