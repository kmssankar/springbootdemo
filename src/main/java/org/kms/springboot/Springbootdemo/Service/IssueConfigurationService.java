package org.kms.springboot.Springbootdemo.Service;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.kms.springboot.Springbootdemo.entities.IssueDetail;
import org.kms.springboot.Springbootdemo.repository.IssueDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IssueConfigurationService {
	private static final Logger logger = LoggerFactory.getLogger(IssueConfigurationService.class);
	@Autowired
	IssueDetailRepository issueDetailRepository;

	public boolean configureNewIssue(IssueDetail issueDetail) {
		if (issueDetailRepository.getmax() != null)
			{
				int newSequence = issueDetailRepository.getmax() + 1;
				issueDetail.setIssueId(newSequence);
			} else
			issueDetail.setIssueId(1);
		issueDetail.setIssueActive("Y");
		issueDetail.setLstUpdtTimestamp(new Date());
		logger.info(" inside Repo " + issueDetail);
		issueDetailRepository.save(issueDetail);
		return true;
	}

	public String deleteIssue(int id) {
		String returnMessage = null;
		try
			{
				if (issueDetailRepository.getOne(id) != null)
					{
						issueDetailRepository.deleteById(id);
						returnMessage = "Issues deleted successfully id-> " + id;
					}
			} catch (EntityNotFoundException e)
			{
				return "No Issue Available to Delete " + id;
			}
		return returnMessage;
	}
	
	public String updateIssue(IssueDetail issueDetail) {
		String returnMessage = null;
		try
			{
				if (issueDetailRepository.getOne((int) (issueDetail.getIssueId())) != null)
					{
						IssueDetail issueDetailGet = issueDetailRepository.getOne((int) (issueDetail.getIssueId()));
						issueDetailGet.setIssueName(issueDetail.getIssueName());
						issueDetailGet.setIssueAbout(issueDetail.getIssueAbout());
						issueDetailGet.setIssueFrequency(issueDetail.getIssueFrequency());
						issueDetailGet.setIssueOrigin(issueDetail.getIssueOrigin());
						issueDetailGet.setIssuePublisher(issueDetail.getIssuePublisher());
						issueDetailGet.setIssueType(issueDetail.getIssueType());
						issueDetailGet.setIssueActive("Y");
						issueDetailGet.setLstUpdtTimestamp(new Date());
						issueDetailRepository.save(issueDetail);
						returnMessage = "Issues deleted successfully id-> " + issueDetail.getIssueId();
					}
			} catch (EntityNotFoundException e)
			{
				return "No Issue Available to Update " + issueDetail.getIssueId();
			}
		return returnMessage;
	}
	
	public List<IssueDetail> getallissues(){
		return issueDetailRepository.findAll();
	}
}
