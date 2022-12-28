package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Billing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long billId;
	
	
	@NotBlank(message="Address should not be blank")
	private String address;
	
	@NotNull(message="Amount should not be blank")
	private Long totalAmount;
	
	@OneToOne(cascade = CascadeType.MERGE )
    @JoinColumn(name = "CUSTOMERID")
	//@NotBlank(message="id should not be blank")
	private Customer customer;

	@Override
	public String toString() {
		return "Billing [billId=" + billId + ", address=" + address + ", totalAmount=" + totalAmount + ", customer="
				+ customer + "]";
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
