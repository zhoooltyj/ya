package homework.hwthree.Checkouter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polosatik on 02.10.17.
 */
public class CheckoutService {
    List<Product> showAvailableProducts() {
        Product product1 = new Product();
        product1.name = "pencil";
        product1.num = 10;
        product1.price = 2.7;

        List list = new ArrayList();
        list.add(product1);

        return list;
    }

    Cart createCart() {
        return new Cart();
    }

    Cart addProductToCart(Cart cart, Product product) {
        cart.products.add(product);
        return cart;

    }

    Receipt payCart(Cart cart, DiscountCard discountCard) {

        return new Receipt();
    }

    void printcheck(Receipt receipt) {

    }

}
