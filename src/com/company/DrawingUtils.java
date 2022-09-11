package com.company;

import java.awt.*;

public class DrawingUtils {
    public static void drawTree(Graphics2D g, int x, int y, int diametr, Color st, Color lists){
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

    public static void drawCloude(Graphics2D g, int x, int y, int n, int diam, Color c1, Color c2, Color c3){
        Color oldColor = g.getColor();
        Color[] cols = new Color[3];
        cols[0] = c1;
        cols[1] = c2;
        cols[2] = c3;

        g.setColor(c1);
        int n1 = (n % 2 == 0) ? n / 2 : n / 2 + 1;
        int num;

        for (int i = 0; i < n1; i++) {
            num = (int) getRandomInt(0, 2);
            g.setColor(cols[num]);
            g.fillOval(x, y, diam, diam);
            num = (int) getRandomInt(0, 2);
            g.setColor(cols[num]);
            g.fillOval(x + diam / 2, y + diam / 2, diam, diam);
            x += diam / 2;
        }


        g.setColor(oldColor);
    }

    public static double getRandomInt(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}
