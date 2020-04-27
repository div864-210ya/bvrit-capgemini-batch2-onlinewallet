package com.capgemini.onlinewallet.service;

import com.capgemini.onlinewallet.entity.OnlineWalletBean;

public interface IOnlineWalletService {
	public OnlineWalletBean addAccount(OnlineWalletBean bean);
	
	public OnlineWalletBean deposit(int id, double amount);
	
}
