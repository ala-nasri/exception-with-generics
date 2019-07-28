package com.nasri.rest.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nasri.rest.exceptions.ClientException;
import com.nasri.rest.exceptions.ServerException;
import com.nasri.rest.exceptions.ClientException.ClientError;
import com.nasri.rest.exceptions.ServerException.ServerError;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping("/{value}")
	public Map<String, String> hello(@PathVariable("value") String value) throws ClientException, ServerException {
		doSomething(value);
		return Map.of("value", value);
	}

	private void doSomething(String value) throws ClientException, ServerException {
		switch (value) {
		case "client":
			throw new ClientException(ClientError.CLIENT_ERROR);
		case "server":
			throw new ServerException(ServerError.SERVER_ERROR);
		default: // do nothing
			break;
		}
	}

}
