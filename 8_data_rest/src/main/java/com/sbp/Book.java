package com.sbp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="")
public class Book {
	@Id
	int id;
	String name;
	String author;

}
