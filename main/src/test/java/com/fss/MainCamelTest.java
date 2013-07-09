package com.fss;

import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class MainCamelTest extends CamelTestSupport {

	

	@Test
	public void testMainRoute() {
		long start = System.currentTimeMillis();
		String string = (String) template.requestBody(
				"netty:tcp://0.0.0.0:7000?textline=true", "Camel");

		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(string);
		assertEquals(string, "Camel");
	}

}
