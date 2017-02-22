package com.nice.installer.nim.validator;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ApplicationContextAware is an interface which provides the context throughout the spring project.
 * InitializingBean,DisposableBean are the spring specific interface 
 * which provides the lifecycle callback of the spring. Apart from spring, normal tags can be used like
 * "init-method" and "destroy-method" can be used and configured in the respective xml. But spring specific will get the precedence 
 * if both has been used for the same bean.
 * @author abhkumar
 *
 */
public class Point implements ApplicationContextAware, InitializingBean,DisposableBean{

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
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		/*System.out.println("Bean is destroyed");*/
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		/*System.out.println("bean is initialized");*/
		
	}
	
	public void initializing(){
		/*System.out.println("My custom init method");*/
	}
	
	public void destroyed(){
		/*System.out.println("My custom destroy method");*/
	}
	
	
}
