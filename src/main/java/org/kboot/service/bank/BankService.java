package org.kboot.service.bank;

import java.util.List;

import org.kboot.bean.SysBank;
import org.kboot.commons.ResultJson;

public interface BankService {

	public List<SysBank> querySysBank();
	
	public ResultJson<Integer> addSysBank(SysBank bank);
}
