package com.cjc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @RequestMapping("/")
	public String prelogin()
	{
		return "Addmision of Student";
	}
}
