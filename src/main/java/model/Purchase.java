package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 03/04/2017.
 */
@NoArgsConstructor
@Data
public class Purchase {

    @Delegate
    @JsonIgnore
    private Order order = new Order();

    private Customer customer;

    public Purchase(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
    }


}
