package com.company.elements;

import com.company.DrawingUtils;

import java.awt.*;

public class Cloud {
    private int x, y, n, diam;
    private final Color c1;
    private final Color c2;
    private final Color c3;


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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getDiam() {
        return diam;
    }

    public void setDiam(int diam) {
        this.diam = diam;
    }

    public Color getC1() {
        return c1;
    }

    public Color getC2() {
        return c2;
    }

    public Color getC3() {
        return c3;
    }
}
