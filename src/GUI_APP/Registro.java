package GUI_APP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registro {
    private JButton Registro;
    private JPanel panel1;
    private JFrame frame;


    public Registro() {
        frame = new JFrame();
        frame.setBounds(100, 100, 786, 470);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);

        initialize();
}

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        setPanel();
    }

    public void setPanel(){
        panel1 = new JPanel();
        panel1.setBounds(10, 10, 752, 413);
        frame.getContentPane().add(panel1);
        panel1.setLayout(null);

        Registro = new JButton("Registro");
        Registro.setBounds(320, 250, 100, 43);
        panel1.add(Registro);
        Registro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Seleccion s = new Seleccion();
               alternateVisible();
            }
        });

        panel1.setVisible(true);
    }

    public static void main(String[] args) {

        Registro r = new Registro();


    }

    public void alternateVisible(){
        if(frame.isVisible()) frame.setVisible(false);
        else frame.setVisible(true);
    }
}


