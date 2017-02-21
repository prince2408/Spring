package spring;

public class DependencyInjector {
	public static void main(String[] args) {
		DIShapeInterface injector = new DITraiangle();
		DependencyInjection injection = new DependencyInjection();
		injection.setShape(injector);
		injection.getDrawing();
	}

}
