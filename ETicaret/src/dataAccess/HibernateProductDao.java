package dataAccess;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class HibernateProductDao implements ProductDao{
    List<Product> productdb = new ArrayList<>();
    @Override
    public void add(Product product) {
        System.out.println("Added by Hibernate");
        productdb.add(product);
    }

    @Override
    public List<Product> getAll() {
        System.out.println("Shown by Hibernate");
        return productdb;
    }
}
