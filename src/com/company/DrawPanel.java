package com.company;

import com.company.elements.Cloud;
import com.company.elements.Flower;
import com.company.elements.Tractor;
import com.company.elements.Tree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel{

    private final Cloud cloud1;
    private final Cloud cloud2;
    private final Cloud cloud3;
    private final Cloud cloud4;
    private final Cloud cloud5;

    public DrawPanel() {
        cloud1 = new Cloud(0, 0, 9, 60, new Color(255, 240, 245), new Color(245, 255, 250), new Color(240, 248, 255));
        cloud2 = new Cloud(500, 10, 7, 70, new Color(255, 240, 245), new Color(245, 255, 250), new Color(240, 248, 255));
        cloud3 = new Cloud(200, 70, 10, 80, new Color(255, 240, 245), new Color(245, 255, 250), new Color(240, 248, 255));
        cloud4 = new Cloud(300, 150, 5, 50, new Color(255, 240, 245), new Color(245, 255, 250), new Color(240, 248, 255));
        cloud5 = new Cloud(400, 250, 7, 60, new Color(255, 240, 245), new Color(245, 255, 250), new Color(240, 248, 255));

        ActionListener timerListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cloud1.setX(cloud1.getX() + 1);
                cloud2.setX(cloud2.getX() + 1);
                cloud3.setX(cloud3.getX() + 1);
                cloud4.setX(cloud4.getX() + 1);
                cloud5.setX(cloud5.getX() + 1);
                repaint();
            }
        };
        Timer timer = new Timer(5, timerListener);
        timer.start();

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

        cloud1.draw(g);
        cloud2.draw(g);
        cloud3.draw(g);
        cloud4.draw(g);
        cloud5.draw(g);

        Tree tree1 = new Tree(50, 650, 85, new Color(160, 82, 45), new Color(34, 139, 34));
        Tree tree2 = new Tree(250, 600, 85, new Color(139, 69, 19), new Color(0, 128, 0));
        Tree tree3 = new Tree(450, 550, 85, new Color(205, 133, 63), new Color(0, 100, 0));
        Tree tree4 = new Tree(700, 550, 85, new Color(205, 133, 63), new Color(0, 100, 0));
        Tree tree5 = new Tree(900, 600, 85, new Color(139, 69, 19), new Color(0, 128, 0));
        Tree tree6 = new Tree(1100, 650, 85, new Color(160, 82, 45), new Color(34, 139, 34));

        tree1.draw(g);
        tree2.draw(g);
        tree3.draw(g);
        tree4.draw(g);
        tree5.draw(g);
        tree6.draw(g);

        Tractor tractor1 =  new Tractor(400, 830, new Color(255, 140, 0));
        tractor1.draw(g);

        Flower flower1 = new Flower(50, 900, 20, new Color(255, 105, 180));
        Flower flower2 = new Flower(250, 650, 20, new Color(255, 20, 147));
        Flower flower3 = new Flower(450, 900, 20, new Color(199, 21, 133));
        Flower flower4 = new Flower(750, 650, 20, new Color(219, 112, 147));
        Flower flower5 = new Flower(900, 900, 20, new Color(255, 0, 255));
        Flower flower6 = new Flower(1050, 650, 20, new Color(186, 85, 211));

        flower1.draw(g);
        flower2.draw(g);
        flower3.draw(g);
        flower4.draw(g);
        flower5.draw(g);
        flower6.draw(g);


//        ArrayList<Flower> flows = new ArrayList<>();
//
//        for (int i = 0; i < 5; i ++){
//            int x = (int) DrawingUtils.getRandomInt(0, 1200);
//            int y = (int) DrawingUtils.getRandomInt(400, 1000);
//            int diam = (int) DrawingUtils.getRandomInt(20, 40);
//            flower1 = new Flower (x, y, diam, new Color(255, 105, 180));
//            flows.add(flower1);
//        }
//
//        flows.get(0).draw(g);
//        flows.get(1).draw(g);
//        flows.get(2).draw(g);
//        flows.get(3).draw(g);
    }
}
