package com.fss.cameltwo;

import org.apache.log4j.Logger;

public class TwoDummyProcessor {

	public final static Logger LOG =Logger.getLogger(TwoDummyProcessor.class);

	public String processMessage(String request) throws InterruptedException{
		LOG.info("Received message at cameltwo : "+request);

		Thread.sleep(100);

		return request;
	}

}
