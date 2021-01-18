package com.learinglearning.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
public class User {
    @NotEmpty(message = "用户名不能为空")
    private String name;
    @Max(value =  100 , message = "年龄不能超过100")
    @Min(value = 18, message = "必须年满18")
    private int age;
    @NotEmpty(message = "密码不能为空")
    @Length(min=6,message = "密码长度不能小于6位")
    private String pass;

}
