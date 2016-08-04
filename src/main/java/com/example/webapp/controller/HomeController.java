package com.example.webapp.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.common.CdService;

@Controller
@RequestMapping(value="/")
public class HomeController {
	
	private static final Logger LOG = LogManager.getLogger(HomeController.class.getName());
	
	private CdService cdServ;
	
	@Autowired
	public HomeController(CdService cdServ) {
		this.cdServ = cdServ;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String home(Model model){
		LOG.info("Loading home page");
		model.addAttribute("cds", cdServ.findAll());
		return "home";
	}

}
