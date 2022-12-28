package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


@Entity
@Component


@Table(name="CUSTOMER")
public class Customer {
	
	@Id
	@Column(name="CUSTOMERID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@NotBlank(message="Id should not be blank")
	private long customerId;
	
	@Column(name="CUSTOMERNAME")
	@NotBlank(message="customername should not be blank")
	private String customerName;
	
	@Column(name="CUSTOMERPASSWORD")
	@NotBlank(message="password should not be blank")
	@Size(min=8,message="Password should contains atleast 8 characters")
	//@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_])",message="Password should contains atleast one uppercase, one lowercase, one spl character, one numeric")
	//.{8,20}$
	private String customerPassword;
	
	@Column(name="CUSTOMERCONFIRMPASSWORD")
	@NotBlank(message="confirm password should not be blank")
	@Size(min=8,message="Confirm Password should contains atleast 8 characters")
	//@Pattern(regexp="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%])",message="Password should contains atleast one uppercase, one lowercase, one spl character, one numeric")
	private String customerConfirmPassword;
	
	@Column(name="CUSTOMERAGE")
	@NotBlank(message="age should not be blank")
	@Size(min=1,max=3,message="not blank")
	//@Pattern(regexp="(^$|[0-9])",message="Age should be numeric")
	//@NotNull(message="not null")
	//@Digits(fraction=0,integer=10,message="add digits")
	private String customerAge;
	
	@Column(name="CUSTOMERMOBILENUMBER")
	@NotBlank(message="mobile number should not be blank")
	@Pattern(regexp="(^$|[0-9]{10})", message="mobileNo must have 10 digits as well as only digits")
	private String customerMobilenumber;
	
	@Column(name="CUSTOMEREMAIL")
	@NotBlank(message="Email should not be blank")
	@Email(message="not mail")
	private String customerEmail;
	
	@Column(name="CUSTOMERGENDER")
	@NotBlank(message="gender should not be blank")
	@Pattern(regexp="^(MALE|FEMALE)$",message="Please enter MALE or FEMALE")
	private String customerGender;

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerConfirmPassword() {
		return customerConfirmPassword;
	}

	public void setCustomerConfirmPassword(String customerConfirmPassword) {
		this.customerConfirmPassword = customerConfirmPassword;
	}

	public String getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(String customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerMobilenumber() {
		return customerMobilenumber;
	}

	public void setCustomerMobilenumber(String customerMobilenumber) {
		this.customerMobilenumber = customerMobilenumber;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	
	
	
	//@OneToOne(mapped by="")
	//private Billing billing;

}
