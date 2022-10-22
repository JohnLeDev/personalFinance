package com.lean.moneynote.User.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lean.moneynote.User.dto.AccountDTO;
import com.lean.moneynote.mapper.AccountMapper;
import com.lean.moneynote.model.Account;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private AccountMapper accountMapper;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public AccountDTO insertUser(AccountDTO data) {
		Account obj = mapper.map(data, Account.class);
		accountMapper.insert(obj);
		// TODO Auto-generated method stub
		return null;
	}

}
