package com.naya.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * Created by Evegeny on 03/06/2017.
 */
@Data
@Builder
@AllArgsConstructor
public class SerialsUser {
    private long id;
    private String name;
    private int age;
    @Singular
    private List<String> recommendations;
    @Singular
    private Map<String,Integer> priorities;

    @SneakyThrows
    public static void main(String[] args) {
        SerialsUser user = SerialsUser.builder().age(18).name("Marina")
                .priority("drama", 40).priority("comedy", 35).priority("horror", 100)
                .recommendation("Game Of Thrones").recommendation("Office").id(1).build();
        String valueAsString = new ObjectMapper().writeValueAsString(user);
        System.out.println(valueAsString);
    }

}










