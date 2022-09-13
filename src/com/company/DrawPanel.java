package com.company;

import com.company.elements.Cloud;
import com.company.elements.Tractor;
import com.company.elements.Tree;

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


        Cloud cloud1 = new Cloud(90, 70, 9, 80, new Color(255, 240, 245), new Color(245, 255, 250), new Color(240, 248, 255));
        Cloud cloud2 = new Cloud(900, 140, 7, 80, new Color(255, 240, 245), new Color(245, 255, 250), new Color(240, 248, 255));
        Cloud cloud3 = new Cloud(400, 40, 13, 80, new Color(255, 240, 245), new Color(245, 255, 250), new Color(240, 248, 255));
        cloud1.draw(g);
        cloud2.draw(g);
        cloud3.draw(g);

        Tree tree1 = new Tree(200, 600, 85, new Color(160, 82, 45), new Color(34, 139, 34));
        Tree tree2 = new Tree(900, 600, 85, new Color(160, 82, 45), new Color(34, 139, 34));

        tree1.draw(g);
        tree2.draw(g);

        Tractor tractor1 =  new Tractor(400, 800, new Color(255, 140, 0));
        tractor1.draw(g);
    }


}
