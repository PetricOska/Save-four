package ch01;

public class AreaCalculator {
	public static void main(String[] args) {
		Square1 s = new Square1();
		s.name = "정사각형";
		s.length = 3;
		Triangle1 t = new Triangle1();
		t.name = "삼각형";
		t.base = 4;
		t.height = 3;
		Circle1 c = new Circle1();
		c.name = "원";
		c.radius = 4;
		Shape1[] shapes = {s, t, c};
		for (int i = 0; i < shapes.length; i++) {
			System.out.printf("%s의 넓이: %.2f\n", shapes[i].name, shapes[i].area());
		}
	}
}
class Shape1 {
	String name;
	double area() {
		return 0;
	}
}
class Square1 extends Shape1 {
	int length;
	double area() {return length*length;}
}
class Triangle1 extends Shape1 {
	int base;
	int height;
	double area() {return 0.5*base*height;}
}
class Circle1 extends Shape1 {
	int radius;
	double area() {return radius*radius*3.14;}
}