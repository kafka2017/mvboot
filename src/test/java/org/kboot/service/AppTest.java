package org.kboot.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kboot.Application;
import org.kboot.bean.SysBank;
import org.kboot.service.bank.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class AppTest {
	
	@Autowired
	BankService bser;
	
	@Test
	public void query(){
		List<SysBank> l = bser.querySysBank();
		for(SysBank s :l){
			System.err.println(s.getBandCode());
		}
	}
}
