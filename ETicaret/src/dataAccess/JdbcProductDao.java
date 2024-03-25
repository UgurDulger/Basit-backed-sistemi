package dataAccess;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class JdbcProductDao implements ProductDao{
    List<Product> productdb = new ArrayList<>();
    @Override
    public void add(Product product) {
        System.out.println("Added by JDBC");
        productdb.add(product);
    }

    @Override
    public List<Product> getAll() {
        System.out.println("Showna by JDBC");
        return productdb;
    }
}
