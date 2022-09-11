package com.company.elements;

import com.company.DrawingUtils;

import java.awt.*;

public class Cloud {
    private final int x, y, n, diam;
    private final Color c1, c2, c3;

    public Cloud(int x, int y, int n, int diam, Color c1, Color c2, Color c3) {
        this.x = x;
        this.y = y;
        this.n = n;
        this.diam = diam;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public void draw(Graphics2D g){
        DrawingUtils.drawCloude(g, x, y, n, diam, c1, c2, c3);
    }
}
