package org.kms.springboot.Springbootdemo.controller;

import org.kms.springboot.Springbootdemo.Service.IssueConfigurationService;
import org.kms.springboot.Springbootdemo.entities.IssueDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class ApplicationController {
	@Autowired
	IssueConfigurationService issueConfigurationService;
	private static final Logger logger  = LoggerFactory.getLogger(ApplicationController.class);
	
	@GetMapping("/configureissue")
	public String getSetupIssue(Model model) {
		model.addAttribute("issueDetail", new IssueDetail());
		return "issues/configureIssue";
	}
	
	@PostMapping("/configureissue")
	public String postSetupIssue(IssueDetail issueDetail,Model model) {
		logger.info("" + issueDetail);
		model.addAttribute("submitted", issueConfigurationService.configureNewIssue(issueDetail));
		model.addAttribute("issueDetail", new IssueDetail());
		return "issues/configureIssue";
	}
		
}
