package com.company;

import java.awt.*;

public class DrawingUtils {
    public static void drawTree(Graphics2D g, int x, int y, Color st, Color lists, int diametr){
        Color oldColor = g.getColor();
        g.setColor(st);
        int width = 50;
        int height = 150;

        g.fillRect(x, y - height, width, height);

        int xL = x - diametr / 2 - 10;
        int yL = y - diametr / 2 - height - 10;

        g.setColor(lists);
        g.fillOval(xL, yL, diametr, diametr);
        g.fillOval(xL + diametr - 10, yL, diametr , diametr);
        g.fillOval(xL + diametr / 2, yL - diametr / 2, diametr , diametr);
        g.fillOval(xL - 30, yL  - diametr, diametr + 30, diametr + 30);
        g.fillOval(xL + diametr, yL  - diametr, diametr + 30, diametr + 30);
        g.fillOval(xL + diametr / 2 - 30, yL  - diametr - diametr, diametr + 50, diametr + 50);

        g.setColor(oldColor);
    }
}
