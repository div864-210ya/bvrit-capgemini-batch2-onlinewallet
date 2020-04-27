package com.capgemini.onlinewallet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import com.capgemini.onlinewallet.dao.IOnlineWalletDao;
import com.capgemini.onlinewallet.entity.OnlineWalletBean;



@Service
public class OnlineWalletServiceImpl implements IOnlineWalletService {
		@Autowired 
		IOnlineWalletDao d;
	
   
	public OnlineWalletBean deposit(int id, double amount) {
		return  d.deposit(id,amount);
	}


	public OnlineWalletBean addAccount(OnlineWalletBean bean) {
		return d.addAccount(bean);
	}

}
