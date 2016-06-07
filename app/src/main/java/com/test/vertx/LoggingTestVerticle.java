package com.test.vertx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.AbstractVerticle;

public class LoggingTestVerticle extends AbstractVerticle{

	Logger logger = LoggerFactory.getLogger(LoggingTestVerticle.class);
	
	@Override
	public void start(){
		logger.debug("start method");
    	try {
    	  	Thread.sleep(10000);
    	} catch (InterruptedException ex) {}
	
	}
}
