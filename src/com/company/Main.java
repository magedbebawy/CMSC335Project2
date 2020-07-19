package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class Main {

    //declaring some public variables
    public static JButton button = new JButton("Construct");
    public static JTextField area = new JTextField("");
    public static JLabel imageLabel = new JLabel();
    public static JTextField value1 = new JTextField();
    public static JTextField value2 = new JTextField();

    public static void main(String[] args) {



        //creating the GUI
        JFrame frame = new JFrame("Project 2");
        frame.setSize(700, 600);
        Container container = frame.getContentPane();
        container.setLayout(null);
        Font font = new Font(Font.DIALOG,  Font.BOLD, 20);
        JLabel label = new JLabel("Select shape");
        label.setFont(font);
        label.setBounds(10, 10, 150, 30 );
        Choice choice = new Choice();
        choice.setBounds(170, 10, 150, 30);
        choice.setFont(font);
        choice.add("");
        choice.add("Circle");
        choice.add("Square");
        choice.add("Triangle");
        choice.add("Rectangle");
        choice.add("Sphere");
        choice.add("Cube");
        choice.add("Cone");
        choice.add("Cylinder");
        choice.add("Torus");
        container.add(label);
        container.add(choice);
        JLabel d1 = new JLabel("d1");
        d1.setFont(font);
        d1.setBounds(10, 50, 150, 30);
        value1.setFont(font);
        value1.setBounds(170, 50, 150, 30);
        JLabel d2 = new JLabel("d2");
        d2.setFont(font);
        d2.setBounds(10, 90, 150, 30);
        value2.setFont(font);
        value2.setBounds(170, 90, 150,30);
        button.setBounds(400, 50, 250, 30);
        button.setFont(font);
        area.setEditable(false);
        area.setBounds(200, 130, 400, 30);
        area.setFont(font);
        imageLabel.setBounds(10, 170, 680, 380 );
        container.add(imageLabel);
        container.add(area);
        container.add(button);
        container.add(d1);
        container.add(value1);
        container.add(d2);
        container.add(value2);
        area.setVisible(false);
        button.setVisible(false);
        d1.setVisible(false);
        value1.setVisible(false);
        d2.setVisible(false);
        value2.setVisible(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        //creating an actionListener for the circle
        ActionListener circle = e -> {
            try {
                double radius = Double.parseDouble(value1.getText());
                area.setText("Area of circle = " + Controller.getAreaOfCircle(radius));
                area.setVisible(true);
                JFrame jframe = new JFrame("Circle");
                jframe.setSize(360, 300);
                jframe.add(new drawCircle());
                jframe.setLocationRelativeTo(null);
                jframe.setVisible(true);
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "please enter a double value");
            }
        };


        //creating an actionListener for the square
        ActionListener square = e -> {
            try {
                double side = Double.parseDouble(value1.getText());
                area.setVisible(true);
                area.setText("Area of square = " + Controller.getAreaOfSquare(side));
                JFrame jframe = new JFrame("Square");
                jframe.setSize(360, 300);
                jframe.add(new drawSquare());
                jframe.setLocationRelativeTo(null);
                jframe.setVisible(true);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "please enter a double value");
            }
        };


        //creating an actionListener for the triangle
        ActionListener triangle = e -> {
            try {
                double base = Double.parseDouble(value1.getText());
                double height = Double.parseDouble(value2.getText());
                area.setVisible(true);
                area.setText("Area of triangle = " + Controller.getAreaOfTriangle(base, height));
                JFrame jframe = new JFrame("Triangle");
                jframe.setSize(360, 300);
                jframe.add(new drawTriangle());
                jframe.setLocationRelativeTo(null);
                jframe.setVisible(true);
            } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "please enter a double value");
                }
            };


        //creating an actionListener for the rectangle
        ActionListener rectangle = e -> {
            try{
                double width = Double.parseDouble(value1.getText());
                double length = Double.parseDouble(value2.getText());
                area.setVisible(true);
                area.setText("Area of rectangle = " + Controller.getAreaOfRectangle(width, length));
                JFrame jframe = new JFrame("Rectangle");
                jframe.setSize(360, 300);
                jframe.add(new drawRectangle());
                jframe.setLocationRelativeTo(null);
                jframe.setVisible(true);
            }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "please enter a double value");
                }
            };


        //creating an actionListener for the sphere
        ActionListener sphere = e -> {
            try {
                double radius = Double.parseDouble(value1.getText());
                area.setVisible(true);
                area.setText("Area of sphere = " + Controller.getAreaOfSphere(radius));
                try {
                    ImageIcon img = image(new File("images/sphere.png"));
                    imageLabel.setIcon(img);
                } catch (IOException ioException) {
                    System.out.println("image not found");
                }
            }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "please enter a double value");
                }
            };


        //creating an actionListener for the cube
        ActionListener cube = e -> {
            try{
                double edge = Double.parseDouble(value1.getText());
                area.setVisible(true);
                area.setText("Area of cube = " + Controller.getAreaOfCube(edge));
                try {
                    ImageIcon img = image(new File("images/cube.png"));
                    imageLabel.setIcon(img);
                } catch (IOException ioException) {
                    System.out.println("image not found");
                }
            }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "please enter a double value");
                }
            };


        //creating an actionListener for the cone
        ActionListener cone = e -> {
            try{
                double radius = Double.parseDouble(value1.getText());
                double height = Double.parseDouble(value2.getText());
                area.setVisible(true);
                area.setText("Area of cone = " + Controller.getAreaOfCone(radius, height));
                try {
                    ImageIcon img = image(new File("images/cone.png"));
                    imageLabel.setIcon(img);
                } catch (IOException ioException) {
                    System.out.println("image not found");
                }
            }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "please enter a double value");
                }
            };


        //creating an actionListener for the cylinder
        ActionListener cylinder = e -> {
            try{
                double radius = Double.parseDouble(value1.getText());
                double height = Double.parseDouble(value2.getText());
                area.setVisible(true);
                area.setText("Area of cylinder = " + Controller.getAreaOfCylinder(radius, height));
                try {
                    ImageIcon img = image(new File("images/cylinder.png"));
                    imageLabel.setIcon(img);
                } catch (IOException ioException) {
                    System.out.println("image not found");
                }
            }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "please enter a double value");
                }
            };


        //creating an actionListener for the torus
        ActionListener torus = e -> {
            try{
            double majorRadius = Double.parseDouble(value1.getText());
            double minorRadius = Double.parseDouble(value2.getText());
            area.setVisible(true);
            area.setText("Area of rectangle = " + Controller.getAreaOfTorus(majorRadius, minorRadius));
            try {
                ImageIcon img = image(new File("images/torus.png"));
                imageLabel.setIcon(img);
            } catch (IOException ioException) {
                System.out.println("image not found");
            }
        }catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "please enter a double value");
            }
        };

        //handling the selected item from the select list
        choice.addItemListener(e -> {
            int shape = choice.getSelectedIndex();
            switch (shape) {
                case 1 -> {
                    removeAdd(square, triangle, rectangle, sphere, cube, cone, cylinder, torus, circle);
                    button.setVisible(true);
                    button.setText("Construct a circle");
                    d1.setText("Radius");
                    d1.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    d2.setVisible(false);
                    value2.setVisible(false);
                }
                case 2 -> {
                    removeAdd(circle, triangle, rectangle, sphere, cube, cone, cylinder, torus, square);
                    button.setVisible(true);
                    button.setText("Construct a square");
                    d1.setText("Side");
                    d1.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    d2.setVisible(false);
                    value2.setText("");
                    value2.setVisible(false);
                }
                case 3 -> {
                    removeAdd(circle, square, rectangle, sphere, cube, cone, cylinder, torus, triangle);
                    button.setVisible(true);
                    button.setText("Construct a triangle");
                    d1.setText("Base");
                    d1.setVisible(true);
                    d2.setText("Height");
                    d2.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    value2.setText("");
                    value2.setVisible(true);
                }
                case 4 -> {
                    removeAdd(square, triangle, circle, sphere, cube, cone, cylinder, torus, rectangle);
                    button.setVisible(true);
                    button.setText("Construct a rectangle");
                    d1.setText("Width");
                    d1.setVisible(true);
                    d2.setText("length");
                    d2.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    value2.setText("");
                    value2.setVisible(true);
                }
                case 5 -> {
                    removeAdd(square, triangle, rectangle, circle, cube, cone, cylinder, torus, sphere);
                    button.setVisible(true);
                    button.setText("Construct a sphere");
                    d1.setText("Radius");
                    d1.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    d2.setVisible(false);
                    value2.setText("");
                    value2.setVisible(false);
                }
                case 6 -> {
                    removeAdd(square, triangle, rectangle, sphere, circle, cone, cylinder, torus, cube);
                    button.setVisible(true);
                    button.setText("Construct a cube");
                    d1.setText("Edge");
                    d1.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    d2.setVisible(false);
                    value2.setText("");
                    value2.setVisible(false);
                }
                case 7 -> {
                    removeAdd(square, triangle, rectangle, sphere, cube, circle, cylinder, torus, cone);
                    button.setVisible(true);
                    button.setText("Construct a cone");
                    d1.setText("Radius");
                    d1.setVisible(true);
                    d2.setText("Height");
                    d2.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    value2.setText("");
                    value2.setVisible(true);
                }
                case 8 -> {
                    removeAdd(square, triangle, rectangle, sphere, cube, cone, circle, torus, cylinder);
                    button.setVisible(true);
                    button.setText("Construct a cylinder");
                    d1.setText("Radius");
                    d1.setVisible(true);
                    d2.setText("Height");
                    d2.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    value2.setText("");
                    value2.setVisible(true);
                }
                case 9 -> {
                    removeAdd(square, triangle, rectangle, sphere, cube, cone, cylinder, circle, torus);
                    button.setVisible(true);
                    button.setText("Construct a torus");
                    d1.setText("Major radius");
                    d1.setVisible(true);
                    d2.setText("Minor radius");
                    d2.setVisible(true);
                    value1.setText("");
                    value1.setVisible(true);
                    value2.setText("");
                    value2.setVisible(true);
                }
            }
        });

    }


    //reading the image from file
    public static ImageIcon image(File file) throws IOException {
        BufferedImage img = ImageIO.read(file);
        return new ImageIcon(img);
    }


    //removing and adding necessary actionListener
    public static void removeAdd(ActionListener a, ActionListener b, ActionListener c, ActionListener d, ActionListener e,
                                 ActionListener f, ActionListener g, ActionListener h, ActionListener i){
        button.removeActionListener(a);
        button.removeActionListener(b);
        button.removeActionListener(c);
        button.removeActionListener(d);
        button.removeActionListener(e);
        button.removeActionListener(f);
        button.removeActionListener(g);
        button.removeActionListener(h);
        button.addActionListener(i);
        area.setVisible(false);
        imageLabel.setIcon(null);
    }
}

//class to draw circle
class drawCircle extends JPanel{

    public void paintComponent(Graphics shape) {
        super.paintComponent(shape);
        Graphics2D graphics2D = (Graphics2D) shape;
        graphics2D.drawOval(10, 20, 200, 200);
    }
}


//class to draw square
class drawSquare extends JPanel{

    public void paintComponent(Graphics shape) {
        super.paintComponent(shape);
        Graphics2D graphics2D = (Graphics2D) shape;
        graphics2D.drawRect(10, 20, 200, 200);
    }
}


//class to draw triangle
class drawTriangle extends JPanel{
    public void paintComponent(Graphics shape) {
        super.paintComponent(shape);
        Graphics2D graphics2D = (Graphics2D) shape;
        int[] x ={130,70,190};
        int[] y={50,200,200};
        graphics2D.drawPolygon(x, y, 3);
    }
}

//class to draw rectangle
class drawRectangle extends JPanel{

    public void paintComponent(Graphics shape) {
        super.paintComponent(shape);
        Graphics2D graphics2D = (Graphics2D) shape;
        graphics2D.drawRect(10, 20, 200, 100);
    }
}