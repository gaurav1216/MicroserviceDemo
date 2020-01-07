package com.example.demo;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;

@RestController
public class DemoController {
	
	@Autowired
	private RestTemplate template;

	@RequestMapping("/hello")
	@ResponseBody
	public String getDemoData() {
		return "Hello World";
	}
	@RequestMapping("/movies")
	@HystrixCommand(fallbackMethod = "getMovieFallBack")
	public List<Movie> getMovie(){
		
		
		Rating r1=template.getForObject("http://DEMO-APPLICATION1/rating/0", Rating.class);
		Rating r2=template.getForObject("http://DEMO-APPLICATION1/rating/1", Rating.class);
		
		
		List<Movie> list=new ArrayList<>();
		//Rating r1=new Rating(1,"5");
		list.add(new Movie("Veer Zara",0,r1));
		//Rating r2=new Rating(2,"4");
		list.add(new Movie("Swadesh",1,r2));
		return list;
				
	}
	public List<Movie> getMovieFallBack(){
		Rating r1=new Rating(0, "4");
		Rating r2=new Rating(1, "5");
		
		
		List<Movie> list=new ArrayList<>();
		//Rating r1=new Rating(1,"5");
		list.add(new Movie("Veer Zara",0,r1));
		//Rating r2=new Rating(2,"4");
		list.add(new Movie("Swadesh",1,r2));
		return list;
		
		
	}
}
