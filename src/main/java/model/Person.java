package model;

import lombok.AllArgsConstructor;
import lombok.Value;
import lombok.experimental.NonFinal;

/**
 * Created by Evegeny on 04/04/2017.
 */
@Value
@NonFinal
@AllArgsConstructor
public class Person {
    private final int id;
    private final String name;
}
