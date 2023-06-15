package shoecream.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "USERS")
@Getter
@NoArgsConstructor
public class User {

    @Builder
    public User(String id,String password,String name,String email,String phoneNumber){
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private String id;

    private String password;

    private String name;

    private String email;

    private String phoneNumber;

    @Column(name = "CREATE_DT")
    private LocalDateTime createDt;

    @Column(name = "MODIFIED_DT")
    private LocalDateTime modifiedDt;
}
