package lab3;
import javax.swing.*;
import java.awt.*;

public class lab03 extends JFrame{
    int x1=40;
    int y1=140;
    int x2=160;
    int y2=400;
    int x3=80;
    int y3=680;

    public void run(){
        JFrame frame=new JFrame();
        frame=new JFrame("Lab3-22320303-Chen Yuqi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        MyDrawPanel drawPanel=new MyDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(800,840);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        while(true) {
            if(x3>800) {
                x1=40;
                y1=280;
                x2=160;
                y2=400;
                x3=80;
                y3=680;
            }

            for (int i=0;i<800;i++){
                //the first word's track
                x1++;
                if (x1 >= 40 && x1 < 120) {
                    y1 =280;
                }
                else if (x1 >= 120 && x1 <= 320){
                    y1 =(int)(352 - 0.6 * x1);
                }
                else if (x1 >= 320 && x1 <= 560) {
                    y1=(int) ( 160 + (Math.sqrt(14400-(x1-440)*(x1-440))));
                }
                else if (x1 >= 560 && x1 <= 640) {
                    y1 = 720 - x1;
                }
                else if (x1 > 640 && x1<= 760) {
                    y1 = 40 ;
                }

             
                x2++;
                if (x2 >= 160 && x2 <= 200) { 
                    y2 = 400 ;
                }
                else if (x2 > 200 && x2 <= 280){
                    y2 =(int) (300 + 0.5 * x2);
                }
                else if (x2 > 280 && x2 < 440) {
                    y2=(int) (440 - Math.sqrt(6400 - (x2 - 360) * (x2 - 360)));
                }
                else if (x2 >= 440 && x2 <= 520) {
                    y2 =(int) (440 + Math.sqrt(1600 - (x2 - 480) * (x2 - 480)));
                }
                else if (x2 > 520 && x2 <= 560) {
                    y2 =x2 - 80;
                }
                
                
                x3++;
                if (x3 >= 80 && x3 < 200) {
                    y3 =(int) (680 + Math.sqrt(14400-(x3-200)*(x3-200)));
                }
                else if (x3 >= 200 && x3 <= 320){
                    y3 =1000 - x3;
                }
                else if (x3 > 320 && x3 < 440) {
                    y3=(int) (680 - Math.sqrt(14400-(x3-440)*(x3-440)));
                }
                else if (x3 >= 440 && x3 <=560) {
                    y3 =x3 + 120;
                }
                else if (x3 > 560) {
                    y3 =(int) (960 - 0.5 * x3);
                }

                drawPanel.repaint();
                try{
                    Thread.sleep(2);
                }catch (Exception ex){}

                drawPanel.repaint();
                try{
                    Thread.sleep(1);
                }catch (Exception ex){}

                drawPanel.repaint();
                try{
                    Thread.sleep(1);
                }catch (Exception ex){}
            }

        }



    }

    class MyDrawPanel extends JPanel{

        public void paintComponent(Graphics g){

            g.setColor(Color.white);
            g.fillRect(0,0,this.getWidth(),this.getHeight());

            g.setColor(Color.black);
            //first word陈
            g.drawLine(x1-40, y1-25, x1-17, y1-25);
            g.drawLine(x1-17, y1-25, x1-29, y1-12);
            g.drawLine(x1-29, y1-12, x1-20, y1-2);
            g.drawLine(x1-20, y1-2, x1-20, y1+10);
            g.drawLine(x1-20, y1+10, x1-29, y1+5);
            g.drawLine(x1-35, y1-25, x1-35, y1+35);
            g.drawLine(x1-10, y1-12, x1+25, y1-12);
            g.drawLine(x1+5, y1-25, x1-10, y1+5);
            g.drawLine(x1-10, y1+5, x1+27, y1+5);
            g.drawLine(x1+7, y1-2, x1+7, y1+35);
            g.drawLine(x1+7, y1+35, x1, y1+22);
            g.drawLine(x1-4, y1+15, x1-12, y1+25);
            g.drawLine(x1+22, y1+15, x1+27, y1+25);

            //second word羽
            g.drawLine(x2-32, y2-17, x2-12, y2-17);
            g.drawLine(x2-12,y2-17, x2-12, y2+30);
            g.drawLine(x2-12, y2+30, x2-22, y2+22);
            g.drawLine(x2-27, y2-5, x2-17, y2+4);
            g.drawLine(x2-27, y2+16, x2-17, y2+7);
            g.drawLine(x2-2, y2+-17, x2+17, y2-17);
            g.drawLine(x2+17, y2-17, x2+17, y2+30);
            g.drawLine(x2+17, y2+30, x2+8, y2+22);
            g.drawLine(x2+2, y2-5, x2+12, y2+4);
            g.drawLine(x2+2, y2+16, x2+12, y2+7);

            //third word棋
            g.drawLine(x3-30, y3-12, x3-12, y3-12);
            g.drawLine(x3-21, y3-20, x3-21, y3+27);
            g.drawLine(x3-21, y3, x3-30, y3+20);
            g.drawLine(x3-21, y3, x3-12, y3+20);
            
            g.drawLine(x3-5, y3-12, x3+20, y3-12);
            g.drawLine(x3, y3-17, x3, y3+20);
            g.drawLine(x3+15, y3-17, x3+15, y3+20);
            g.drawLine(x3, y3, x3+15, y3);
            g.drawLine(x3, y3+10, x3+15, y3+10);
            g.drawLine(x3-10, y3+20, x3+25, y3+20);
            g.drawLine(x3, y3+20, x3-7, y3+30);
            g.drawLine(x3+15, y3+20, x3+22, y3+30);
        }
    }

    public static void main(String[]args){

        lab03 animation=new lab03();
        animation.run();
    }

}
