package GUI_APP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPersona {

    /*private JFrame frame;
    private JPanel panel1;
    private JLabel Datos;
    private JLabel NIF;
    private JLabel Pnombre;
    private JLabel Papellido;
    private JLabel Snombre;
    private JLabel Sapellido;
    private JLabel Fecha;
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
    private JButton Registrar;
    private JButton Cancelar;
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
    private JTextField pa;
    private JTextField sn;
    private JTextField sa;
    private JTextField f;



    public RPersona() {
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
        /*panel1 = new JPanel();
        panel1.setBounds(10, 10, 752, 413);
        frame.getContentPane().add(panel1);
        panel1.setLayout(null);

        Registrar = new JButton("Registrar");
        Registrar.setBounds(320, 250, 100, 43);
        panel1.add(Registrar);
        Registrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //alternateVisible();
            }
        });

        NIF=new JLabel("NIF(*)");
        NIF.setBounds(150, 50, 500, 43);
        panel1.add(NIF);

        Datos=new JLabel("Datos personales");
        Datos.setBounds(150, 50, 500, 43);
        panel1.add(Datos);

        Pnombre=new JLabel("Primer nombre(*)");
        Pnombre.setBounds(150, 50, 500, 43);
        panel1.add(Pnombre);

        Papellido=new JLabel("Primer apellido(*)");
        Papellido.setBounds(150, 50, 500, 43);
        panel1.add(Papellido);

        NIF=new JLabel();
        NIF.setBounds(150, 50, 500, 43);
        panel1.add(NIF);
        NIF=new JLabel();
        NIF.setBounds(150, 50, 500, 43);
        panel1.add(NIF);
        NIF=new JLabel();
        NIF.setBounds(150, 50, 500, 43);
        panel1.add(NIF);
        NIF=new JLabel();
        NIF.setBounds(150, 50, 500, 43);
        panel1.add(NIF);




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

        JLabel Datos = new JLabel("Datos peronales");

        JLabel NIF = new JLabel("NIF(*)");

        JLabel Nombre = new JLabel("Primer Nombre(*)");

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

        JLabel lblPrimerApellido = new JLabel("Primer Apellido(*)");

        pa = new JTextField();
        pa.setColumns(10);

        JLabel SegundoN = new JLabel("Segundo Nombre(*)");

        JLabel SegundoA = new JLabel("Segundo Apellido(*)");

        sn = new JTextField();
        sn.setColumns(10);

        sa = new JTextField();
        sa.setColumns(10);

        JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento(*)");

        f = new JTextField();
        f.setColumns(10);
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(124)
                                .addComponent(Registrar, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(442, Short.MAX_VALUE))
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(20)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(lblFechaNacimiento, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(Pais, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(Valida, GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(Datos, GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(lblPrimerApellido, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(Nombre, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                                                                .addComponent(Calle, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(NIF, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(Ciudad, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(Planta, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addComponent(Contra, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(n, GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(pa, GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(cif, GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(contra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(f, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                                        .addComponent(c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(p, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(city, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(pais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(43))
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addComponent(Direccion, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addGap(48)
                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(Snombre)
                                                                                                .addComponent(Numero, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(Region, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(CP, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                                                                                        .addGap(45)
                                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(cp, 99, 99, 99)
                                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                                        .addComponent(r)
                                                                                                        .addComponent(num, GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(sa, GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(sn))))
                                                                                .addComponent(Cancelar))
                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(SegundoN, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(SegundoA, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addGap(37)
                                                                .addComponent(Rcontra, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(rcontra, 98, 98, 98)))
                                                .addContainerGap(47, GroupLayout.PREFERRED_SIZE))))
        );
        gl_panel.setVerticalGroup(
                gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Datos)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(NIF)
                                        .addComponent(cif, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Nombre)
                                        .addComponent(n, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SegundoN)
                                        .addComponent(sn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPrimerApellido)
                                        .addComponent(pa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(SegundoA)
                                        .addComponent(sa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblFechaNacimiento)
                                                        .addComponent(f, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addComponent(Direccion)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(Calle))
                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                .addComponent(Numero)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(Snombre))))
                                                .addGap(13))
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGap(6)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Planta)
                                                        .addComponent(p, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Ciudad)
                                                        .addComponent(Region)
                                                        .addComponent(city, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Pais)
                                        .addComponent(CP)
                                        .addComponent(cp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Valida)
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(contra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Rcontra)
                                        .addComponent(rcontra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Contra))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Registrar)
                                        .addComponent(Cancelar))
                                .addContainerGap())
        );
        panel.setLayout(gl_panel);
        frame.getContentPane().setLayout(groupLayout);
    }

    public static void main(String[] args) {

        RPersona r = new RPersona();
        r.frame.setVisible(true);

    }

    public void alternateVisible(){
        if(frame.isVisible()) frame.setVisible(false);
        else frame.setVisible(true);
    }





}
