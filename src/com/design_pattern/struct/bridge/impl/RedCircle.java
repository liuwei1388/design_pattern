package com.design_pattern.struct.bridge.impl;

import com.design_pattern.struct.bridge.DrawAPI;

public class RedCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [ color: red, radius: " + radius + " x: "
            + x + " , y: " + y);
    }
}
