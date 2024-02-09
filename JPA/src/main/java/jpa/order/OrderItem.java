package jpa.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "ORDER_ITEM")
@Getter @Setter
public class OrderItem {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @Column(name = "ITEM_ID")
    private Long itemId;

    @Column(name = "ORDER_ID")
    private Long orderId;

    private int orderPrice;
    private int count;
}
