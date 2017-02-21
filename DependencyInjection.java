package spring;
/**
 * Dependencies means if a class is dependent on any other class for its instantiation and DI means
 * we should instantiate the dependency from outside the class that means we shouldn't use new operator
 * within the class and use costructor or setter instead.
 * Advantage:
 * 1) In the main Application class instead of creating an instance of each type it will create an instance
 * of parent class. so it doesn't know what instance it is creating.
 * Considering an example of drawing class, we have a dependency injector which is responsible to inject the
 * object after instantiation
 * @author abhkumar
 *
 */
public class DependencyInjection {
 DIShapeInterface shape;

public void setShape(DIShapeInterface shape) {
	this.shape = shape;
}
 
 public void getDrawing(){
	 this.shape.draw();
 }
 
}
