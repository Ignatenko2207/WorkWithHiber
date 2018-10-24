package info.sjd.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Setter
@Getter
public class Order {

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    @ManyToOne(targetEntity = Good.class)
    private Good good;

    @Column(name = "amount")
    private Integer amount;

    @ManyToOne(targetEntity = Cart.class)
    private Cart cart;

}
