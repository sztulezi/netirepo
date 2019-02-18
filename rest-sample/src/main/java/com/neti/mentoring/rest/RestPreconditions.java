package com.neti.mentoring.rest;

import com.neti.mentoring.exception.MyResourceNotFoundException;

public class RestPreconditions {

	public static <T> T checkFound(T resource) {
		if (resource == null) {
			throw new MyResourceNotFoundException();
		}
		return resource;
	}

}
