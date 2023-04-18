
package pe.cibertec.ecommerce.ApiShoppingCart.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Customer {
    private Long customerid;
    private String name;
    private String email;
    private String phone;
}
