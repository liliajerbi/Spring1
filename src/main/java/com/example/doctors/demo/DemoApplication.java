package com.example.doctors.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul> <li> <a href = '/doctor/1'>William Hartnell </a> </li> <li> <a href = '/doctor/10'>David Tennant</li> <li><a href = '/doctor/13'>Jodie Whittaker</li>  <li> <a href = '/doctor/15'> Peter Davison </a> </li> </ul> ";
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String firstDoctor() {
		return "More information about <a href='https://en.wikipedia.org/wiki/William_Hartnell'>William Hartnell</a>";
	}

	@RequestMapping("/doctor/10")
	@ResponseBody
	public String secondDoctor() {
		return "More information about <a href='https://en.wikipedia.org/wiki/David_Tennant'>David Tennant</a>";
	}
	@RequestMapping("/doctor/13")
	@ResponseBody
	public String thirdDoctor() {
		return "More information about <a href='https://en.wikipedia.org/wiki/Jodie_Whittaker'>Jodie Whittaker</a>";
	}
	@RequestMapping("/doctor/15")
	@ResponseBody
	public String forthDoctor() {
		return "More information about <a href='https://en.wikipedia.org/wiki/Peter_Davison'>Peter Davison</a>";
	}
}
