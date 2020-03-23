package com.isyxf.parameter.v1.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PersonDTO {
    @NonNull
    private String name;
    @NonNull
    private Integer age;
}
