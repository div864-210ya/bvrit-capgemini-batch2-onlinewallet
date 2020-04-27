package com.capgemini.onlinewallet.dao;

import com.capgemini.onlinewallet.entity.OnlineWalletBean;

public interface IOnlineWalletDao {
	public OnlineWalletBean deposit(int id, double amount);

	public OnlineWalletBean addAccount(OnlineWalletBean bean);
	

}
