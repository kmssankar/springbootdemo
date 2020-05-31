package org.kms.springboot.Springbootdemo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ISSUEDETAIL")
public class IssueDetail {
	
	@Id
	@Column(name="ISSUE_ID")
	long issueId;
	@Column(name="ISSUE_NAME",length=45)
	String issueName;
	@Column(name="ISSUE_TYPE",length=30)
	String issueType;
	@Column(name="ISSUE_FREQUENCY",length=30)
	String issueFrequency;
	@Column(name="ISSUE_ABOUT",length=60)
	String issueAbout;
	@Column(name="ISSUE_PUBLISHER",length=30)
	String issuePublisher;
	@Column(name="ISSUE_ORIGIN",length=30)
	String issueOrigin;
	@Column(name="ISSUE_ACTIVE",length=1)
	String issueActive;
	@Column(name="ISSUE_LASTUPTTS")
	@Temporal(TemporalType.TIMESTAMP)
	Date lstUpdtTimestamp;
	
	/**
	 * @return the issueId
	 */
	public long getIssueId() {
		return issueId;
	}
	/**
	 * @param issueId the issueId to set
	 */
	public void setIssueId(long issueId) {
		this.issueId = issueId;
	}
	/**
	 * @return the issueName
	 */
	public String getIssueName() {
		return issueName;
	}
	/**
	 * @param issueName the issueName to set
	 */
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}
	/**
	 * @return the issueType
	 */
	public String getIssueType() {
		return issueType;
	}
	/**
	 * @param issueType the issueType to set
	 */
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	/**
	 * @return the issueFrequency
	 */
	public String getIssueFrequency() {
		return issueFrequency;
	}
	/**
	 * @param issueFrequency the issueFrequency to set
	 */
	public void setIssueFrequency(String issueFrequency) {
		this.issueFrequency = issueFrequency;
	}
	/**
	 * @return the issueAbout
	 */
	public String getIssueAbout() {
		return issueAbout;
	}
	/**
	 * @param issueAbout the issueAbout to set
	 */
	public void setIssueAbout(String issueAbout) {
		this.issueAbout = issueAbout;
	}
	/**
	 * @return the issuePublisher
	 */
	public String getIssuePublisher() {
		return issuePublisher;
	}
	/**
	 * @param issuePublisher the issuePublisher to set
	 */
	public void setIssuePublisher(String issuePublisher) {
		this.issuePublisher = issuePublisher;
	}
	/**
	 * @return the issueOrigin
	 */
	public String getIssueOrigin() {
		return issueOrigin;
	}
	/**
	 * @param issueOrigin the issueOrigin to set
	 */
	public void setIssueOrigin(String issueOrigin) {
		this.issueOrigin = issueOrigin;
	}
	
	/**
	 * @return the issueActive
	 */
	public String getIssueActive() {
		return issueActive;
	}
	/**
	 * @param issueActive the issueActive to set
	 */
	public void setIssueActive(String issueActive) {
		this.issueActive = issueActive;
	}
	
	/**
	 * @return the lstUpdtTimestamp
	 */
	public Date getLstUpdtTimestamp() {
		return lstUpdtTimestamp;
	}
	/**
	 * @param lstUpdtTimestamp the lstUpdtTimestamp to set
	 */
	public void setLstUpdtTimestamp(Date lstUpdtTimestamp) {
		this.lstUpdtTimestamp = lstUpdtTimestamp;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IssueDetail [issueId=" + issueId + ", issueName=" + issueName + ", issueType=" + issueType
				+ ", issueFrequency=" + issueFrequency + ", issueAbout=" + issueAbout + ", issuePublisher="
				+ issuePublisher + ", issueOrigin=" + issueOrigin + "]";
	}	
	
}
