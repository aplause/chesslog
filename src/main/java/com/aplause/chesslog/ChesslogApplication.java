package com.aplause.chesslog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class ChesslogApplication 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(ChesslogApplication.class);
    }
}
