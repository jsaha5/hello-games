package com.imaginetomorrow.hellogames.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/games")
public class Games {

	@RequestMapping(method=RequestMethod.GET)
	public String getAllgames() {
		return "welcome to hello games";
	}
}
