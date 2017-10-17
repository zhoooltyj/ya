package homework.hwthree.Checkouter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by polosatik on 02.10.17.
 */
public class Receipt {
    List<Product> paidProducts = new ArrayList<>();
    List<Double> productDiscounts = new ArrayList<>();

    @Override
    public String toString() {
        return "Receipt{" +
                "paidProducts=" + paidProducts +
                ", productDiscounts=" + productDiscounts +
                '}';
    }
}
