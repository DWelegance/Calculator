import java.awt.*;
import java.util.Scanner;
import java.awt.event.*;
import javax.swing.*;


class Calculator extends JFrame{

    //this is garb
    String inputstring;
    String inputstring2;
    int num1;
    int num2;

    Calculator() {

        //inits our grid layout
        JPanel p1 = new JPanel();

        p1.setLayout(new GridLayout(4,3));


        FlowLayout layout = new FlowLayout();

        JPanel p2 = new JPanel();

        p2.setLayout(layout);

        JPanel p3 = new JPanel();

        p3.setLayout(new GridLayout(5,1));
        // declares our objects
        JTextField results;


        JButton b1,b2,b3,b4,b5,b6,b7,b8,b9, b0, bplus, bsub, bmulti, bdiv, bequ;
        //creates our objects
        Font font1 = new Font("SansSerif", Font.BOLD, 20);
        results = new JTextField(20);
        results.setPreferredSize(new Dimension(200,75));
        results.setFont(font1);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");


        bplus = new JButton("+");
        bsub = new JButton("-");
        bmulti = new JButton("x");
        bdiv = new JButton("/");
        bequ = new JButton("=");

        //adds our objects
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p1.add(b5);
        p1.add(b6);
        p1.add(b7);
        p1.add(b8);
        p1.add(b9);
        p1.add(b0);

        p3.add(bplus);
        p3.add(bsub);
        p3.add(bmulti);
        p3.add(bdiv);
        p3.add(bequ);

        p2.add(results);


        add(p1, "South");

        add(p2, "North");
        add(p3, "East");

        //adds event listeners for buttons
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"1");
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"2");
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"3");
            }
        });

        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"4");
            }
        });

        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"5");
            }
        });

        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"6");
            }
        });

        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"7");
            }
        });

        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"8");
            }
        });

        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"9");
            }
        });

        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                results.setText(results.getText()+"0");
            }
        });

        bplus.addActionListener(new ActionListener(){
            //this is also garb
            public void actionPerformed(ActionEvent arg0){
                if(inputstring.length() == 0){
                    inputstring = results.getText();
                    num1 = Integer.parseInt(inputstring);
                    results.setText(null);
                }
                else{
                    inputstring2 = results.getText();
                    num2 = Integer.parseInt(inputstring2);
                    int sum = (num1 + num2);
                    String str_sum = Integer.toString(sum);
                    results.setText(str_sum);
                }


            }
        });


        //init settings
        setTitle("Calculator");
        setVisible(true);
        this.setSize(600, 400);
    }

    //main
    public static void main(String args[]){
        new Calculator();
    }

}
