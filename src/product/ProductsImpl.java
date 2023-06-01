package product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsImpl {
    private Map<String, Product> products = new HashMap<>();

    public boolean addProduct(Product product) {
        if (products.containsKey(product.getId())) {
            return false;
        }
        products.put(product.getId(), product);
        return true;
    }

    public boolean deleteProduct(Product product) {
        if (products.containsKey(product.getId())) {
            products.remove(product.getId());
            return true;
        }
        return false;
    }

    public String getName(String id) {
        if (products.containsKey(id)) {
            return products.get(id).getName();
        }
        return "";
    }

    public List<String> findByName(List<Product> productList, String name) {
        List<String> result = new ArrayList<>();
        for (Product product : products.values()) {
            if (product.getName().equals(name)) {
                result.add(product.getId());
            }
        }
        return result;
    }
}

