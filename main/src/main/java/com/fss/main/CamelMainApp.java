package com.fss.main;

import org.apache.camel.spring.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * A Camel Application
 */
public class CamelMainApp {

	/**
	 * A main() so we can easily run these routing rules in our IDE
	 */
	public static void main(String... args) throws Exception {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"META-INF/spring/camel-*.xml");
		Main main = new Main();
		main.setApplicationContext(applicationContext);
		main.enableHangupSupport();
		main.addRouteBuilder(new MainRouteBuilder());
		main.run(args);
	}

}
