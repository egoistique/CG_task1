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

    public static void drawTractor(Graphics2D g, int x, int y, Color c){
        Color oldColor = g.getColor();
        Color colOfWindow = new Color(176, 224, 230);
        Color colOfInsert = new Color(255, 228, 181);
        Color colOfWeels = new Color(210, 105, 30);
        Color colOfInsertWeels = new Color(255, 228, 181);

        g.setColor(c);
        g.fillRoundRect(x, y - 150, 300, 150, 20, 20);
        g.fillRect(x + 150,  y - 250, 140, 100);

        g.setColor(colOfInsert);
        g.fillRect(x + 150,  y - 250, 140, 5);

        g.setColor(c);
        g.fillRoundRect(x + 140,  y - 270, 160, 20, 5, 5);
        g.fillRect(x + 50,  y - 250, 20, 100);

        g.setColor(colOfWindow);
        g.fillRoundRect(x + 190,  y - 230, 60, 80, 10, 10);

        g.setColor(Color.BLACK);
        g.fillOval(x - 30, y - 120, 150, 150);
        g.fillOval(x + 180, y - 150, 180, 180);

        g.setColor(colOfWeels);
        g.fillOval(x , y - 90, 90, 90);
        g.fillOval(x + 210, y - 120, 120, 120);

        g.setColor(colOfInsertWeels);
        g.fillRect(x, y - 135, 120, 10);

        g.setColor(oldColor);
    }

    public static void drawFlower(Graphics2D g, int x, int y, int diametr, Color c){
        Color oldColor = g.getColor();
        g.setColor(c);
        g.fillOval(x - diametr, y - diametr, diametr, diametr);
        g.fillOval(x, y - diametr, diametr, diametr);
        g.fillOval(x , y , diametr, diametr);
        g.fillOval(x - diametr, y , diametr, diametr);

        g.setColor(Color.YELLOW);
        g.fillOval(x - diametr/2, y - diametr/2, diametr, diametr);
        g.setColor(oldColor);
    }
}
