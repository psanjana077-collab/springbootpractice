package com.sbp;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  int id;
  @Column(name="emp_name")
  String name;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
String surname;
  int salary=100;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
}
}
