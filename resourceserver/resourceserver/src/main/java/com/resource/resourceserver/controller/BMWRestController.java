package com.resource.resourceserver.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMWRestController {
	
	@RequestMapping(value = "/createBMW", method = RequestMethod.POST)
	public String creating() {
		return "let's create BMW";
	}
	
	@RequestMapping(value = "/updateBMW", method = RequestMethod.PUT)
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public String updating() {
		return "let's update BMW";
	}
	
	@RequestMapping(value = "/deleteBMW", method = RequestMethod.DELETE)
	public String deleteBMW() {
		return "let's delete BMW";
	}
	
	@RequestMapping(value = "/listBMW", method = RequestMethod.GET)
	public String listBMW() {
		return "let's list BMW";
	}
}
