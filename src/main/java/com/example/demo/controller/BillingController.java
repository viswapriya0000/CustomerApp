package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Billing;
import com.example.demo.service.BillingService;

@RestController
@RequestMapping("/billing")
public class BillingController {
	
	@Autowired
	BillingService billService;
	
	@PostMapping("/registration")
	public ResponseEntity<String> addCustomerDetails(@Validated @RequestBody Billing billing){
	    String response=billService.registration(billing);
		return new ResponseEntity<String>(response,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteBill")
	public ResponseEntity<String> deleteBill(@RequestParam("id") Long id) {
		String response = billService.billCancel(id);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@GetMapping("/GetAllBills")
	public ResponseEntity<List<Billing>> getAllBills(){
		List<Billing> lis=billService.getAllBills();
		return new ResponseEntity<List<Billing>>(lis,HttpStatus.OK);
	}

}
