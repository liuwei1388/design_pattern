package com.design_pattern.struct.bridge.impl;

import com.design_pattern.struct.bridge.DrawAPI;
import com.design_pattern.struct.bridge.Shape;

public class Circle extends Shape {

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
