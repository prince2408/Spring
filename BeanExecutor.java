package com.nice.installer.nim.validator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class BeanExecutor {
 public static void main(String[] args) {
	
			/*ApplicationContext context = new FileSystemXmlApplicationContext("C:\\.N.I.C.E\\"
					+ "npm_checkout\\npm-starter-kit-dev\\src\\bundles\\nim\\src\\main\\resources\\spring-practice.xml");
			*/
	 	
	 //We use abstract application context to register context shutdown
	 AbstractApplicationContext context = new FileSystemXmlApplicationContext("C:\\.N.I.C.E\\"
				+ "npm_checkout\\npm-starter-kit-dev\\src\\bundles\\nim\\src\\main\\resources\\spring-practice.xml");
		
	 		Line line = (Line) context.getBean("line");
			line.draw();
			context.registerShutdownHook();
		
			/*System.out.println(line.getPointA());
			System.out.println("2nd : "+line.getPointA());
			
			System.out.println("point B : "+line.getPointB());
			System.out.println("2nd point B : "+line.getPointB());*/
}
}