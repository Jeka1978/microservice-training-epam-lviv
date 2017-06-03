package model;

import lombok.Data;

/**
 * Created by Evegeny on 04/04/2017.
 */
@Data

public class Customer extends Person {
    private int age;

    @java.beans.ConstructorProperties({"id", "name","age"})
    public Customer(int id, String name,int age) {
        super(id, name);
        this.age = age;
    }
}
