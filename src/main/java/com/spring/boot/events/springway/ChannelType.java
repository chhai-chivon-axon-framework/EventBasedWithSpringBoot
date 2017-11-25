package com.spring.boot.events.springway;

public enum ChannelType {
	JAVA (1),
	SCALA (2),
	PYTHON (3),
	POSTGRESQL (4);
	
	private int code;
	
	private ChannelType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static ChannelType valueOf(int channelCode) {
		switch(channelCode) {
			case 1:
				return JAVA;
			case 2:
				return SCALA;
		}
		return null;
	}	

}
