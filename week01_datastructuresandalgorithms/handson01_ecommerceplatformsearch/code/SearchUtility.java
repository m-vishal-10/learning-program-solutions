package week01_datastructuresandalgorithms.handson01_ecommerceplatformsearch.code;

import java.util.Arrays;
import java.util.Comparator;

public class SearchUtility {

    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = products[mid].productName.compareToIgnoreCase(name);

            if (compare == 0)
                return products[mid];
            else if (compare < 0)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return null;
    }

    public static void sortByProductName(Product[] products) {
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));
    }
}
