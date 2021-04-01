package com.design_pattern.struct.bridge;

import com.design_pattern.struct.bridge.impl.Circle;
import com.design_pattern.struct.bridge.impl.GreenCircle;
import com.design_pattern.struct.bridge.impl.RedCircle;

public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
