package com.nice.installer.nim.validator;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * An interface which provides the context throughout the spring project.
 * @author abhkumar
 *
 */
public class Point implements ApplicationContextAware{

	int x;
	int y;
	
	private ApplicationContext context;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}
	
	
}
