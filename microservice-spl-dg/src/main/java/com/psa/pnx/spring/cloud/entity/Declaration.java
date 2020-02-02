package com.psa.pnx.spring.cloud.entity;

import java.util.Date;

public class Declaration {

	private Integer id;
	private String serverPort;
	private String terminal;
	private Date berthingTime;
	private String chemicalName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getServerPort() {
		return serverPort;
	}

	public void setServerPort(String serverPort) {
		this.serverPort = serverPort;
	}

	public String getTerminal() {
		return terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public Date getBerthingTime() {
		return berthingTime;
	}

	public void setBerthingTime(Date berthingTime) {
		this.berthingTime = berthingTime;
	}

	public String getChemicalName() {
		return chemicalName;
	}

	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}

	@Override
	public String toString() {
		return "Declaration [id=" + id + ", serverPort=" + serverPort + ", terminal=" + terminal + ", berthingTime="
				+ berthingTime + ", chemicalName=" + chemicalName + "]";
	}

}
