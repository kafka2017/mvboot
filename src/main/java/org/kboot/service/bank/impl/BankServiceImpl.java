package org.kboot.service.bank.impl;

import java.util.List;

import org.kboot.bean.SysBank;
import org.kboot.commons.ResultJson;
import org.kboot.mapper.bank.SysBankMapper;
import org.kboot.service.bank.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

@Service
public class BankServiceImpl implements BankService{

	@Autowired
	SysBankMapper sysBankMapper;

	@Override
	public List<SysBank> querySysBank() {
		return sysBankMapper.querySysBank();
	}

	@Override
	public ResultJson<Integer> addSysBank(SysBank bank) {
		Validator validator = new Validator(); 
        List<ConstraintViolation> ret = validator.validate(bank);
        if(!ret.isEmpty()){
        	return ResultJson.buildFailedMsg(0, ret.get(0).getMessage());
        }
		Integer i = sysBankMapper.addSysBank(bank);
		if(i>0){
			return ResultJson.buildSuccessMsg(i, "添加成功");
		}
		return ResultJson.buildSuccessMsg(0, "失败");
	}
	
	
}
