package org.kboot.bean;

import java.util.List;

import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

public class SysBank {

	@NotNull(message="银行编码不能为空",when="groovy:_this.type==0")
	@NotEmpty(message="银行编码不能为空",when="groovy:_this.type==0")
	private String bandCode;
	
	@NotNull(message="银行名称不能为空",when="groovy:_this.type==1")
	@NotEmpty(message="银行名称不能为空",when="groovy:_this.type==1")
	private String bandName;
	
	private Integer type;

	public String getBandCode() {
		return bandCode;
	}

	public void setBandCode(String bandCode) {
		this.bandCode = bandCode;
	}

	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	
	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public static void main(String[] args) {
		SysBank bank = new SysBank();
		bank.setBandCode("1");
		Validator validator = new Validator(); 
        List<ConstraintViolation> ret = validator.validate(bank);
        System.out.println(ret.get(0).getMessage());
	}
	
}
