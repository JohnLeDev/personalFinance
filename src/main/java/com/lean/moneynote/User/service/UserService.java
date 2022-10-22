package com.lean.moneynote.User.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lean.moneynote.User.dto.AccountDTO;
import com.lean.moneynote.mapper.AccountMapper;

public interface UserService {
	public AccountDTO insertUser(AccountDTO data);
	
}
