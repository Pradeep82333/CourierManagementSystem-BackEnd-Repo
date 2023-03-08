package com.example.SpringApp.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cms")
public class Courier {
@Id
@Column(name="id")
private int id;
@Column(name="cust_name")
private String cust_name;
@Column(name="saddress")
private String saddress;
@Column(name="raddress")
private String raddress;
@Column(name="rnumber")
private long rnumber;
@Column(name="snumber")
private long snumber;



public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



public String getCust_name() {
	return cust_name;
}



public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}



public String getSaddress() {
	return saddress;
}



public void setSaddress(String saddress) {
	this.saddress = saddress;
}



public String getRaddress() {
	return raddress;
}



public void setRaddress(String raddress) {
	this.raddress = raddress;
}



public long getRnumber() {
	return rnumber;
}



public void setRnumber(long rnumber) {
	this.rnumber = rnumber;
}



public long getSnumber() {
	return snumber;
}



public void setSnumber(long snumber) {
	this.snumber = snumber;
}



@Override
public String toString() {
	return "Courier [id=" + id + ", cust_name=" + cust_name + ", saddress=" + saddress + ", raddress=" + raddress
			+ ", rnumber=" + rnumber + ", snumber=" + snumber + "]";
}



public Courier() {
}




}
