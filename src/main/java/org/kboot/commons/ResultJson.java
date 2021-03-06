package org.kboot.commons;

import java.io.Serializable;

public class ResultJson<T> implements Serializable {

	private static final long serialVersionUID = -5460134129938461241L;

	/**
	 * 状态字符串
	 */
	private String status;

	/**
	 * 对象
	 */
	private T obj;

	/**
	 * 信息描述
	 */
	private String msg;

	/**
	 * 
	 * @param status
	 * @param obj
	 * @param msg
	 */
	private ResultJson(Integer status, T obj, String msg) {
		if (status == 0) {
			this.status = "success";
		} else {
			this.status = "failed";
		}
		this.obj = obj;
		this.msg = msg;
	}

	public static <T> ResultJson<T> buildSuccessMsg(T obj, String msg) {
		return new ResultJson<T>(0, obj, msg);
	}

	public static <T> ResultJson<T> buildFailedMsg(T obj, String msg) {
		return new ResultJson<T>(1, obj, msg);
	}

	public String getStatus() {
		return status;
	}

	public T getObj() {
		return obj;
	}

	public String getMsg() {
		return msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isSuccess() {
		return "success".equals(this.getStatus());
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
