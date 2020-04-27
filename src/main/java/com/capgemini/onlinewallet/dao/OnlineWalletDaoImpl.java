package com.capgemini.onlinewallet.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.onlinewallet.entity.History;
import com.capgemini.onlinewallet.entity.OnlineWalletBean;

@Repository
@Transactional
public class OnlineWalletDaoImpl implements IOnlineWalletDao {

		@PersistenceContext 
		EntityManager entityManager; 
	@Override
	public OnlineWalletBean deposit(int id, double amount) {
		OnlineWalletBean bean = entityManager.find(OnlineWalletBean.class, id);
		try {
			
			bean.setAmount(amount+bean.getAmount());
		}
		catch(Exception exception)
		{
			return null;
		}
		History history = new History("Deposited",id,amount);
		entityManager.persist(history);
		return entityManager.merge(bean);
	}
	@Override
	public OnlineWalletBean addAccount(OnlineWalletBean bean) {
		entityManager.persist(bean);
		 
		 return bean;
	}

}
 