package com.example.demo.binding;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ReportAPI")

public class ReportAPI {
	@Id
	@GeneratedValue
	private Integer userId;
	private String Name;
	private String Email;
	private Long MobileNumber;
	private String Gender;
	private Integer ssn;
	
	
	@OneToMany
	@JoinColumn(name="ReportAPI2")
	
	

}
