package com.fss.camelthree;

import org.apache.log4j.Logger;

public class ThreeDummyProcessor {

	public final static Logger LOG =Logger.getLogger(ThreeDummyProcessor.class);

	public String processMessage(String request) throws InterruptedException{
		LOG.info("Received message at camelthree : "+request);

		Thread.sleep(100);

		return request;
	}

}
