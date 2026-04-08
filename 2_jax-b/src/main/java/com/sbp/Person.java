package com.sbp;


import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {
private int id;
private String name;
@Override
public String toString() {
	return "Person [id=" + id + ", name=" + name + ", add=" + add + ", surname=" + surname + ", age=" + age + "]";
}
private Address add;
public Address getAdd() {
	return add;
}
public void setAdd(Address add) {
	this.add = add;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
private String surname;
private int age;
}
