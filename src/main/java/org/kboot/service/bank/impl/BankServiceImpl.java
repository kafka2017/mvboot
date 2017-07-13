package org.kboot.service.bank.impl;

import java.util.List;

import org.kboot.bean.SysBank;
import org.kboot.mapper.bank.SysBankMapper;
import org.kboot.service.bank.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	SysBankMapper sysBankMapper;

	@Override
	public List<SysBank> querySysBank() {
		return sysBankMapper.querySysBank();
	}
	
	
}
