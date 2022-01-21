package GUI_APP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class REmpresa {

/*
    private JFrame frame;
    private JPanel panel1;
    private JLabel Datos;
    private JLabel CIF;
    private JLabel Pnombre;
    private JLabel Direccion;
    private JLabel Calle;
    private JLabel Numero;
    private JLabel Planta;
    private JLabel Ciudad;
    private JLabel Region;
    private JLabel Pais;
    private JLabel CP;
    private JLabel Contra;
    private JLabel ContraR;
    private JCheckBox valida;
    private JButton Registrar;
    private JButton Cancelar;
    private JTextField cif;
    private JTextField n;
    private JTextField pn;
    private JTextField pa;
    private JTextField sn;
    private JTextField sa;
    private JTextField c;
    private JTextField num;
    private JTextField p;
    private JTextField city;
    private JTextField pais;
    private JTextField reg;
    private JTextField cp;
    private JTextField con;
    private JTextField rcon;
*/
    private JFrame frame;
    private JTextField cif;
    private JTextField n;
    private JTextField c;
    private JTextField p;
    private JTextField city;
    private JTextField pais;
    private JTextField num;
    private JTextField r;
    private JTextField cp;
    private JTextField contra;
    private JTextField rcontra;

    public REmpresa() {
        /*frame = new JFrame();
        frame.setBounds(100, 100, 786, 470);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
*/
        frame = new JFrame();
        frame.setBounds(100, 100, 692, 435);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
       /* panel1 = new JPanel();
        panel1.setBounds(10, 10, 752, 413);
        frame.getContentPane().add(panel1);
        panel1.setLayout(null);

        Registrar = new JButton("Registrar");
        Registrar.setBounds(100, 350, 100, 43);
        panel1.add(Registrar);
        Registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //alternateVisible();
            }
        });
        Cancelar = new JButton("Cancelar");
        Cancelar.setBounds(500, 350, 100, 43);
        panel1.add(Cancelar);
        Cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Seleccion s = new Seleccion();
                alternateVisible();
            }
        });

        CIF=new JLabel("CIF(*)");
        CIF.setBounds(20, 40, 500, 43);
        panel1.add(CIF);

        Datos=new JLabel("Datos personales");
        Datos.setBounds(20, 10, 500, 43);
        panel1.add(Datos);

        Pnombre=new JLabel("Nombre de la empresa(*)");
        Pnombre.setBounds(20, 60, 500, 43);
        panel1.add(Pnombre);

        Direccion=new JLabel("Dirección");
        Direccion.setBounds(20, 120, 500, 43);
        panel1.add(Direccion);

        Calle=new JLabel("Calle(*)");
        Calle.setBounds(20, 150, 500, 43);
        panel1.add(Calle);

        Numero=new JLabel("Número(*) /n Segundo nombre");
        Numero.setBounds(400, 150, 500, 43);
        panel1.add(Numero);

        Planta=new JLabel("Planta/Puerta/Oficina(*)");
        Planta.setBounds(20, 170, 500, 43);
        panel1.add(Planta);

        Ciudad=new JLabel("Ciudad(*)");
        Ciudad.setBounds(20, 190, 500, 43);
        panel1.add(Ciudad);

        Region=new JLabel("Región");
        Region.setBounds(400, 190, 500, 43);
        panel1.add(Region);

        Pais=new JLabel("País(*)");
        Pais.setBounds(20, 210, 500, 43);
        panel1.add(Pais);

        CP=new JLabel("C.P(*)");
        CP.setBounds(400, 210, 500, 43);
        panel1.add(CP);

        Contra=new JLabel("Contraseña(*)");
        Contra.setBounds(20, 280, 500, 43);
        panel1.add(Contra);

        ContraR=new JLabel("Contraseña.Repetir(*)");
        ContraR.setBounds(400, 280, 500, 43);
        panel1.add(ContraR);

        valida=new JCheckBox();
        valida.setBounds(30, 250, 500, 43);
        valida.setText("Válida(dirección actual)");
        panel1.add(valida);

        n=new JTextField();
        n.setBounds(30, 60, 500, 20);
        panel1.add(n);

        cif=new JTextField();
        cif.setBounds(25, 40, 500, 20);
        panel1.add(cif);

        c=new JTextField();
        c.setBounds(80, 150, 30, 20);
        panel1.add(c);

        num=new JTextField();
        num.setBounds(150, 50, 30, 20);
        panel1.add(num);

        p=new JTextField();
        p.setBounds(150, 50, 30, 20);
        panel1.add(p);

        city=new JTextField();
        city.setBounds(150, 50, 30, 20);
        panel1.add(city);

        reg=new JTextField();
        reg.setBounds(150, 50, 30, 20);
        panel1.add(reg);

        pais=new JTextField();
        pais.setBounds(150, 50, 30, 20);
        panel1.add(pais);

        cp=new JTextField();
        cp.setBounds(150, 50, 30, 20);
        panel1.add(cp);

        con=new JTextField();
        con.setBounds(150, 50, 30, 20);
        panel1.add(con);

        rcon=new JTextField();
        rcon.setBounds(150, 50, 30, 20);
        panel1.add(rcon);

        panel1.setVisible(true);

        */


        JPanel panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
                                .addContainerGap())
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel, GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                .addContainerGap())
        );

        JLabel Datos = new JLabel("Datos de la empresa");

        JLabel CIF = new JLabel("CIF(*)");

        JLabel Nombre = new JLabel("Nombre de la empresa(*)");

        JLabel Direccion = new JLabel("Direcci\u00F3n");

        JLabel Calle = new JLabel("Calle(*)");

        JLabel Planta = new JLabel("Planta/Puerta/Oficina(*)");

        JLabel Ciudad = new JLabel("Ciudad(*)");

        JLabel Pais = new JLabel("Pa\u00EDs(*)");

        JLabel Numero = new JLabel("N\u00FAmero(*) ");

        JLabel Region = new JLabel("Regi\u00F3n");

        JLabel CP = new JLabel("C.P.(*)");

        JCheckBox Valida = new JCheckBox("V\u00E1lida(direcci\u00F3n actual)");

        JLabel Contra = new JLabel("Contrase\u00F1a(*)");

        JLabel Rcontra = new JLabel("Contrase\u00F1a.Repetir(*)");

        JButton Registrar = new JButton("Registrar");
        Registrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });

        JButton Cancelar = new JButton("Cancelar");
        Cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Seleccion s= new Seleccion();
                alternateVisible();
            }
        });

        cif = new JTextField();
        cif.setColumns(10);

        n = new JTextField();
        n.setColumns(10);

        c = new JTextField();
        c.setColumns(10);

        p = new JTextField();
        p.setColumns(10);

        city = new JTextField();
        city.setColumns(10);

        pais = new JTextField();
        pais.setColumns(10);

        num = new JTextField();
        num.setColumns(10);

        r = new JTextField();
        r.setColumns(10);

        cp = new JTextField();
        cp.setColumns(10);

        contra = new JTextField();
        contra.setColumns(10);

        rcontra = new JTextField();
        rcontra.setColumns(10);

        JLabel Snombre = new JLabel("Segundo nombre");
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(20)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(Direccion, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(CIF, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Datos, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(Nombre, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(Calle, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Pais, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Planta, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(Ciudad, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Valida, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                                        .addComponent(Contra, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addComponent(cif, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(419, Short.MAX_VALUE))
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(n, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addGap(43)
                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(city, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(contra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(pais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(p, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(34)
                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(GroupLayout.Alignment.TRAILING, gl_panel.createSequentialGroup()
                                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(Region, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(CP, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(Snombre)
                                                                                                        .addComponent(Numero, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(45)
                                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                                        .addComponent(num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(cp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                                                        .addGroup(GroupLayout.Alignment.TRAILING, gl_panel.createSequentialGroup()
                                                                                                .addComponent(Rcontra, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(Cancelar, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                                        .addComponent(rcontra, GroupLayout.Alignment.TRAILING))))))
                                                                .addGap(104))))))
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(124)
                                .addComponent(Registrar, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(456, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(36)
                                .addComponent(Datos)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(CIF)
                                        .addComponent(cif, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Nombre)
                                        .addComponent(n, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(32)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(Direccion)
                                                .addGap(18)
                                                .addComponent(Calle))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(Numero)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Snombre)))
                                        .addComponent(c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(Region)
                                                .addComponent(r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Planta)
                                                        .addComponent(p, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(city, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(Ciudad))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(Pais)
                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(CP)
                                                .addComponent(cp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(pais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Valida)
                                .addGap(23)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Contra)
                                        .addComponent(contra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rcontra)
                                        .addComponent(rcontra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Registrar)
                                        .addComponent(Cancelar))
                                .addContainerGap())
        );
        panel.setLayout(gl_panel);
        frame.getContentPane().setLayout(groupLayout);

    }




    public static void main(String[] args) {

        REmpresa r = new REmpresa();
        r.frame.setVisible(true);

    }

    public void alternateVisible(){
        if(frame.isVisible()) frame.setVisible(false);
        else frame.setVisible(true);
    }





}
