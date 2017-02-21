package com.nice.installer.nim.validator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Line {

	Point pointA;
	Point pointB;
	
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public void draw(){
		System.out.println("Point A: "+getPointA().getX()+" and "+getPointA().getY());
		System.out.println("Point B : "+getPointB().getX()+" and "+getPointB().getY());
	}

	
}
