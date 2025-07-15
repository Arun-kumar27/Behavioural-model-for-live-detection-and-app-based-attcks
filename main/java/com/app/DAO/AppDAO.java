package com.app.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.Entity.AppDetails;
import com.app.repository.AppRepository;
@Repository
public class AppDAO 
{
	@Autowired
	private AppRepository appRepository;
	
	public AppDetails insertappdetails(AppDetails appDetails)
	{
		 return appRepository.save(appDetails);
		
	}
	public List<AppDetails> getAllthedetails()
	{
		 return appRepository.findAll();
	}
	public List<AppDetails> fiterdetailsByusingname(String appname)
	{
		 return appRepository.findByAppnameOrOldversion(appname,appname);
	}

}

