package com.example.demo._0706;

class CircleTest {
    // 상수
    final double PI = 3.141592;
    double radius;

    public CircleTest (double radius) {
        this.radius = radius;
    }
    // 기능
    /*
    public double area(double rad){
        double result = rad*rad*3.14;
                // 반지름 * 반지름 * 3.14
        return result;
    }
    */
    public double area(double rad){
        double result = rad * rad * PI;
        // 반지름 * 반지름 * 3.14
        return result;
    }
    public double area(CircleTest cir){
        double result = cir.radius * cir.radius * PI;
        // 반지름 * 반지름 * 3.14
        return result;
    }

}
public class Circle {
    public static void main(String[] args) {
        CircleTest c1 = new CircleTest(5.0);
        CircleTest c2 = new CircleTest(3.0);
        System.out.println(c1.area(c1));
    }
}