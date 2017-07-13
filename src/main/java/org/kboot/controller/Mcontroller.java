package org.kboot.controller;

import java.util.List;

import org.kboot.bean.SysBank;
import org.kboot.service.bank.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mcontroller {

	@Autowired
	private BankService bservice;
	
	
	@RequestMapping(value="/queryBank")
	public List<SysBank> query(){
		System.err.println("qunide");
		return bservice.querySysBank();
	}
}
