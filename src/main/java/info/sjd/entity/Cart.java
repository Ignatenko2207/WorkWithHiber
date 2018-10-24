package info.sjd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "carts")
@Setter
@Getter
public class Cart {

    @Id
    @Column(name = "cart_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cartId;

    @Column(name = "time_creation")
    private Long timeCreation;

    @ManyToOne(targetEntity = User.class)
    private User user;

}
