package org.kms.springboot.Springbootdemo.DBUtils;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class SequenceUtils {
	@Autowired
	JdbcTemplate jdbcTemplate;
    		
	public int getMaxSequence(String table,String column) {
		String queryformaxSequence = DBUtilConstants.maxSeqQuery.replace("#C", column).replace("#T", table);
		return 0;
	}

}
