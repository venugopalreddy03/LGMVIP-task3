import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Calculator {
    private JFrame frame;
    private JTextField textField;
    double first;
    double second;
    double result;
    String operation;
    String answer;
    private final ButtonGroup buttonGroup = new ButtonGroup();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calculator window = new Calculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Calculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 540, 515);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JLabel lblNewLabel = new JLabel("Scientific Calculator");
        lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 30));
        lblNewLabel.setBounds(106, 10, 481, 23);
        frame.getContentPane().add(lblNewLabel);
        textField = new JTextField();
        textField.setEnabled(false);
        textField.setFont(new Font("Arial Black", Font.BOLD, 20));
        textField.setBounds(10, 44, 509, 67);
        frame.getContentPane().add(textField);
        textField.setColumns(10);
        JButton bttnNewButton = new JButton("\u221A");
        bttnNewButton.setEnabled(false);
        bttnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.sqrt(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton.setBounds(10, 139, 101, 49);
        frame.getContentPane().add(bttnNewButton);
        JButton bttnNewButton_1 = new JButton("1/x");
        bttnNewButton_1.setEnabled(false);
        bttnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = 1 / (Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_1.setBounds(10, 186, 101, 49);
        frame.getContentPane().add(bttnNewButton_1);
        JButton bttnNewButton_2 = new JButton("x^y");
        bttnNewButton_2.setEnabled(false);
        bttnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "X^Y";
            }
        });
        bttnNewButton_2.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_2.setBounds(10, 233, 101, 49);
        frame.getContentPane().add(bttnNewButton_2);
        JButton bttnNewButton_3 = new JButton("x^3");
        bttnNewButton_3.setEnabled(false);
        bttnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = (Double.parseDouble(textField.getText()));
                a = a * a * a;
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_3.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_3.setBounds(10, 280, 101, 49);
        frame.getContentPane().add(bttnNewButton_3);
        JButton bttnNewButton_4 = new JButton("x^2");
        bttnNewButton_4.setEnabled(false);
        bttnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = (Double.parseDouble(textField.getText()));
                a = a * a;
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_4.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_4.setBounds(10, 327, 101, 49);
        frame.getContentPane().add(bttnNewButton_4);
        JButton bttnNewButton_5 = new JButton("n!");
        bttnNewButton_5.setEnabled(false);
        bttnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(textField.getText());
                double fact = 1;
                while (a != 0) {
                    fact = fact * a;
                    a--;
                }
                textField.setText("");
                textField.setText(textField.getText() + fact);
            }
        });
        bttnNewButton_5.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_5.setBounds(10, 374, 101, 49);
        frame.getContentPane().add(bttnNewButton_5);
        JButton bttnplsmin = new JButton("+/-");
        bttnplsmin.setEnabled(false);
        bttnplsmin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(String.valueOf(textField.getText()));
                a = a * (-1);
                textField.setText(String.valueOf(a));
            }
        });
        bttnplsmin.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnplsmin.setBounds(10, 420, 101, 49);
        frame.getContentPane().add(bttnplsmin);
        JButton bttnNewButton_8 = new JButton("Sin");
        bttnNewButton_8.setEnabled(false);
        bttnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.sin(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_8.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_8.setBounds(221, 139, 98, 49);
        frame.getContentPane().add(bttnNewButton_8);
        JButton bttnNewButton_1_2 = new JButton("Sinh");
        bttnNewButton_1_2.setEnabled(false);
        bttnNewButton_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.sinh(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_1_2.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_1_2.setBounds(221, 186, 98, 49);
        frame.getContentPane().add(bttnNewButton_1_2);
        JButton bttnC = new JButton("C");
        bttnC.setEnabled(false);
        bttnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });
        bttnC.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnC.setBounds(221, 233, 98, 49);
        frame.getContentPane().add(bttnC);
        JButton bttn8 = new JButton("8");
        bttn8.setEnabled(false);
        bttn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn8.getText();
                textField.setText(number);
            }
        });
        bttn8.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn8.setBounds(221, 280, 98, 49);
        frame.getContentPane().add(bttn8);
        JButton bttn5 = new JButton("5");
        bttn5.setEnabled(false);
        bttn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn5.getText();
                textField.setText(number);
            }
        });
        bttn5.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn5.setBounds(221, 327, 98, 49);
        frame.getContentPane().add(bttn5);
        JButton bttn2 = new JButton("2");
        bttn2.setEnabled(false);
        bttn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn2.getText();
                textField.setText(number);
            }
        });
        bttn2.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn2.setBounds(221, 374, 98, 49);
        frame.getContentPane().add(bttn2);
        JButton bttn0 = new JButton("0");
        bttn0.setEnabled(false);
        bttn0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn0.getText();
                textField.setText(number);
            }
        });
        bttn0.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn0.setBounds(115, 420, 204, 49);
        frame.getContentPane().add(bttn0);
        JButton bttnNewButton_9 = new JButton("Cos");
        bttnNewButton_9.setEnabled(false);
        bttnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.cos(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_9.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_9.setBounds(321, 139, 97, 49);
        frame.getContentPane().add(bttnNewButton_9);
        JButton bttnNewButton_1_3 = new JButton("Cosh");
        bttnNewButton_1_3.setEnabled(false);
        bttnNewButton_1_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.cosh(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_1_3.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_1_3.setBounds(321, 186, 97, 49);
        frame.getContentPane().add(bttnNewButton_1_3);
        JButton bttnB = new JButton("\uF0E7");
        bttnB.setEnabled(false);
        bttnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bspace = null;
                if (textField.getText().length() > 0) {
                    StringBuilder str = new StringBuilder(textField.getText());
                    str.deleteCharAt(textField.getText().length() - 1);
                    bspace = str.toString();
                    textField.setText(bspace);
                }
            }
        });
        bttnB.setFont(new Font("Wingdings", Font.BOLD, 22));
        bttnB.setBounds(321, 233, 97, 49);
        frame.getContentPane().add(bttnB);
        JButton bttn9 = new JButton("9");
        bttn9.setEnabled(false);
        bttn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn9.getText();
                textField.setText(number);
            }
        });
        bttn9.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn9.setBounds(321, 280, 97, 49);
        frame.getContentPane().add(bttn9);
        JButton bttn6 = new JButton("6");
        bttn6.setEnabled(false);
        bttn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn6.getText();
                textField.setText(number);
            }
        });
        bttn6.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn6.setBounds(321, 327, 97, 49);
        frame.getContentPane().add(bttn6);
        JButton bttn3 = new JButton("3");
        bttn3.setEnabled(false);
        bttn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn3.getText();
                textField.setText(number);
            }
        });
        bttn3.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn3.setBounds(321, 374, 97, 49);
        frame.getContentPane().add(bttn3);
        JButton bttndot = new JButton(".");
        bttndot.setEnabled(false);
        bttndot.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttndot.setBounds(321, 420, 97, 49);
        frame.getContentPane().add(bttndot);
        JButton bttnNewButton_10 = new JButton("Tan");
        bttnNewButton_10.setEnabled(false);
        bttnNewButton_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.tan(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_10.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_10.setBounds(421, 139, 98, 49);
        frame.getContentPane().add(bttnNewButton_10);
        JButton bttnNewButton_1_4 = new JButton("Tanh");
        bttnNewButton_1_4.setEnabled(false);
        bttnNewButton_1_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.tanh(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_1_4.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_1_4.setBounds(421, 186, 98, 49);
        frame.getContentPane().add(bttnNewButton_1_4);
        JButton bttnplus = new JButton("+");
        bttnplus.setEnabled(false);
        bttnplus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "+";
            }
        });
        bttnplus.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttnplus.setBounds(421, 233, 98, 49);
        frame.getContentPane().add(bttnplus);
        JButton bttnsub = new JButton("-");
        bttnsub.setEnabled(false);
        bttnsub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "-";
            }
        });
        bttnsub.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttnsub.setBounds(421, 280, 98, 49);
        frame.getContentPane().add(bttnsub);
        JButton bttnmul = new JButton("*");
        bttnmul.setEnabled(false);
        bttnmul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "*";
            }
        });
        bttnmul.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttnmul.setBounds(421, 327, 98, 49);
        frame.getContentPane().add(bttnmul);
        JButton bttndiv = new JButton("/");
        bttndiv.setEnabled(false);
        bttndiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "/";
            }
        });
        bttndiv.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttndiv.setBounds(421, 374, 98, 49);
        frame.getContentPane().add(bttndiv);
        JButton bttneql = new JButton("=");
        bttneql.setEnabled(false);
        bttneql.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                second = Double.parseDouble(textField.getText());
                if (operation == "+") {
                    result = first + second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if (operation == "-") {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if (operation == "*") {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if (operation == "/") {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if (operation == "%") {
                    result = first % second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if (operation == "X^Y") {
                    double result1 = 1;
                    for (int i = 0; i < second; i++) {
                        result1 = first % result1;
                    }
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }
            }
        });
        bttneql.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttneql.setBounds(421, 420, 98, 49);
        frame.getContentPane().add(bttneql);
        JButton bttnNewButton_7 = new JButton("e^x");
        bttnNewButton_7.setEnabled(false);
        bttnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.exp(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_7.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_7.setBounds(115, 139, 102, 49);
        frame.getContentPane().add(bttnNewButton_7);
        JButton bttnNewButton_1_1 = new JButton("Log");
        bttnNewButton_1_1.setEnabled(false);
        bttnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double a = Math.log(Double.parseDouble(textField.getText()));
                textField.setText("");
                textField.setText(textField.getText() + a);
            }
        });
        bttnNewButton_1_1.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnNewButton_1_1.setBounds(115, 186, 102, 49);
        frame.getContentPane().add(bttnNewButton_1_1);
        JButton bttnpercent = new JButton("%");
        bttnpercent.setEnabled(false);
        bttnpercent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "%";
            }
        });
        bttnpercent.setFont(new Font("Calibri", Font.BOLD, 22));
        bttnpercent.setBounds(115, 233, 102, 49);
        frame.getContentPane().add(bttnpercent);
        JButton bttn7 = new JButton("7");
        bttn7.setEnabled(false);
        bttn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn7.getText();
                textField.setText(number);
            }
        });
        bttn7.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn7.setBounds(115, 280, 102, 49);
        frame.getContentPane().add(bttn7);
        JButton bttn4 = new JButton("4");
        bttn4.setEnabled(false);
        bttn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn4.getText();
                textField.setText(number);
            }
        });
        bttn4.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn4.setBounds(115, 327, 102, 49);
        frame.getContentPane().add(bttn4);
        JButton bttn1 = new JButton("1");
        bttn1.setEnabled(false);
        bttn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText() + bttn1.getText();
                textField.setText(number);
            }
        });
        bttn1.setFont(new Font("Arial Black", Font.BOLD, 22));
        bttn1.setBounds(115, 374, 102, 49);
        frame.getContentPane().add(bttn1);
        JButton bttnNewButton_6_1 = new JButton("0");
        bttnNewButton_6_1.setFont(new Font("Arial", Font.BOLD, 18));
        bttnNewButton_6_1.setBounds(115, 420, 89, 49);
        frame.getContentPane().add(bttnNewButton_6_1);
        JRadioButton rdbttnNewRadioButton = new JRadioButton("ON");
        rdbttnNewRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bttn0.setEnabled(true);
                bttn1.setEnabled(true);
                bttn2.setEnabled(true);
                bttn3.setEnabled(true);
                bttn4.setEnabled(true);
                bttn5.setEnabled(true);
                bttn6.setEnabled(true);
                bttn7.setEnabled(true);
                bttn8.setEnabled(true);
                bttn9.setEnabled(true);
                bttndot.setEnabled(true);
                bttnplsmin.setEnabled(true);
                bttnplus.setEnabled(true);
                bttnsub.setEnabled(true);
                bttndiv.setEnabled(true);
                bttnmul.setEnabled(true);
                bttneql.setEnabled(true);
                bttnpercent.setEnabled(true);
                bttnC.setEnabled(true);
                bttnB.setEnabled(true);
                bttnNewButton.setEnabled(true);
                bttnNewButton_1.setEnabled(true);
                bttnNewButton_1_1.setEnabled(true);
                bttnNewButton_1_2.setEnabled(true);
                bttnNewButton_1_3.setEnabled(true);
                bttnNewButton_1_4.setEnabled(true);
                bttnNewButton_2.setEnabled(true);
                bttnNewButton_3.setEnabled(true);
                bttnNewButton_4.setEnabled(true);
                bttnNewButton_5.setEnabled(true);
                bttnNewButton_6_1.setEnabled(true);
                bttnNewButton_7.setEnabled(true);
                bttnNewButton_8.setEnabled(true);
                bttnNewButton_9.setEnabled(true);
                bttnNewButton_10.setEnabled(true);
                textField.setEnabled(true);
            }
        });
        buttonGroup.add(rdbttnNewRadioButton);
        rdbttnNewRadioButton.setFont(new Font("Arial", Font.BOLD, 13));
        rdbttnNewRadioButton.setBounds(8, 117, 103, 21);
        frame.getContentPane().add(rdbttnNewRadioButton);
        JRadioButton rdbttnOff = new JRadioButton("OFF");
        rdbttnOff.setSelected(true);
        rdbttnOff.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bttn0.setEnabled(false);
                bttn1.setEnabled(false);
                bttn2.setEnabled(false);
                bttn3.setEnabled(false);
                bttn4.setEnabled(false);
                bttn5.setEnabled(false);
                bttn6.setEnabled(false);
                bttn7.setEnabled(false);
                bttn8.setEnabled(false);
                bttn9.setEnabled(false);
                bttndot.setEnabled(false);
                bttnplsmin.setEnabled(false);
                bttnplus.setEnabled(false);
                bttnsub.setEnabled(false);
                bttndiv.setEnabled(false);
                bttnmul.setEnabled(false);
                bttneql.setEnabled(false);
                bttnpercent.setEnabled(false);
                bttnC.setEnabled(false);
                bttnB.setEnabled(false);
                bttnNewButton.setEnabled(false);
                bttnNewButton_1.setEnabled(false);
                bttnNewButton_1_1.setEnabled(false);
                bttnNewButton_1_2.setEnabled(false);
                bttnNewButton_1_3.setEnabled(false);
                bttnNewButton_1_4.setEnabled(false);
                bttnNewButton_2.setEnabled(false);
                bttnNewButton_3.setEnabled(false);
                bttnNewButton_4.setEnabled(false);
                bttnNewButton_5.setEnabled(false);
                bttnNewButton_6_1.setEnabled(false);
                bttnNewButton_7.setEnabled(false);
                bttnNewButton_8.setEnabled(false);
                bttnNewButton_9.setEnabled(false);
                bttnNewButton_10.setEnabled(false);
                textField.setEnabled(false);
            }
        });
        buttonGroup.add(rdbttnOff);
        rdbttnOff.setFont(new Font("Arial", Font.BOLD, 13));
        rdbttnOff.setBounds(114, 117, 103, 21);
        frame.getContentPane().add(rdbttnOff);
    }
}