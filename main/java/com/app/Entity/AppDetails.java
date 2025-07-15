package com.app.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="App_Details")
public class AppDetails
{
@Id	
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(name="Appname",nullable=false,unique = true)
private String appname;
@Column(name = "Attackname", nullable = false)
private String attackName;

@Column(name="Oldversion",nullable=false)
private String oldversion;
@Column(name="Newversion",nullable=false)
private String newversion;
@Column(name="Appid",nullable=false)
private String appid;
@Column(name="Appossupport",nullable=false)
private String ossupport;
@Column(name="Appstatus",nullable=false)
private String status;
}
