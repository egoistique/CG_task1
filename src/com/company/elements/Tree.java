package com.company.elements;

import com.company.DrawingUtils;

import java.awt.*;

public class Tree {
    private final int x;
    private final int y;
    private final int diametr;
    private final Color st;
    private final Color lists;

    public Tree(int x, int y, int diametr, Color st, Color lists) {
        this.x = x;
        this.y = y;
        this.diametr = diametr;
        this.st = st;
        this.lists = lists;
    }

    public void draw(Graphics2D g){
        DrawingUtils.drawTree(g, x, y, diametr, st, lists);
    }
}
