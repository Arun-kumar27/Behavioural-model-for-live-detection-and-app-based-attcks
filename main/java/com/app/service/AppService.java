package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.DAO.AppDAO;
import com.app.DTO.AppDetailsDTO;
import com.app.Entity.AppDetails;
import com.app.repository.AppRepository;


@Service
public class AppService 
{
	private final AppRepository appRepository;
	@Autowired
	private AppDAO appDAO;
	AppService(AppRepository appRepository)
	{
		this.appRepository=appRepository;
	}
	public AppDetailsDTO appregistration(AppDetailsDTO appDetailsDTO)
	{
		AppDetails appDetails=new AppDetails();
		appDetails.setAppname(appDetailsDTO.getAppname());
		appDetails.setAttackName(appDetailsDTO.getAttackName());
		appDetails.setOldversion(appDetailsDTO.getOldversion());
		appDetails.setNewversion(appDetailsDTO.getNewversion());
		appDetails.setAppid(appDetailsDTO.getAppid());
		appDetails.setOssupport(appDetailsDTO.getOssupport());
		appDetails.setStatus(appDetailsDTO.getStatus());
		AppDetails details=appDAO.insertappdetails(appDetails);
		if(appDetails.getId()!=0)
		{
			System.out.println("data inserted");
			return appDetailsDTO;
		}
		else
		{
			System.out.println("invalid data");
		}
		return  appDetailsDTO;
		
	}
	public List<AppDetails> getAlltheDetailsOfTheApp()
	{
		 List<AppDetails> allthedetails=appDAO.getAllthedetails();
		 if(allthedetails.size()>0)
		 {
			 return allthedetails;
		 }
		 else
		 {
			 return null;
		 }
	}
	
	public List<AppDetails> getthedetailsbyusingnameorversion(String find)
	{
		 return appDAO.fiterdetailsByusingname(find);
	}

}
