package com.SpEL;


import org.springframework.expression.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelRunner {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpEL/spelconfig.xml");
		Demo d1 = context.getBean("demo",Demo.class);
		System.out.println(d1);
		
		
		// Here SPEL ki ek class bhi hai jiske dwara ham ese Use kr skte hai.
		SpelExpressionParser sep = new SpelExpressionParser();
		Expression expression = sep.parseExpression("32+31"); //yha hmne ye exression parse kiya hai
		System.out.println(expression.getValue());
		
	}
}
