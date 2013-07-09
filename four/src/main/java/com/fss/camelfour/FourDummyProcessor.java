package com.fss.camelfour;

import org.apache.log4j.Logger;

public class FourDummyProcessor {

	public final static Logger LOG = Logger.getLogger(FourDummyProcessor.class);

	public String processMessage(String request) throws InterruptedException {

		LOG.info("Received message at camelfour : " + request);

		 Thread.sleep(10);

		return request;
	}

}
