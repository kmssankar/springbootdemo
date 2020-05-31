package org.kms.springboot.Springbootdemo.dto;

import java.util.Date;

public class WelcomeIndex {
	
	String message;
	Date date;
	
	
	/**
	 * @param message
	 * @param date2
	 */
	public WelcomeIndex(String message, Date date2) {
		super();
		this.message = message;
		this.date = date2;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

}
