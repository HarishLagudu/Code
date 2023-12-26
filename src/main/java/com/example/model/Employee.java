package com.example.model;

import java.util.Date;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Employee {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@NotNull(message = "Name may not be null")
	private String firstName;
	@NotNull(message = "Last Name may not be null")
	private String lastName;

	private List<String> phoneNumbers;

	@NotNull
	private Date doj;
	@NotNull
	private Double salary;
	@NotNull
	@Email
	private String email;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee(String id, String firstName, String lastName, List<String> phoneNumbers, Date doj, Double salary,
			String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumbers = phoneNumbers;
		this.doj = doj;
		this.salary = salary;
		this.email = email;
	}

	public Employee() {
		super();
	}

}
