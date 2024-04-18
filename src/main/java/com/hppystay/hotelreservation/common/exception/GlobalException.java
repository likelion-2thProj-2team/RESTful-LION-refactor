package com.hppystay.hotelreservation.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GlobalException extends RuntimeException {
    private GlobalErrorCode errorCode;
}
