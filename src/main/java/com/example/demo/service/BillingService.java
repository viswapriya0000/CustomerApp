package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.exceptionhandler.CustomerIdInvalidException;
import com.example.demo.exceptionhandler.KeyViolationException;
import com.example.demo.model.Billing;
import com.example.demo.model.Customer;
import com.example.demo.repository.BillingRepository;
import com.example.demo.repository.CustomerRepository;

@Service
@Transactional
public class BillingService {
	
	@Autowired
	BillingRepository billRepo;
	
	@Autowired
	CustomerRepository cusRepo;

	
	public String registration(Billing billing) {
		Customer customer1 = cusRepo.findByCustomerId(billing.getCustomer().getCustomerId());

		if (customer1 != null) {
			billRepo.save(billing);
			return ("billing done");
			
		} else {
			throw new KeyViolationException("This CustomerId is not exist");
			
		}
	}
	
	
	public String billCancel(Long id) {

		Billing billing = (billRepo.findByBillId(id));

		if (billing != null) {
			billRepo.deleteById(id);
			return "bill is cancelled with id " + id;
		} else {
			throw new CustomerIdInvalidException("bill is not found for this id " + id);
		}

	}
	
	public List<Billing> getAllBills(){
		return billRepo.findAll();
	}

}
