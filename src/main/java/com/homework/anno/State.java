package com.homework.anno;

import com.homework.validation.StateValidation;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented//元注解
@Target({ElementType.FIELD})//元注解
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {StateValidation.class})//提供校验规则的类
public @interface State {
    //提供校验失败后的提示信息
    String message() default "state参数的值只能是入库或者是出库";
    //指定分组
    Class<?>[] groups() default {};
    //负载 获取到state负载的附加信息
    Class<? extends Payload>[] payload() default {};
}
