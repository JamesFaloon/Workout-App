package com.faloon.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todaysWorkout")
public class workoutController {
	
	
	@GetMapping
	public String todaysWorkout(Model model) {
		return "workout";
		
	}
	
	
	

}
