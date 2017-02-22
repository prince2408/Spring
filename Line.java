package com.nice.installer.nim.validator;

/**
 * look-up method : when you need to inject a prototype-scoped bean in a singleton-scoped bean.
 *  Since singletons are created (and then injected) during context creation:
 * @author abhkumar
 *
 */
public abstract class Line {

	Point pointA;
	Point pointB;
	
	 protected abstract Point createPrototype();
	
	public Point getPointA() {
		
		return createPrototype();
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
