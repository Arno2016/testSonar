package com.harvey.www.util;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;

import com.harvey.www.Exception.ValidatorException;

public class ValidatorUtils {
	
	public static <T> boolean validateBean(T bean,Class<?>... groups) throws ValidatorException {
		Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
		Set<ConstraintViolation<T>> validators = validator.validate(bean, groups);
		if (CollectionUtils.isEmpty(validators)) {
			return true;
		}
		StringBuilder sb = new StringBuilder();
        for (ConstraintViolation<T> constraintViolation : validators) {
            sb.append(constraintViolation.getMessage()+",");
        }
        throw new ValidatorException(HttpStatus.BAD_REQUEST.toString(),sb.substring(0,sb.lastIndexOf(",")).toString());
	}
}
