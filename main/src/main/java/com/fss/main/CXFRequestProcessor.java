package com.fss.main;

import org.apache.log4j.Logger;

public class CXFRequestProcessor {

	public final static Logger LOG =Logger.getLogger(CXFRequestProcessor.class);

	public String processMessage(String request){
		LOG.info("Received message at CXFRequestProcessor : "+request);
		return request;
	}

}
