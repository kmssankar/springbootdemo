package org.kms.springboot.Springbootdemo.repository;

import java.util.List;

import org.kms.springboot.Springbootdemo.entities.IssueDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IssueDetailRepository extends JpaRepository<IssueDetail, Integer> {

	 @Query(value = "SELECT i FROM IssueDetail i")
	    List<IssueDetail> findAllConfiguredIssues();
	 
	 @Query(value = "SELECT max(i.issueId) FROM IssueDetail i")
		public Integer getmax();
}
