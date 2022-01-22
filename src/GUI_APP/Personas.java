package GUI_APP;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Personas {

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
    private JTable table;





    public Personas() {
        frame = new JFrame();
        frame.setBounds(100, 100, 784, 707);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initialize();
    }
    private void initialize() {
        setPanel();
    }

    public void setPanel() {
        frame = new JFrame();
        frame.setBounds(100, 100, 784, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
        groupLayout.setHorizontalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, 779, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(19, Short.MAX_VALUE))
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

        JButton Anadir = new JButton("A\u00F1adir");
        Anadir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        JButton Cancelar = new JButton("Cancelar");
        Cancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


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

        JLabel Tipo = new JLabel("Tipo(*)");
        Tipo.setHorizontalAlignment(SwingConstants.TRAILING);

        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Socio", "Representante"}));

        JButton Borrar = new JButton("Borrar");
        Borrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


            }
        });

        JButton Finalizar = new JButton("Finalizar");
        Finalizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Registro r = new Registro();
                alternateVisible();

            }
        });

        JScrollPane scrollPane = new JScrollPane();
        JDateChooser dateChooser = new JDateChooser();
        dateChooser.setDateFormatString("MM-dd-yyyy");//yyyy-dd-MM
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
                gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(330)
                                .addComponent(Finalizar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(364, Short.MAX_VALUE))
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(116)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 572, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(gl_panel.createSequentialGroup()
                                                        .addComponent(Borrar, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap(578, Short.MAX_VALUE))
                                                .addGroup(gl_panel.createSequentialGroup()
                                                        .addComponent(Anadir, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                                                        .addComponent(Cancelar)
                                                        .addGap(137)))))
                        .addGroup(gl_panel.createSequentialGroup()
                                .addGap(20)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addComponent(Direccion, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(gl_panel.createSequentialGroup()
                                                        .addComponent(lblFechaNacimiento, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())
                                                .addGroup(gl_panel.createSequentialGroup()
                                                        .addComponent(Pais, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())
                                                .addGroup(gl_panel.createSequentialGroup()
                                                        .addComponent(Valida, GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                                                        .addContainerGap())
                                                .addGroup(gl_panel.createSequentialGroup()
                                                        .addComponent(Datos, GroupLayout.DEFAULT_SIZE, 749, Short.MAX_VALUE)
                                                        .addContainerGap())
                                                .addGroup(gl_panel.createSequentialGroup()
                                                        .addComponent(lblPrimerApellido, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
                                                        .addContainerGap())
                                                .addGroup(gl_panel.createSequentialGroup()
                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(Nombre, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                                                                                        .addComponent(NIF, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                                                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                                                        .addComponent(Contra, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                                                                        .addGroup(gl_panel.createSequentialGroup()
                                                                                                .addComponent(Ciudad, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                                        .addComponent(Planta, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(45)))
                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(p, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                                .addComponent(n, GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(pa, GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(cif, GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(contra, GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(dateChooser, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                                .addComponent(pais, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(city, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(43))
                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                        .addComponent(Calle, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                        .addGap(48)
                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(CP, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(Snombre)
                                                                                                        .addComponent(Numero, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
                                                                                                .addComponent(Region, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
                                                                                        .addGap(50)
                                                                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(cp, 99, 99, 99)
                                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                                        .addComponent(r)
                                                                                                        .addComponent(sa, GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(sn)
                                                                                                        .addComponent(num, GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(comboBox, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(SegundoN, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(SegundoA, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Tipo, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))))
                                                                .addGroup(gl_panel.createSequentialGroup()
                                                                        .addGap(37)
                                                                        .addComponent(Rcontra, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(rcontra, 98, 98, 98)))
                                                        .addContainerGap(47, GroupLayout.PREFERRED_SIZE)))))
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
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblFechaNacimiento)
                                                        .addComponent(Tipo)
                                                        .addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                .addGap(32)
                                                .addComponent(Direccion))
                                        .addComponent(dateChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(16)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(c, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(Numero)
                                                .addComponent(Calle)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(num, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Snombre))
                                        .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(Planta)
                                                .addComponent(p, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(gl_panel.createSequentialGroup()
                                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(Region)
                                                        .addComponent(city, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(Ciudad))
                                                .addGap(12)))
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
                                .addGap(18)
                                .addGroup(gl_panel.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(Cancelar)
                                        .addComponent(Anadir))
                                .addGap(18)
                                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(Borrar)
                                .addGap(18)
                                .addComponent(Finalizar)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );


        table = new JTable();
        table.setModel(new DefaultTableModel(
                new Object[][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                },
                new String[] {
                        "Nombre", "NIF", "Tipo", ""
                }
        ));

        scrollPane.setColumnHeaderView(table);


        panel.setLayout(gl_panel);
        frame.getContentPane().setLayout(groupLayout);

    }
    public static void main(String[] args) {

        Personas p = new Personas();
        p.frame.setVisible(true);

    }

    public void alternateVisible(){
        if(frame.isVisible()) frame.setVisible(false);
        else frame.setVisible(true);
    }

}
