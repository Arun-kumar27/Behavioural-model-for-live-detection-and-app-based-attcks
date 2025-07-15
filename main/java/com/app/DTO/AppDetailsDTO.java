package com.app.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AppDetailsDTO
{
	private String appname;
	private String attackName;      
	private String oldversion;
	private String newversion;
	private String  appid;
	private String ossupport;
	private String status;
	

}
