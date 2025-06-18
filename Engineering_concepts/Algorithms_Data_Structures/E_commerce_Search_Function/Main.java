package Engineering_concepts.Algorithms_Data_Structures.E_commerce_Search_Function;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shampoo", "Beauty"),
            new Product(103, "Book", "Education"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Chair", "Furniture")
        };

        // Linear Search
        System.out.println("Linear Search for 'Mobile':");
        Product foundLinear = SearchUtility.linearSearch(products, "Mobile");
        System.out.println(foundLinear != null ? foundLinear : "Product not found.");

        // Binary Search (requires sorted array)
        SearchUtility.sortByProductName(products);
        System.out.println("\nBinary Search for 'Mobile':");
        Product foundBinary = SearchUtility.binarySearch(products, "Mobile");
        System.out.println(foundBinary != null ? foundBinary : "Product not found.");
    }
}
