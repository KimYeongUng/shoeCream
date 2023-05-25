package shoecream.service.user;

import org.springframework.stereotype.Service;
import shoecream.domain.User;
import shoecream.repo.UserRepository;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public User create(User vo) {

        return repository.save(vo);
    }
}
