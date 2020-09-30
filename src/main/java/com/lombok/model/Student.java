package com.lombok.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity(name="sutdent")
@Getter @Setter
public class Student {
	@Id
	private int id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	
}
