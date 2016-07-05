package com.sslwaf.objects;

import java.security.SecureRandom;

public class CertDB {
	String certificateIDHex;
	String csr;
	String status;
	String serial;
	String orderID;
	String certificate;
	String certificateInter;
	String certificateRoot;

	//Setter
	public void setCertificateIDHex(String certificateIDHex) {
		this.certificateIDHex = certificateIDHex;
		siteRecordKeySet();
    }
	
    public void setCsr(String csr) {
		siteRecordKeySet();
		this.csr = csr;
    }
    
    public void setStatus(String status) {
		siteRecordKeySet();
		this.csr = status;
    }
    
    public void setSerial(String serial) {
		siteRecordKeySet();
		this.serial = serial;
    }
    
    public void setOrderID(String orderID) {
		siteRecordKeySet();
		this.orderID = orderID;
    }
    
    public void setCertificate(String certificate) {
		siteRecordKeySet();
		this.certificate = certificate;
    }
    
    public void setCertificateInter(String certificateInter) {
		siteRecordKeySet();
		this.certificateInter = certificateInter;
    }
    
    public void setCertificateRoot(String certificateRoot) {
		siteRecordKeySet();
		this.certificateRoot = certificateRoot;
    }
    
	//Getters
	public String getCertificateIDHex() {
		return certificateIDHex;
    }
	
    public String getCsr() {
    	return csr;
    }
    
    public String getStatus() {
		return status;
    }
    
    public String getSerial() {
		return serial;
    }
    
    public String getOrderID() {
		return orderID;
    }
    
    public String getCertificate() {
		return certificate;
    }
    
    public String getCertificateInter() {
		return certificateInter;
    }
    
    public String getCertificateRoot() {
		return certificateRoot;
    }
    
	//Methods
	public void siteRecordKeySet() {
		if (certificateIDHex == null) 
		certificateIDHex = (new SecureRandom()).toString();
	}
}	
