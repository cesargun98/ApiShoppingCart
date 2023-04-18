
package pe.cibertec.ecommerce.ApiShoppingCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.Purchase;
import pe.cibertec.ecommerce.ApiShoppingCart.dto.PurchaseResponse;
import pe.cibertec.ecommerce.ApiShoppingCart.service.ShoppingCartService;

@RestController
@RequestMapping("api/shoppingcart")
public class ShoppimgCartController {
    @Autowired
    private ShoppingCartService cartService;
    
    @PostMapping("/placeorder")
    public PurchaseResponse placeOrder (@RequestBody Purchase purchase) {
        return cartService.placeOrder(purchase);
    }
}
