
package pe.cibertec.ecommerce.ApiShoppingCart.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class OrderItem {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    
    private Long orderItem;
    @Embedded
    private Item item;
    private BigDecimal discount;
    private BigDecimal subTotal;
    @ManyToOne
    @JoinColumn(name="orderId")
    private Order order;
}
