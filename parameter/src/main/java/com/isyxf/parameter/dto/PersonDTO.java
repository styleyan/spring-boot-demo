package com.isyxf.parameter.dto;

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
