package com.company.elements;

import com.company.DrawingUtils;

import java.awt.*;

public class Tractor {
    private final int x;
    private final int y;
    private final Color c;

    public Tractor(int x, int y, Color c) {
        this.x = x;
        this.y = y;
        this.c = c;
    }

    public void draw(Graphics2D g){
        DrawingUtils.drawTractor(g, x, y, c);
    }
}