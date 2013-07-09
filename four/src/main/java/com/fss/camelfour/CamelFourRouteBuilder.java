package com.fss.camelfour;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class CamelFourRouteBuilder extends RouteBuilder {

	/**
	 * Let's configure the Camel routing rules using Java code...
	 */
	public void configure() {

		from("netty:tcp://0.0.0.0:7004?textline=true").threads(400,400).bean(FourDummyProcessor.class);
	}

}
