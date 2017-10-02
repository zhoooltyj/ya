package homework.hwthree.Checkouter;

import java.util.List;

/**
 * Created by polosatik on 02.10.17.
 */
public class Presentation {

    static CheckoutService checkoutService = new CheckoutService();

    public static void main(String[] args) {
        //получить все товары
        List<Product> availableProducts= checkoutService.showAvailableProducts();
        System.out.println(availableProducts);

        //выбор товара для покупки
        Product boughtProduct = null;
        for(Product p: availableProducts){
            if(p.name.equals("pen")){
                boughtProduct = p;
            }
        }

        //устанавливаем количество покупаемого товара
        boughtProduct.num = 1;

        //формируем корзину
        Cart cart = checkoutService.createCart();
        checkoutService.addProductToCart(cart, boughtProduct);

        //создаем скидочную карту
        DiscountCard discountCard = new DiscountCard(0.3);

        //покупка
        Receipt receipt = checkoutService.payCart(cart, discountCard);

        //печать чека
        checkoutService.printcheck(receipt);
    }
}
