package com.isyxf.parameter.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Setter
@Getter
public class SchoolDTO {
    @Length(min = 3)
    private String schoolName;
}
