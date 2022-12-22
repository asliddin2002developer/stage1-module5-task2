package com.epam.mjc;

import java.util.function.Function;
import java.util.stream.Collectors;

public class InterfaceCreator {



    public Operation<Integer> divideBy(Integer divider) {
        Function<Integer, Integer> devide = integer -> integer / divider;
        return operation -> operation.stream()
                                    .map(devide)
                                    .collect(Collectors.toList());
    }
}
