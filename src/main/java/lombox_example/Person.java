package lombox_example;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Created by Evegeny on 03/06/2017.
 */
@Data
@Builder
@Slf4j
public class Person {
    @NonNull
    private String name;
    private int age;
    @Singular("oneFish")
    private List<String> fish;



    @SneakyThrows
    public static void main(String[] args) {
        Person person = Person.builder().age(18).name("Bogdana").oneFish("Leff").build();
        System.out.println("person = " + person);

        log.info("sdkjkdasj");

    }




















}
