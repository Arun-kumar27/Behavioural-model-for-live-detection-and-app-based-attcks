package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entity.AppDetails;

public interface AppRepository extends  JpaRepository<AppDetails, Integer>
{
	 List<AppDetails> findByAppnameOrOldversion(String appname, String oldversion);
}
