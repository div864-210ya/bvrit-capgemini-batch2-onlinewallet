package com.capgemini.onlinewallet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.capgemini.onlinewallet.entity.OnlineWalletBean;
import com.capgemini.onlinewallet.service.OnlineWalletServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class OnlineWalletRestController {
	@Autowired
	OnlineWalletServiceImpl service;
	@PostMapping("/bank/create")    //postman :POST
	public String createAccount(@RequestBody OnlineWalletBean bean) {
		OnlineWalletBean b = service.addAccount(bean);
		return  "Hello " + b.getCustomer_name() + "\n Your Registration is Successfull\n" + "Your Account Id is "
				+ b.getAccount_id();
	}
	@GetMapping("/bank/deposit/{id}/{amount}")  //GET:   http://localhost:8090/bank/deposit/10/1000
	public String deposit(@PathVariable int id, @PathVariable double amount) throws Exception {
		OnlineWalletBean bean = service.deposit(id, amount);

		if (bean == null) {
			throw new Exception("Invalid id");
		}
		return "Hello " + bean.getCustomer_name() + "\n Your Amount is Deposited Succesfully\n"
				+ "Your Current Account Balance is " + bean.getAmount();

	}

}
