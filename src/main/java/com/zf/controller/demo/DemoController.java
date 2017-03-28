package com.zf.controller.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zf.service.DemoService;

@Controller
//@RequestMapping(value="demo")
public class DemoController {
	
	private final Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value = "/demo", method = RequestMethod.GET)
	public String demo(Map<String, Object> map) {
		logger.info("this is demo.");
		map.put("time", "current time: <br>");
		map.put("data", "this is demo: <br> hello world!");
		return "test";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Map<String, Object> map) {
		List<List<String>> list = demoService.getList();
		map.put("list", list);
		return "list";
	}
	
	@RequestMapping(value = "/map", method = RequestMethod.GET)
	public String map(Map<String, Object> map) {
		Map<String, String> m = new HashMap<String, String>();
		m.put("a", "a1");
		m.put("b", "b1");
		map.put("map", m);
		return "map";
	}

}

