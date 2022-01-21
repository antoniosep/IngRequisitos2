package GUI_APP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Seleccion {
    private JButton Persona;
    private JButton Empresa;
    private JLabel texto;
    private JPanel panel1;
    private JFrame frame;

    public Seleccion() {
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

        Persona = new JButton("Persona física");
        Persona.setBounds(180, 250, 150, 43);
        panel1.add(Persona);
        Persona.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RPersona s = new RPersona();
                alternateVisible();
            }
        });

        Empresa = new JButton("Empresa");
        Empresa.setBounds(450, 250, 150, 43);
        panel1.add(Empresa);
        Empresa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                REmpresa s = new REmpresa();
                alternateVisible();

            }
        });

        texto=new JLabel("Seleccione si quiere crear una cuenta para una persona física o para una empresa");
        texto.setBounds(150, 50, 500, 43);
        panel1.add(texto);

        panel1.setVisible(true);
    }

    public static void main(String[] args) {

        Seleccion s = new Seleccion();


    }

    public  void alternateVisible(){
        if(frame.isVisible()) frame.setVisible(false);
        else frame.setVisible(true);
    }

}
