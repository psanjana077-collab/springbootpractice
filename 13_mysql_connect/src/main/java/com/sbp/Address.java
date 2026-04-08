package com.sbp;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int pincode;
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	String city;
	String state;
	String country;
    @ManyToOne(targetEntity = Student.class)
    Student student;
    
}
