package com.staples.edp.azure.ops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AzureOpsController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getRoot() {
		return "testing";
	}

}
