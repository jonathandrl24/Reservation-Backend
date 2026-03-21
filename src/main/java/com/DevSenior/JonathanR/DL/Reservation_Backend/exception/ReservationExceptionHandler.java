package com.DevSenior.JonathanR.DL.Reservation_Backend.exception;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ReservationExceptionHandler {

    @ExceptionHandler(ReservationBusinessException.class)
    public ResponseEntity<Map<String, String>> handleReservationBusiness(ReservationBusinessException ex) {
        return ResponseEntity.status(ex.getHttpStatus()).body(Map.of("message", ex.getMessage()));
    }

}
