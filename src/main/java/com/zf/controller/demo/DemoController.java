package com.zf.controller.demo;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
// @RequestMapping(value="demo")
public class DemoController {
	
	private final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String demo(Map<String, Object> map) {
		logger.info("this is demo.");
		map.put("demo", "this is demo!");
		return "test";
	}

}
