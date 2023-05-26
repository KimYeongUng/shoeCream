package shoecream.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Table(name = "USERS")
@Getter
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


    public User() {

    }
}
