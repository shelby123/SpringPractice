package com.example.demo.errorHandling;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalErrorController {
	
	@ExceptionHandler(ContentNotFound.class)
	public final ResponseEntity<ApiError> handleContentNotFound(Exception ex, WebRequest req)  {
		
		ApiError apiError = new ApiError(ex.getMessage());
		HttpStatus status = HttpStatus.NOT_FOUND;
		return new ResponseEntity<>(apiError, new HttpHeaders(), status);
	}

}
