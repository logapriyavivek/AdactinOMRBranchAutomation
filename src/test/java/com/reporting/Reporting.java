package com.reporting;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {

	public static void generateJVMReport(String jsonFile) {
		  File file =new File(System.getProperty("user.dir")+"\\target");
		  	Configuration configuration=new Configuration(file, "Adactin Automation");
		  
		  	configuration.addClassifications("OS", "WIN10");
		  	configuration.addClassifications("Browser", "Chrome");
		  	configuration.addClassifications("Version", "108");
		  	configuration.addClassifications("Sprint", "33");
		  	
		  	List<String> jsonFiles = new ArrayList<String>();
		  	jsonFiles.add(jsonFile);
		  	
		  	
		  	ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
		  	builder.generateReports();
		  	
	  }
}
