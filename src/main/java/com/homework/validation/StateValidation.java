package com.homework.validation;

import com.homework.anno.State;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class StateValidation implements ConstraintValidator<State, String> {
    /**
     *
     * @param value
     * @param context
     * @return
     */
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        //提供校验规则
        if (value == null){
            return false;
        }
        if (value.equals("出库") || value.equals("入库")){
            return true;
        }
        return false;
    }
}
