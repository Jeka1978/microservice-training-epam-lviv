package model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDateTime;

/**
 * Created by Evegeny on 03/04/2017.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        Purchase purchase = new Purchase(Order.builder().when(LocalDateTime.now()).price(2000).product2Number(Product.INTELIJ, 3).product2Number(Product.ARTIFACTORY, 1).discount(70).build(), new Customer(1, "Jeka", 38));

        String json = mapper.writeValueAsString(purchase);
        System.out.println("json = " + json);
        Purchase purchase1 = mapper.readValue(json, Purchase.class);
        System.out.println("purchase1 = " + purchase1);
        Sale sale = new Sale(purchase1.getOrder(), new Salesman(12, "Dima", Department.ACCESSORIES));
        String jsonSale = mapper.writeValueAsString(sale);
        System.out.println("jsonSale = " + jsonSale);
        Sale sale1 = mapper.readValue(jsonSale, Sale.class);
        System.out.println("sale1 = " + sale1);





    }
}
