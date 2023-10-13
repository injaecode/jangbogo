package com.jangbogo.advice.error;

import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import com.jangbogo.advice.payload.ErrorCode;

import lombok.Getter;

@Getter
public class InvalidParameterException extends DefaultException {

    private final Errors errors;

    public InvalidParameterException(Errors errors) {
        super(ErrorCode.INVALID_PARAMETER);
        this.errors = errors;
    }

    public List<FieldError> getFieldErrors() {
        return errors.getFieldErrors();
    }
}
