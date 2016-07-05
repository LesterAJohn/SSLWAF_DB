package com.sslwaf.objects;

import java.security.SecureRandom;

public class UserDB {
	String userHex;
	String userName;
	String companyName;
	String address1;
	String address2;
	String city;
	String state;
	String postalCode;
	String billingInfo;
	int siteCount;
	
	// Setter
	public void setUserHex(String userHex) {
		this.userHex = userHex;
		userRecordKeySet();
    }
	
	public void setName(String userName) {
		userRecordKeySet();
		this.userName = userName;
    }
	
    public void setCompanyName(String companyName) {
		userRecordKeySet();
		this.companyName = companyName;
    }
	
    public void setAddress(String address1, String address2, String city, String state, String postalCode) {
		userRecordKeySet();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;				
    }
	
    public void setBillingInfo(String billingInfo) {
        userRecordKeySet();
        this.billingInfo = billingInfo;
    }
	
    public void setSiteCount(int siteCount) {
        userRecordKeySet();
        this.siteCount = siteCount;
    }
    
    //Getters
	public String getUserName() {
		return userName;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public String[] getAddress() {
		String $[] = new String[5];
		$[1] = address1;
		$[2] = address2;
		$[3] = city;
		$[4] = state;
		$[5] = postalCode;
		return $;
	}
	
	public String getBillingInfo() {
		return billingInfo;
	}
	
	public int getSiteCount() {
		return siteCount;
	}
		
    //Method
	public void userRecordKeySet() {
		if (userHex == null) 
		userHex = (new SecureRandom()).toString();
	}
}
