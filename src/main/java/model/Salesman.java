package model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by Evegeny on 04/04/2017.
 */
@Data
@Slf4j
public class Salesman extends Person {


    private Department department;

    @java.beans.ConstructorProperties({"id", "name","department"})
    public Salesman(int id, String name, Department department) {
        super(id, name);
        this.department = department;
    }
}














