package com.rest.restapi;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonResources {

	private static final String template = "%s is %d years old";
	private static AtomicLong idGenerator = new AtomicLong();

	@GetMapping("/person")
	public Person getPerson(@RequestParam(name = "name", defaultValue = "Truta") String name,
			@RequestParam(name = "age", defaultValue = "20") Integer age) {
		return new Person(idGenerator.getAndIncrement(), String.format(template, name, age));
	}
}
