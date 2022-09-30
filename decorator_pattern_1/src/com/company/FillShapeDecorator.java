package com.company;

public class FillShapeDecorator extends ShapeDecorator{
    private String color;

    public FillShapeDecorator(Shape decoratedShape,String color) {
        super(decoratedShape);
        this.color = color;
    }

    public void draw(){
        decoratedShape.draw();
        fillShapeWith(decoratedShape, color);
    }

    private void fillShapeWith(Shape decoratedShape, String color){
        System.out.println("Filled with: "+color);
    }
}
