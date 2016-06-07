package com.test.vertx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;

public class ApplicationLauncher {
	
	public static final Logger logger = LoggerFactory.getLogger(ApplicationLauncher.class);
	
	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();
		vertx.deployVerticle(new LoggingTestVerticle(), new Handler<AsyncResult<String>>() {
			@Override
			public void handle(AsyncResult<String> event) {
				if(event.succeeded()){
					logger.debug("deployed successfully");
				}
			}
		});
	}
}
