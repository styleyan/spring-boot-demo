package com.isyxf.parameter.validators.my;

import lombok.Getter;
import lombok.Setter;

/**
 *
 */
@Getter
@Setter
public class User {
    @MyConstraint(max = 20, min = 1, message = "233,4")
    private long age;
}
