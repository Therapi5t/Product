import product.Product;
import product.ProductsImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProductsImpl products = new ProductsImpl();

        // Добавляем продукты
        Product apple = new Product("1", "apple");
        Product banana = new Product("2", "banana");
        Product orange = new Product("3", "orange");
        products.addProduct(apple);
        products.addProduct(banana);
        products.addProduct(orange);

        // Проверяем метод getName
        System.out.println(products.getName("1")); // Output: apple
        System.out.println(products.getName("4")); // Output: ""

        // Удаляем продукт
        products.deleteProduct(banana);

        // Ищем продукты по имени
        List<Product> productList = new ArrayList<>();
        productList.add(apple);
        productList.add(orange);
        List<String> result = products.findByName(productList, "apple");
        System.out.println(result); // Output: [1]
    }
}