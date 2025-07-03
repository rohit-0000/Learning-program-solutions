import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Shoes", "Fashion"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Book", "Education"),
            new Product(4, "Watch", "Fashion"),
            new Product(5, "Phone", "Electronics")
        };

        System.out.println("🔍 Linear Search:");
        Product found1 = Search.linearSearch(products, "Laptop");
        System.out.println(found1 != null ? "Found: " + found1 : "Not found");

        System.out.println("\n🔍 Binary Search:");
        // Sort array before binary search
        Arrays.sort(products, Comparator.comparing(p -> p.productName));
        Product found2 = Search.binarySearch(products, "Laptop");
        System.out.println(found2 != null ? "Found: " + found2 : "Not found");
    }
}
