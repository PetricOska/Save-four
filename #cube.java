package ch01;

public class cube {
    int width;
    int length;
    int height;

    double getVolume() {
        return width * length * height;
    }

    double getSurfaceArea() {
    	return (width * width) * 6;
    }

    public static void main(String[] args) {
        cube c = new cube();
        c.width = 5;
        c.length = 5;
        c.height = 5;
        
        System.out.printf("한 변의 길이가 %d인\n", c.width);
        System.out.printf("   정육면체의 부피: %.2f\n", c.getVolume());
        System.out.printf("   정육면체의 겉넓이: %.2f\n", c.getSurfaceArea());
    }
}