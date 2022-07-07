package com.travel.exercise2.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = RedentionCodeValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RedentionCode {

 public String Value() default "COL";

 public String message() default "must start with COL";

 public Class<?>[] groups() default {};

 public Class<? extends Payload>[] payload() default {};


}
