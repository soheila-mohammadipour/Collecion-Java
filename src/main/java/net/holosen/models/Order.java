package net.holosen.models;

import net.holosen.enums.OrderStatus;
import net.holosen.enums.ProductType;

public class Order {
    private Integer id;
    private Product product;
    private Long count;
    private ProductType productType;
    private Integer day;
    private OrderStatus status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }


    public void setStatus(OrderStatus status){
        this.status = status;
    }
    public void setStatus(Integer status) {
        switch (status){
            case 1:
                this.status=OrderStatus.InProgress;
                break;
            case 2:
                this.status=OrderStatus.Done;
                break;
        }

    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product=" + product.getName() +
                ", count=" + count +
                ", productType=" + productType +
                ", day=" + day +
                ", status=" + status +
                '}';
    }


}
