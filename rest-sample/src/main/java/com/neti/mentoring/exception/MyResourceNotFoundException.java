package com.neti.mentoring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// az itt megadott http error code-ra mappelodik, ha az exception kikerul a rest apira
@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "bajci van")
public class MyResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

}
