package com.sbp;

public class Student {
private int roll_no;
private String name;
private int marks;
private Address address;
@Override
public String toString() {
	return "Student [roll_no=" + roll_no + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
}
