package Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GeneretePassword extends JFrame {

    public void getPopularPasswords() {}

    public void saveToFile(String[] passwords){}

    public GeneretePassword() {

        setBounds( 300,300,300,150);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generator");
        setResizable(false);

        JButton jButton = new JButton("Сгенерировать пароль");
        JTextField jTextField = new JTextField();

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                String[] popularPasswords = {"hello","fine","ok"};
                String result = "";

                result += popularPasswords[random.nextInt(3)];
                result += random.nextInt(90) + 10;

                jTextField.setText(result);

            }
        });

        add(jButton, BorderLayout.NORTH);
        add(jTextField, BorderLayout.CENTER);

        setVisible(true);


    }

    public static void main(String[] args) {
        new GeneretePassword();
    }
}
