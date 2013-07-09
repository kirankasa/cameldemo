package com.fss.camelone;

import org.apache.log4j.Logger;

public class OneDummyProcessor {

	public final static Logger LOG =Logger.getLogger(OneDummyProcessor.class);

	public String processMessage(String request) throws InterruptedException{
		LOG.info("Received message at camelone : "+request);

		Thread.sleep(100);

		return request;
	}

}
