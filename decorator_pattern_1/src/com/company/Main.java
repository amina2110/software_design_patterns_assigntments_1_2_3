package com.company;

public class Main {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        triangle.draw();

        Shape triangleWithBlueBorders = new BorderOfShapeDecorator(new Triangle(), "blue");
        triangleWithBlueBorders.draw();

        Shape circleWithGreenBordersAndFilledWithYellow = new BorderOfShapeDecorator(new FillShapeDecorator(new Circle(), "yellow"), "green");
        circleWithGreenBordersAndFilledWithYellow.draw();

    }
}
