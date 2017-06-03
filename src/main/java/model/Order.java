package model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Evegeny on 03/04/2017.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Singular
    private Map<Product, Integer> product2Numbers = new HashMap<>();
    private LocalDateTime when;
    private int price;
    private int discount;
}
