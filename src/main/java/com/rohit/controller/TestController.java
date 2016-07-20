package com.rohit.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("test")
public class TestController {
	private static Logger logger = Logger.getLogger(TestController.class.getName());

	@RequestMapping(value = "/getTestForm", method = RequestMethod.GET)
	public ModelAndView getTestForm() {
		logger.info("TestController : getTestForm() invoked");
		return new ModelAndView("test/index");
	}

	@RequestMapping(value = "/postTestForm", method = RequestMethod.POST)
	public String postTestForm() {
		logger.info(this.getClass().getName() + "postTestForm() invoked");
		return "test/dashboard";
	}

}
