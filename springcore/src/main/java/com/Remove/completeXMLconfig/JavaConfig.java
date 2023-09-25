package com.Remove.completeXMLconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration    // ye annotation btaegi ki ye configuration class hai.
@ComponentScan(basePackages = "com.Remove.completeXMLconfig") 		// yha ham btaenge ki Container ko kon sa package scan krna hai object bnane k liye.
public class JavaConfig {
	
}
