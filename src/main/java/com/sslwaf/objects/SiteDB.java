package com.sslwaf.objects;

import java.security.SecureRandom;

public class SiteDB {
	String siteIDHex;
	String userHex;
	String url;
	String dnsVendor;
	String originIP;
	String certificateIDHex;
	String subscriptionID;
	
	// Setter
	public void setSiteIDHex(String siteIDHex) {
		this.siteIDHex = siteIDHex;
		siteRecordKeySet();
    }
	
    public void setUserHex(String userHex) {
		siteRecordKeySet();
		this.userHex = userHex;
    }
	
    public void setUrl(String url) {
        siteRecordKeySet();
        this.url = url;
    }
	
    public void setDnsVendor(String dnsVendor) {
        siteRecordKeySet();
        this.dnsVendor = dnsVendor;
    }
    
    public void setOriginIP(String originIP) {
        siteRecordKeySet();
        this.originIP = originIP;
    }
    
    public void setCertificateIDHex(String certificateIDHex) {
        siteRecordKeySet();
        this.certificateIDHex = certificateIDHex;
    }
    
    public void setSubscriptionID(String subscriptionID) {
        siteRecordKeySet();
        this.subscriptionID = subscriptionID;
    }
    
    //Getters
    public String getSiteIDHex() {
		return siteIDHex;
    }
	
    public String getUserHex() {
		return userHex;
    }
	
    public String getUrl() {
        return url;
    }
	
    public String getDnsVendor() {
        return dnsVendor;
    }
    
    public String getOriginIP() {
        return originIP;
    }
    
    public String getCertificateIDHex() {
        return certificateIDHex;
    }
    
    public String getSubscriptionID() {
        return subscriptionID;
    }
    
    //Method
	public void siteRecordKeySet() {
		if (siteIDHex == null) 
		siteIDHex = (new SecureRandom()).toString();
	}

}
