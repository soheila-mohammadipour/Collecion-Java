package net.holosen;

import net.holosen.enums.OrderStatus;
import net.holosen.models.IncorruptibleProduct;
import net.holosen.models.Order;
import net.holosen.models.Product;
import net.holosen.models.corruptibleProduct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class mainApp {
    private static List<Product> productList;
    private static List<Order> orderList;

    static {
        productList = new ArrayList<>();
        orderList = new ArrayList<>();

    }

    public static void main(String[] args) {
        while (true) {
            try {
                showMenue();
                Integer menue = Integer.parseInt(getInput());
                switch (menue) {
                    case 1:
                        addProduct();
                        break;
                    case 2:
                        addOrder();
                        break;
                    case 3:
                        showOrderList();
                        changeStatus();
                        break;
                    case 0:
                        print("Goodbye");
                        return;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {

            }
        }
    }


    private static void showOrderList() {
        for (Order order :orderList
        ) {print(order.toString());


        }
    }

    private static void changeStatus() throws IOException {
        print("please enter Order code:");
        Integer id=getIntegerInput();
        for (Order order:orderList
             ) {if (order.getId()==id){
                 print("please enter status:");
                 print("1-inprogress");
            print("2-done");
            order.setStatus(getIntegerInput());
            print("Status change successfully.");
            break;

        }

        }

    }


    private static void addOrder() throws Exception {
        print("please enter Product Code:");
        String code=getInput();
        Product product=null;
        for (Product item:productList) {
            if (item.getCode().toLowerCase().equals(code.toLowerCase())) {
                product = item;
                break;
            }
        }

            if (product == null)
                throw new Exception("ERROR");

                Order order = new Order();
                order.setProduct(product);
                order.setProductType(product.getType());
                order.setStatus(OrderStatus.InQue);
                print("please enter Count :");
                order.setCount(Long.parseLong(getInput()));
                print("please enter release Day");
                order.setDay(getIntegerInput());
                order.setId(orderList.size() + 1);
                orderList.add(order);
                print("order added succsessfully.");



        }



    private static void addProduct() throws IOException {
        Product product;
        print("Please enter Product Type:");
        print("1- Canned");
        print("2- Health");
        print("3- Dairy");
        print("4- JunkFood");
        print("5-  Protein");
        Integer type = Integer.parseInt(getInput());


        switch (type) {
            case 1:
            case 2:
            case 4:
                product = new IncorruptibleProduct();
                print("please enter maintain MaxDay:");
                ((IncorruptibleProduct) product).setMaintainMaxDay(getIntegerInput());

                break;
            case 3:
            case 5:
                product = new corruptibleProduct();
                print("please enter min Tempereture :");
                ((corruptibleProduct) product).setMintemperature(getIntegerInput());
                print("please enter max Tempereture :");
                ((corruptibleProduct) product).setMaxtemperature(getIntegerInput());
                break;


            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        product.setType(type);

        print("please enter Product Name:");
        product.setName(getInput());
        print("please enter Product Code:");
        product.setCode(getInput());
        print("please enter Product price:");
        product.setPrice(Long.parseLong(getInput()));
        print("please enter Product Maintain description:");
        product.setMainTainDescription(getInput());
        print("please enter Product Address:");
        product.setAddress(getInput());
        productList.add(product);
        print("Product added Successfully.");
    }

    //region helper Methods
    private static void showMenue() {
        print("please Select one of these:");
        print("1- Add New Product.");
        print("2- Add Order.");
        print("3- Change Orderstatus.");
        print("0- Exite.");
    }

    private static void print(String msg) {
        System.out.println(msg);
    }

    private static String getInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    private static Integer getIntegerInput() throws IOException {
        return Integer.parseInt(getInput());
    }
    //end region
}
