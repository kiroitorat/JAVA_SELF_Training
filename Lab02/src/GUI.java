package src;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            DrawGUI drawGUI = new DrawGUI();
            drawGUI.drawing();
        });
    }
}
class DrawGUI extends JFrame {
    private JList<Integer> list;

    private ActionEvent y_dot;
    private JComboBox<Integer>  comboBox;
    private List<Shape> shapeArray;
    private int R;
    private GraphicsPanel graphicsPanel;
    int selectedRadius;
    Shape shape ;
    public void drawing() {
        this.setTitle("GUI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        Panel_Button buttonPanel = new Panel_Button();
        Box boxOfX = Box.createHorizontalBox();
        Box boxOfY = Box.createHorizontalBox();
        Box boxOfR = Box.createHorizontalBox();
        Box boxOfCheck = Box.createHorizontalBox();
        JLabel label1 = new JLabel("X:");
        boxOfX.add(label1);
        JLabel label2 = new JLabel("Y:");
        boxOfY.add(label2);
        JLabel label3 = new JLabel("R:");
        boxOfR.add(label3);
        Integer[] listOfX = {-10,-8,-6,-4,-2,0,2,4,6,8,10};
        list = new JList<>(listOfX);
        JScrollPane scrollPane = new JScrollPane(list);
        Integer[] comboBoxOptions = {-10,-8,-6,-4,-2,0,2,4,6,8,10};
        comboBox = new JComboBox<>(comboBoxOptions);
        JRadioButton button1 = new JRadioButton("2");
        button1.addActionListener(e->selectedRadius=2);
        JRadioButton button2 = new JRadioButton("4");
        button2.addActionListener(e->selectedRadius=4);
        JRadioButton button3 = new JRadioButton("6");
        button3.addActionListener(e->selectedRadius=6);
        JRadioButton button4 = new JRadioButton("8");
        button4.addActionListener(e->selectedRadius=8);
        JRadioButton button5 = new JRadioButton("10");
        button5.addActionListener(e->selectedRadius=10);
        selectedRadius = 2;//default value
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(button1);
        buttonGroup.add(button2);
        buttonGroup.add(button3);
        buttonGroup.add(button4);
        buttonGroup.add(button5);
        JButton check = new JButton("Check");
        check.addActionListener(e -> drawShapeArray());
        boxOfCheck.add(check);
        buttonPanel.add(boxOfX);
        buttonPanel.add(scrollPane);
        buttonPanel.add(boxOfY);
        buttonPanel.add(comboBox);
        buttonPanel.add(boxOfR);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(boxOfCheck);
        graphicsPanel = new GraphicsPanel();
        graphicsPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        graphicsPanel.setPreferredSize(new Dimension(2000,1000));
        graphicsPanel.setBackground(null);
        graphicsPanel.setOpaque(false);
        shapeArray = new ArrayList<>();
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(graphicsPanel, BorderLayout.NORTH);
        this.pack();
        this.setVisible(true);
    }
    private void drawShapeArray() {
        int selectedX = list.getSelectedValue();
        int selectedY = (int) comboBox.getSelectedItem();
        R = selectedRadius;
        int x =selectedX*R+225;
        int y = -selectedY*R+250;
        Color color;
        double center1_Y = 275-25*R*0.5;
        if (selectedX>0&&selectedY>0){//first
            double X = selectedX*R+225;
            double Y = (30*center1_Y)*0.5;
            if ((((-selectedY)*R)+250)<=Y&&X>=225&&X<=(225+(20*R*0.5))){
                color = Color.BLUE;
                shape = new drawPoint(x, y, R, color);
                JOptionPane.showMessageDialog(DrawGUI.this, "hit !!! ");
            }else {
                color = Color.GREEN;
                shape = new drawPoint(x, y, R, color);
                JOptionPane.showMessageDialog(DrawGUI.this, "Do not hit !!! ");
            }
        }
        else if (selectedX<0&&selectedY>0){//second
            double X = selectedX*R+225;
            double triangle1_X = 225-(20*R*0.5);
            double Y = -X-250+triangle1_X;
            if ((((-selectedY)*R)+250)>=Y&&(((-selectedY)*R)+250)<=250){
                color = Color.BLUE;
                shape = new drawPoint(x, y, R, color);
                JOptionPane.showMessageDialog(DrawGUI.this, "hit !!! ");
            }else {
                color = Color.GREEN;
                shape = new drawPoint(x, y, R, color);
                JOptionPane.showMessageDialog(DrawGUI.this, "Do not hit !!! ");
            }
        }
        else if (selectedX<0&&selectedY<0){//third
            double X = selectedX*R+225;
            double triangle1_X = 225-(20*R*0.5);
            double Y = X+250-triangle1_X;
            if ((((-selectedY)*R)+250)<=Y&&(((-selectedY)*R)+250)>=250){
                color = Color.BLUE;
                shape = new drawPoint(x, y, R, color);
                JOptionPane.showMessageDialog(DrawGUI.this, "hit !!! ");
            }else {
                color = Color.GREEN;
                shape = new drawPoint(x, y, R, color);
                JOptionPane.showMessageDialog(DrawGUI.this, "Do not hit !!! ");
            }

        }
        else if (selectedX>0&&selectedY<0){//fifth
            double X = selectedX*R+225;
            double Y = (30*center1_Y)*0.5;
            if ((((-selectedY)*R)+250)<=Y&&X>=225&&X<=(225+(20*R*0.5))){
                color = Color.BLUE;
                shape = new drawPoint(x, y, R, color);
                JOptionPane.showMessageDialog(DrawGUI.this, "hit !!! ");
            }else {
                color = Color.GREEN;
                shape = new drawPoint(x, y, R, color);
                JOptionPane.showMessageDialog(DrawGUI.this, "Do not hit !!! ");
            }
        }
        else if ( selectedX==0||selectedY==0) {//x,y
            double X = selectedX*R+225;
            double Y = -selectedY*R+250;
            if(selectedY==0){
                if (X==(225+(10*R*0.5))||(X>=(225-20*R*0.5)&&X<=225)||X==(225+20*R*0.5)){
                    color = Color.BLUE;
                    shape = new drawPoint(x, y, R, color);
                    JOptionPane.showMessageDialog(DrawGUI.this, "hit !!! ");
                }else {
                    color = Color.GREEN;
                    shape = new drawPoint(x, y, R, color);
                    JOptionPane.showMessageDialog(DrawGUI.this, "Do not hit !!! ");
                }

            } else if (selectedX==0) {
                if(Y==(250-(20*R*0.5))||(Y>=250&&Y<=(250+(20*R*0.5)))||Y==(250-10*R*0.5)){
                    color = Color.BLUE;
                    shape = new drawPoint(x, y, R, color);
                    JOptionPane.showMessageDialog(DrawGUI.this, "hit !!! ");

                }else {
                    color = Color.GREEN;
                    shape = new drawPoint(x, y, R, color);
                    JOptionPane.showMessageDialog(DrawGUI.this, "Do not hit !!! ");
                }
            }
        }
        shapeArray.add(shape);
        graphicsPanel.repaint();
    }
    private class GraphicsPanel extends JPanel {
        @Override
        public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            Graphics2D g2d = (Graphics2D) graphics;
            graphics.setColor(Color.WHITE);
            graphics.clearRect(0, 0, getWidth(), getHeight());
            graphics.setColor(Color.BLACK);
            graphics.drawLine(10, 250, 500, 250);
            graphics.drawLine(225, 0, 225, 500);
            graphics.setColor(Color.red);
            if (R != 0) {
                graphics.fillArc(225, 250, 40 * R / 2, 40 * R / 2, 90, 90);//fifth
                graphics.fillArc(225 - 20 * R / 2,   250 - 20 * R / 2, 40 * R / 2, 40 * R / 2, 0, 90);//first
                int[] xPoints1 = {225 - 20 * R / 2, 225, 225};
                int[] yPoints1 = {250, 250, 250 + 20 * R / 2};
                int[] xPoints2 = {225, 225 - 20 * R / 2, 225};
                int[] yPoints2 = {250 - 20 * R / 2, 250, 250};
                Polygon triangle1 = new Polygon(xPoints1, yPoints1, 3);
                Polygon triangle2 = new Polygon(xPoints2, yPoints2, 3);
                g2d.setStroke(new BasicStroke(1));
                g2d.fillPolygon(triangle1);//third
                g2d.setStroke(new BasicStroke(1));
                g2d.fillPolygon(triangle2);//first
                for (Shape shape : shapeArray) {
                    Color color;
                    int x = shape.getX();//int x =selectedX*R+225;
                    int y = shape.getY();//int y = -selectedY*R+250;
                    int selectedX = list.getSelectedValue();
                    int selectedY = (int) comboBox.getSelectedItem();
                    double center1_X = 225+25*R*0.5;
                    double center1_Y = 275-25*R*0.5;
                    double r1 = 25*R*0.5;
                    double center2_X = 250-25*R*0.5;
                    double center2_Y = 250-25*R*0.5;
                    double r2 = 25*R*0.5;
                    if (selectedX>0&&selectedY>0){
                        double X = selectedX*R+225;
                        double delta = Math.sqrt(Math.pow(2*center1_Y,2)-4*(Math.pow(x,2)-2*center1_X*X+Math.pow(center1_X,2)+Math.pow(center1_Y,2)-Math.pow(r1,2)));
                        double Y = (2*center1_Y+delta)*0.5;
                        if ((((-selectedY)*R)+250)<=Y&&(((-selectedY)*R)+250)>=(250-(20*R*0.5))&&X>=225&&X<=(225+(10*R*0.5))){
                            color = Color.BLUE;
                            shape = new drawPoint(x, y, R, color);
                        }else {
                            color = Color.GREEN;
                            shape = new drawPoint(x, y, R, color);
                        }
                    }
                    else if (selectedX<0&&selectedY>0){
                        double X = selectedX*R+225;
                        double delta = Math.sqrt(Math.pow(2*center2_Y,2)-4*(Math.pow(x,2)-2*center2_X*X+Math.pow(center2_X,2)+Math.pow(center2_Y,2)-Math.pow(r2,2)));
                        double Y = (2*center2_Y+delta)*0.5;
                        if ((((-selectedY)*R)+250)<=Y&&(((-selectedY)*R)+250)>=(250-(10*R/2))){
                            color = Color.BLUE;
                            shape = new drawPoint(x, y, R, color);
                        }else {
                            color = Color.GREEN;
                            shape = new drawPoint(x, y, R, color);
                        }
                    }
                    else if (selectedX<0&&selectedY<0){
                        double X = selectedX*R+225;
                        double triangle1_X = 225-(20*R*0.5);
                        double Y = X+250-triangle1_X;
                        if ((((-selectedY)*R)+250)<=Y&&(((-selectedY)*R)+250)>=250){
                            color = Color.BLUE;
                            shape = new drawPoint(x, y, R, color);
                        }else {
                            color = Color.GREEN;
                            shape = new drawPoint(x, y, R, color);
                        }

                    }
                    else if (selectedX>0&&selectedY<0){
                        double X = selectedX*R+225;
                        double triangle2_X = 225+(20*R*0.5);
                        double Y = 250-X+triangle2_X;
                        if ((((-selectedY)*R)+250)>=Y&&(((-selectedY)*R)+250)<=(250+(20*R*0.5))){
                            color = Color.BLUE;
                            shape = new drawPoint(x, y, R, color);
                        }else{
                            color = Color.GREEN;
                            shape = new drawPoint(x, y, R, color);
                        }
                    }
                    else if ( selectedX==0||selectedY==0) {
                        double X = selectedX*R+225;
                        double Y = -selectedY*R+250;
                        if(selectedY==0){
                            if (X==(225+(10*R*0.5))||(X>=(225-20*R*0.5)&&X<=225)||X==(225+20*R*0.5)){
                                color = Color.BLUE;
                                shape = new drawPoint(x, y, R, color);
                            }else {
                                color = Color.GREEN;
                                shape = new drawPoint(x, y, R, color);
                            }

                        } else if (selectedX==0) {
                            if(Y==(250-(20*R*0.5))||(Y>=250&&Y<=(250+(20*R*0.5)))||Y==(250-10*R*0.5)){
                                color = Color.BLUE;
                                shape= new drawPoint(x, y, R, color);

                            }else {
                                color = Color.GREEN;
                                shape = new drawPoint(x, y, R, color);
                            }
                        }
                    }
                    shape.draw(graphics);
                }
            }
        }
    }
}
abstract class Shape {
    public Shape() {
    }

    abstract void draw(Graphics g);
    abstract int getR();
    abstract int getY();
    abstract int getX();

}

 class drawPoint extends Shape {
    private int x, y, R;
    private Color color;

    public drawPoint(int x, int y, int R, Color color) {
        super();
        this.x = x;
        this.y = y;
        this.color = color;
        this.R = R;
    }
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - 5, y - 5, 10, 10);
    }

    public int getR() {
        return R;
    }
    public int getY() {
        return y;
    }
    public int getX() {
        return x;
    }

}
 class Panel_Button extends JPanel {
    public Panel_Button() {
        this.setBorder(BorderFactory.createLineBorder(Color.black));
        this.setPreferredSize(new Dimension(1000,200));
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
    }
}