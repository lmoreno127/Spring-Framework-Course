package com.travel.exercise2.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class RedentionCodeValidator implements ConstraintValidator<RedentionCode,String> {

    private String redentionCode;
    @Override
    public void initialize(RedentionCode redentionCode) {
       this.redentionCode = redentionCode.Value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {
        return code.startsWith(redentionCode);
    }
}
