package com.example.demo.service;

import java.util.List;

import com.example.demo.binding.ReportAPI;

public interface ReportAPIService {
	public String ReportAPI(ReportAPI reportAPI);
	
	public List<ReportAPI> getAPIReportAPI();
	
	public ReportAPI getReportAPIById(Integer ReportAPIId);
	

}
