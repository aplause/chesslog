package com.aplause.chesslog.configuration;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import com.aplause.chesslog.ChesslogApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder ) {
		return builder.sources(ChesslogApplication.class);
	}
}
