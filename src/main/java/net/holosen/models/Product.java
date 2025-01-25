package net.holosen.models;

import net.holosen.enums.ProductType;

public abstract class Product {

    private String name;
    private String code;
    private  Long price;
    private String mainTainDescription;
    private String address;
    private ProductType type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getMainTainDescription() {
        return mainTainDescription;
    }

    public void setMainTainDescription(String mainTainDescription) {
        this.mainTainDescription = mainTainDescription;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }
    public void setType(Integer type) {
        switch (type){
            case 1:
                this.type= ProductType.Canned;
                break;
            case 2:
                this.type= ProductType.Health;
                break;
            case 3:
                this.type= ProductType.Dairy;
                break;
            case 4:
                this.type= ProductType.JunkFood;
                break;
            case 5:
                this.type= ProductType.Protein;
                break;

        }
    }
}
