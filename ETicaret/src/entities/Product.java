package entities;

import entities.BaseEntitiy;

import java.time.LocalDateTime;

public class Product extends BaseEntitiy {
    private String name;
    private int unitPrice;

    public Product(int id, LocalDateTime createdDate, LocalDateTime deletedDate, LocalDateTime updatedDate, String name, int unitPrice) {
        super(id, createdDate, deletedDate, updatedDate);
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public Product(String name, int unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }
    public Product(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
}
