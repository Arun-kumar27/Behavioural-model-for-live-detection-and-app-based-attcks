package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.app.DTO.AppDetailsDTO;
import com.app.Entity.AppDetails;
import com.app.repository.AppRepository;
import com.app.service.AppService;
@Controller
public class Appcontroller
{
	private final AppRepository appRepository;
	@Autowired
	private AppService appService;
	Appcontroller(AppRepository appRepository)
	{
		this.appRepository=appRepository;
	}
	
	@RequestMapping("/apprequest")
	public String Apploginrequest() 
	{
		return "AppDetails";

	}
	@ResponseBody
	@RequestMapping("/Appuser")
	public void Appuserrequest(AppDetailsDTO appDetailsDTO)
	{
		System.out.println(appDetailsDTO);
		appService.appregistration(appDetailsDTO);

	}
	
	@RequestMapping("/getallthedetails")
	public String getthedetailsoftheapps(Model model)
	{
		List<AppDetails> details=appService.getAlltheDetailsOfTheApp();
		model.addAttribute("displayallappdetails", details);
		return "DisplayAllAppDetails";
	}
	@RequestMapping("/getthedetails")
	public String getthedetailsbyusingname(String find,Model model)
	{
		List<AppDetails> list=appService.getthedetailsbyusingnameorversion(find);
		model.addAttribute("displayallappdetails", list);
		return "DisplayAllAppDetails";
	}

}
