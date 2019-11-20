package controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import contact.MyClass;
import contact.MyInterface;

@RestController
public class Controller {

	MyInterface myInterface;
	@GetMapping("/hello")
	public ResponseEntity<List> greeting() {

		List<String> list = myInterface.hello("Ashok", "Hanumanthu", "Iowa");

		return new ResponseEntity<>(list, HttpStatus.OK);
	}
}
