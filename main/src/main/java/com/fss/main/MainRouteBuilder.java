package com.fss.main;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class MainRouteBuilder extends RouteBuilder {

	/**
	 * Let's configure the Camel routing rules using Java code...
	 */
	public void configure() {


       //onException(BindException.class).handled(true).maximumRedeliveries(3).redeliveryDelay(1000).asyncDelayedRedelivery();

		from("cxf:bean:orderEndpoint").bean(CXFRequestProcessor.class)
		.to("netty:tcp://0.0.0.0:7001?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class)
		.to("netty:tcp://0.0.0.0:7002?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class)
		.to("netty:tcp://0.0.0.0:7003?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class).transform().constant("OK");


		from("netty:tcp://0.0.0.0:7000?textline=true").loadBalance().roundRobin().to("netty:tcp://0.0.0.0:7008?textline=true").to("netty:tcp://0.0.0.0:7009?textline=true").end();
		
		from("netty:tcp://0.0.0.0:7008?textline=true")
		.bean(MainDummyProcessor.class)
		.to("netty:tcp://0.0.0.0:7001?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class)
		.to("netty:tcp://0.0.0.0:7002?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class)
		.to("netty:tcp://0.0.0.0:7003?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class);
		
		
		from("netty:tcp://0.0.0.0:7009?textline=true")
		.bean(MainDummyProcessor.class)
		.to("netty:tcp://0.0.0.0:7001?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class)
		.to("netty:tcp://0.0.0.0:7002?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class)
		.to("netty:tcp://0.0.0.0:7003?textline=true").to("netty:tcp://0.0.0.0:7004?textline=true")
		.bean(MainDummyProcessor.class);



	}

}
