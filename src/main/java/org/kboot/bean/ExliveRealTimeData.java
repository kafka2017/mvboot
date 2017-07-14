package org.kboot.bean;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class ExliveRealTimeData implements Serializable {

	private static final long serialVersionUID = -1939353182084259908L;
	
	@Id
	private String id;
	
	private Integer carId;//车辆id

	private String code;//车牌号

	private String veo;//速度

	private String lato;//

	private String lng;//经度

	private String posinfo;//文字位置信息

	private String dir;//方向

	private String states;//

	private String dis;//里程

	private String recvtime;//服务器时间(毫秒数)

	private String oil;//油量

	private String av;//有效性

	private String lng_bd;

	private String lngo;

	private String lat_bd;

	private Integer state;//状态

	private String gpstime;//gps时间

	private String lat;//纬度

	private String p1;//模拟量1

	private String p2;//模拟量2
	
	private String terminalid;//终端id
	
	private String gprs;//设备号
	
	private Integer dateKey;
	
	private Integer DateValue;

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getVeo() {
		return veo;
	}

	public void setVeo(String veo) {
		this.veo = veo;
	}

	public String getLato() {
		return lato;
	}

	public void setLato(String lato) {
		this.lato = lato;
	}

	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getPosinfo() {
		return posinfo;
	}

	public void setPosinfo(String posinfo) {
		this.posinfo = posinfo;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	public String getStates() {
		return states;
	}

	public void setStates(String states) {
		this.states = states;
	}

	public String getDis() {
		return dis;
	}

	public void setDis(String dis) {
		this.dis = dis;
	}

	public String getRecvtime() {
		return recvtime;
	}

	public void setRecvtime(String recvtime) {
		this.recvtime = recvtime;
	}

	public String getOil() {
		return oil;
	}

	public void setOil(String oil) {
		this.oil = oil;
	}

	public String getAv() {
		return av;
	}

	public void setAv(String av) {
		this.av = av;
	}

	public String getLng_bd() {
		return lng_bd;
	}

	public void setLng_bd(String lng_bd) {
		this.lng_bd = lng_bd;
	}

	public String getLngo() {
		return lngo;
	}

	public void setLngo(String lngo) {
		this.lngo = lngo;
	}

	public String getLat_bd() {
		return lat_bd;
	}

	public void setLat_bd(String lat_bd) {
		this.lat_bd = lat_bd;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getGpstime() {
		return gpstime;
	}

	public void setGpstime(String gpstime) {
		this.gpstime = gpstime;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getP1() {
		return p1;
	}

	public void setP1(String p1) {
		this.p1 = p1;
	}

	public String getP2() {
		return p2;
	}

	public void setP2(String p2) {
		this.p2 = p2;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTerminalid() {
		return terminalid;
	}

	public void setTerminalid(String terminalid) {
		this.terminalid = terminalid;
	}

	public String getGprs() {
		return gprs;
	}

	public void setGprs(String gprs) {
		this.gprs = gprs;
	}

	public Integer getDateKey() {
		return dateKey;
	}

	public void setDateKey(Integer dateKey) {
		this.dateKey = dateKey;
	}

	public Integer getDateValue() {
		return DateValue;
	}

	public void setDateValue(Integer dateValue) {
		DateValue = dateValue;
	}
	
}
