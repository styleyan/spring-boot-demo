package com.isyxf.parameter.v3.dto;

import com.isyxf.parameter.v3.validator.GroupA;
import com.isyxf.parameter.v3.validator.GroupB;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.groups.Default;

/**
 * @Author Y.jer
 * 人的信息
 */
@Getter
@Setter
public class Person {
    @NotBlank
    @Range(min = 1, max = Integer.MAX_VALUE, message = "必须大于0", groups = {GroupA.class})
    /** 用户id **/
    private Integer userId;

    @NotBlank
    @Length(min = 3, max = 20, message = "长度需要1~20位", groups = {GroupB.class})
    /** 用户名称 **/
    private String userName;

    @NotBlank
    @Range(min = 0, max = 100, message = "年龄在0~100之间", groups = Default.class)
    /** 年龄 **/
    private Integer age;

    @NotBlank
    @Range(min = 0, max = 2, message = "性别有误", groups = {GroupB.class})
    /** 性别 0:位置; 1:男; 2:女 **/
    private Integer sex;
}
