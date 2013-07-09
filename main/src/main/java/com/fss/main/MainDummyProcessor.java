package com.fss.main;

import org.apache.log4j.Logger;

public class MainDummyProcessor {

	public final static Logger LOG =Logger.getLogger(MainDummyProcessor.class);

	public String processMessage(String request){
		LOG.info("Received message at main camel : "+request);
		return request;
	}

}
