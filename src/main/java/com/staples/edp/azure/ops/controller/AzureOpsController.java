package com.staples.edp.azure.ops.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class AzureOpsController {
	
	private final static Logger logger = LoggerFactory.getLogger(AzureOpsController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String getRoot() {
		logger.info("Get root called, returning satic string");
		logger.debug("Get root called, returning satic string");
		return "testing";
	}
	
	@RequestMapping(path = "log", method = RequestMethod.GET)
	public String testLogs(@RequestParam(name="text",required=true) String text) {
		logger.info("testLogs called, returning " + text);
		logger.debug("testLogs called, returning " + text);
		return text;
	}

}
