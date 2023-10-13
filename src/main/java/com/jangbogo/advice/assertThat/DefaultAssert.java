package com.jangbogo.advice.assertThat;

import com.jangbogo.advice.error.DefaultAuthenticationException;
import com.jangbogo.advice.error.DefaultException;
import com.jangbogo.advice.error.DefaultNullPointerException;
import com.jangbogo.advice.error.InvalidParameterException;
import com.jangbogo.advice.payload.ErrorCode;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;

public class DefaultAssert extends Assert {
    // 유효하지 않은 값
    public static void isTrue(boolean value) {
        if (!value) {
            throw new DefaultException(ErrorCode.INVALID_CHECK);
        }
    }

    // 유효하지 않은 값
    public static void isTrue(boolean value, String message) {
        if (!value) {
            throw new DefaultException(ErrorCode.INVALID_CHECK, message);
        }
    }

    // 유효하지 않은 매개변수
    public static void isValidParameter(Errors errors) {
        if (errors.hasErrors()) {
            throw new InvalidParameterException(errors);
        }
    }

    // 객체가 null일때
    public static void isObjectNull(Object object) {
        if (object == null) {
            throw new DefaultNullPointerException(ErrorCode.INVALID_CHECK);
        }
    }

    // 파일 경로가 null
    public static void isListNull(List<Object> values) {
        if (values.isEmpty()) {
            throw new DefaultException(ErrorCode.INVALID_FILE_PATH);
        }
    }

    // 파일 경로가 null
    public static void isListNull(Object[] values) {
        if (values == null) {
            throw new DefaultException(ErrorCode.INVALID_FILE_PATH);
        }
    }

    // 잘못된 요청
    public static void isOptionalPresent(Optional<?> value) {
        if (!value.isPresent()) {
            throw new DefaultException(ErrorCode.INVALID_PARAMETER);
        }
    }

    // 데이터 포맷이 유효하지 않을 때
    public static void isAuthentication(String message) {
        throw new DefaultAuthenticationException(message);
    }

    // 인증키가 유효하지 않을 때
    public static void isAuthentication(boolean value) {
        if (!value) {
            throw new DefaultAuthenticationException(ErrorCode.INVALID_AUTHENTICATION);
        }
    }

}
