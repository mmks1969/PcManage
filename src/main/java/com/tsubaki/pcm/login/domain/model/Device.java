package com.tsubaki.pcm.login.domain.model;

import java.util.Date;

import lombok.Data;

@Data
public class Device {
	
	private String deviceId;
	private String kataban;
	private String owner;
	private String maker;
	private Date creationdate;
	private Date lastupdate;
	
}
