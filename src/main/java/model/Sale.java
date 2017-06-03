package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;

/**
 * Created by Evegeny on 03/04/2017.
 */
@Data
@NoArgsConstructor
public class Sale {
    @Delegate
    @JsonIgnore
    private Order order = new Order();
    private Salesman salesman;

    public Sale(Order order, Salesman salesman) {
        this.order = order;
        this.salesman = salesman;
    }
}
