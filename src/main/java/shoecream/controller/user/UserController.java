package shoecream.controller.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import shoecream.domain.User;
import shoecream.service.user.UserService;

@Slf4j
@RestController
public class UserController {

    private final UserService service;

    public UserController(UserService service){
        this.service = service;
    }

    @GetMapping("/user/create")
    public User createUser(@RequestBody User vo) {
        log.info("User Register");
        return service.create(vo);

    }
}
