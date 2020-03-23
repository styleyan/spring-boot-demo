package com.isyxf.parameter.v1.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
public class SchoolDTO {
    @Length(min = 3)
    private String schoolName;
}
