package org.kms.springboot.Springbootdemo.Service;

import java.util.Date;

import org.kms.springboot.Springbootdemo.entities.IssueDetail;
import org.kms.springboot.Springbootdemo.repository.IssueDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueConfigurationService {
	private static final Logger logger  = LoggerFactory.getLogger(IssueConfigurationService.class);
	@Autowired
	IssueDetailRepository issueDetailRepository;
	public boolean configureNewIssue(IssueDetail issueDetail) {
		if(issueDetailRepository.getmax()!=null) {
		int newSequence = issueDetailRepository.getmax() + 1;
		issueDetail.setIssueId(newSequence);
		}else issueDetail.setIssueId(1);
		issueDetail.setIssueActive("Y");
		issueDetail.setLstUpdtTimestamp(new Date());
		logger.info(" inside Repo " + issueDetail);
		issueDetailRepository.save(issueDetail);
		return true;
	}

}
