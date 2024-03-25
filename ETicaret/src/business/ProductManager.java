package business;

import dataAccess.ProductDao;
import entities.Product;
import loggers.Logger;

import java.util.List;

public class ProductManager {
    ProductDao productDao;
    List<Logger> loggers;

    public ProductManager(ProductDao productDao,List<Logger>loggers){
        this.productDao=productDao;
        this.loggers=loggers;
    }
     public void add(Product product){
        for(var logger:loggers){
            logger.log("added ");
        }
        productDao.add(product);
     }
     public List<Product> getAll(){
         for(var logger:loggers){
             logger.log("listed ");
         }
        return productDao.getAll();
     }
}
