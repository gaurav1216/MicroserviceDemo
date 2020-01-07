package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/hello")
	@ResponseBody
	public String getDemoData() {
		return "Hello World";
	}

	@RequestMapping("/rating/{id}")
	public Rating getRating(@PathVariable("id") int id) {
		List<Rating> list = new ArrayList<>();
		Rating r1 = new Rating(0, "5");

		Rating r2 = new Rating(1, "4");
		list.add(r1);
		list.add(r2);

		return list.get(id);

	}
}
