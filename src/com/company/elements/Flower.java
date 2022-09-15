package com.company.elements;

import com.company.DrawingUtils;

import java.awt.*;

public class Flower {
    private final int x;
    private final int y;
    private final int diametr;
    private final Color c;

    public Flower(int x, int y, int diametr, Color c) {
        this.x = x;
        this.y = y;
        this.diametr = diametr;
        this.c = c;
    }

    public void draw(Graphics2D g){
        DrawingUtils.drawFlower(g, x, y, diametr, c);
    }
}
