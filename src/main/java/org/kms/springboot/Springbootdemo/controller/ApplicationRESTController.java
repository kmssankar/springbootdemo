package org.kms.springboot.Springbootdemo.controller;

import java.util.List;
import java.util.Optional;

import org.kms.springboot.Springbootdemo.Service.IssueConfigurationService;
import org.kms.springboot.Springbootdemo.entities.IssueDetail;
import org.kms.springboot.Springbootdemo.repository.IssueDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationRESTController {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationRESTController.class);
	@Autowired
	IssueDetailRepository issueDetailRepository;
	@Autowired
	IssueConfigurationService issueConfigurationService;

	@GetMapping("/getallissues")
	public List<IssueDetail> getallIssues() {
		
		return issueDetailRepository.findAll();
	}

	@GetMapping("/getissue")
	public IssueDetail getIssue(@RequestParam Integer id) {
		logger.info("/getissue " + id );
		Optional<IssueDetail> issuedetail = null;
		if (issueDetailRepository.findById(id) != null)
					{
						issuedetail=issueDetailRepository.findById(id) ;
						logger.info("/getissue after repository  " + issuedetail );
						return issuedetail.get();
					}
		else {
			return new IssueDetail();
		}
	}

	@PostMapping("/saveissue")
	public String saveIssue(@RequestBody IssueDetail issueDetail) {
		issueConfigurationService.configureNewIssue(issueDetail);
		return "Issue save succesfully";
	}
	
	@DeleteMapping("/deleteissue")
	public String deleteIssue(@RequestParam int id) {
		return issueConfigurationService.deleteIssue(id);
	}

	@PutMapping("/updateissue")
	public String updateIssue(@RequestBody IssueDetail issueDetail) {
		if (issueDetail.getIssueId() < 0)
			{
				return " Issue Detail Id should be an Integer";
			} else
			{
				issueConfigurationService.updateIssue(issueDetail);
				return "Issue updated succesfully -> " + issueDetail.getIssueId();
			}
	}
}
