package com.company;

public class BorderOfShapeDecorator extends ShapeDecorator{

    private String color;

    public BorderOfShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    public void draw(){
        decoratedShape.draw();
        setBorder(decoratedShape, color);
    }

    private void setBorder(Shape decoratedShape, String color){
        System.out.println("Border Color: "+color);
    }
}
