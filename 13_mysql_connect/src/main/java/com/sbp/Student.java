package com.sbp;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.CascadeType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GenerationType;
@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;
String name;
String surname;
int age;
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + "]";
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

@CreationTimestamp
LocalDateTime createdon;
@UpdateTimestamp
LocalDateTime updateon;
@OneToMany(mappedBy = "pincode",cascade = CascadeType.ALL)
List<Address> add;
public List<Address> getAdd() {
	return add;
}
public void setAdd(List<Address> add) {
	this.add = add;
}
}
