package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    public DrawPanel() {
    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;

        g.setColor(new Color(0, 255, 127));
        g.fillRect(0,400, 1600, 800);
        g.setColor(new Color(173, 216, 230));
        g.fillRect(0,0, 1600, 400);

        g.setColor(new Color(0, 255, 127));
////        g.drawLine(10, 10, 200, 100);
////        g.drawRect(50, 10, 30, 100);
////        g.drawOval(50, 10, 30, 100);
////        g.drawArc(50, 10, 200, 100, 30, 90);
//        g.drawString("some text", 50, 10);
////        final int SIZE = 1000;
////        int[] x = new int[SIZE];
////        int[] y = new int[SIZE];
////        for(int i = 0; i < SIZE; i++){
////            x[i] = i;
////            y[i] = 100 + (int)(30*Math.sin(i*0.1));
////        }
////        g.drawPolyline(x, y, SIZE);
//        Polygon s = new Polygon();
//        for(int i = 0; i < 50; i++){
//            s.addPoint(i + 50, 100 + (int)(30*Math.sin(i*0.1)));
//        }
//        g.draw(s);

        DrawingUtils.drawTree(g, 300, 600, new Color(160, 82, 45), new Color(34, 139, 34), 85);


    }


}
