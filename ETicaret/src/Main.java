import business.ProductManager;
import dataAccess.HibernateProductDao;
import entities.Product;
import loggers.DbLogger;
import loggers.FileLogger;
import loggers.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
        product1.setName("çikolata");
        product1.setId(1);
        product1.setUnitPrice(25);

        product2.setName("bisküvi");
        product2.setId(2);
        product2.setUnitPrice(40);

        product3.setName("cips");
        product3.setId(3);
        product3.setUnitPrice(50);

        List<Logger> loggers = new ArrayList<>(){{
            add(new FileLogger());
            add(new DbLogger());
        }};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);

        List<Product> products = productManager.getAll();
        for (var product :products){
            System.out.println(product.getId());
            System.out.println(product.getName());
            System.out.println(product.getUnitPrice());
        }

    }
}