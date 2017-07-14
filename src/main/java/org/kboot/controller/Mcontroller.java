package org.kboot.controller;

import java.util.List;

import org.kboot.bean.SysBank;
import org.kboot.service.bank.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class Mcontroller {

	@Autowired
	private BankService bservice;
	
	@ApiOperation(value="查询银行信息", notes="查询银行所有信息")
	@RequestMapping(value="/queryBank")
	public List<SysBank> query(){
		System.err.println("qunide");
		return bservice.querySysBank();
	}
}
