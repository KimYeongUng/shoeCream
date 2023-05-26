package shoecream.data.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shoecream.domain.User;
import shoecream.repo.UserRepository;

import org.junit.jupiter.api.Assertions;

@DisplayName("UserRepositorty Test")
@SpringBootTest
public class DataAccessTest {

    @Autowired
    UserRepository repository;
    User user;
    
    @BeforeEach
    public void setUp(){
        user = User.builder()
                .id("testId01")
                .password("1234")
                .name("testUser")
                .phoneNumber("01012345678")
                .build();
    }

    @Test
    public void repositoryTest(){
        Assertions.assertNotNull(user);
        Assertions.assertNotNull(repository);
        Assertions.assertEquals(user.getId(),"testId01");
    }
}
