package org.kboot.mapper.bank;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.kboot.bean.SysBank;

@Mapper
public interface SysBankMapper{
	
	//@Select("select bandCode,bandName from sys_bank")
	List<SysBank> querySysBank();

	Integer addSysBank(SysBank bank);
	
}
