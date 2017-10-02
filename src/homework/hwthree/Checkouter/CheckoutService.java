package homework.hwthree.Checkouter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polosatik on 02.10.17.
 */
public class CheckoutService {

    List<Product> currentProducts = initProducts();


    List<Product> showAvailableProducts() {
        System.out.println(" + showAvailableProducts");
        List<Product> abc = new ArrayList<>();

        for(Product a: currentProducts) {
            abc.add(new Product(a.name, a.num, a.price));
        }


        return abc;
    }

    List<Product> initProducts() {

        Product product1 = new Product();
        product1.name = "pencil";
        product1.num = 10;
        product1.price = 2.7;

        Product product2 = new Product();
        product2.name = "pen";
        product2.num = 20;
        product2.price = 5.1;

        Product product3 = new Product();
        product3.name = "paper";
        product3.num = 50;
        product3.price = 7.4;

        List list = new ArrayList();
        list.add(product1);
        list.add(product2);
        list.add(product3);

        return list;
    }

    Cart createCart() {
        System.out.println(" + createCart");
        return new Cart();
    }

    Cart addProductToCart(Cart cart, Product product) {
        cart.products.add(product);
        System.out.println(" + addProductToCart " + product);
        return cart;

    }

    Receipt payCart(Cart cart, DiscountCard discountCard) {
        System.out.println(" + payCart");

        Receipt receipt = new Receipt();

        for (Product product : cart.products) {
            double p = product.price * discountCard.discount * product.num;
            receipt.productDiscounts.add(p);
            receipt.paidProducts.add(product);

            updateStocks(product);

        }

        return receipt;
    }

    private void updateStocks(Product userProduct) {
        for (Product availableShopProduct : currentProducts) {
            if (availableShopProduct.name.equals(userProduct.name)) {
                availableShopProduct.num = availableShopProduct.num - userProduct.num;
            }
        }
    }

    void printcheck(Receipt receipt) {
        System.out.println(" + printcheck");
        System.out.println(receipt);
        double sum = 0;
        double sumDiscount = 0;
        for(int i = 0;i<receipt.paidProducts.size();i++) {
            sum += (receipt.paidProducts.get(i).price * receipt.paidProducts.get(i).num);
            sumDiscount += receipt.productDiscounts.get(i);

        }
        System.out.println("Total price: " + (sum-sumDiscount));
        System.out.println("Total discount: " + sumDiscount);

        System.out.println("TADAAA====");

        System.out.println("currentProducts: " + currentProducts);
    }

}
