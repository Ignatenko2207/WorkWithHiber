package info.sjd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Setter
@Getter
public class User {

    @Id
    @Column(name = "login")
    private String login;

    @Column(name = "user_pass")
    private String userPass;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
