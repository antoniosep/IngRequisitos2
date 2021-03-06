package Modelo;

import javax.swing.*;
import java.sql.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DBaccess {

    static final String BD_SERVER = "jdbc:mysql://eburyrequisitos.cobadwnzalab.eu-central-1.rds.amazonaws.com";
    static final String BD_NAME = "grupo07DB";
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String USER = "grupo07";
    static final String PASS = "FjLWM6DNk6TJDzfV";
    public static String idEmpresa ="D12312322";

    public static Connection conn;
    private static DBaccess acceso = null;

    public DBaccess() {
        try {
            // create connection for database called DBB_SCHEMA in a server installed in
            // DB_URL, with a user USER with password PASS
            //Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(BD_SERVER + "/" + BD_NAME, USER, PASS);
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DBaccess getInstance() {
        if (acceso == null) {
            acceso = new DBaccess();
        }
        return acceso;
    }

    public static boolean HealthCheck() {
        boolean res;
        try {
            conn = DriverManager.getConnection(BD_SERVER + "/" + BD_NAME, USER, PASS);
            res=true;
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
            res=false;
        } catch (Exception e) {
            e.printStackTrace();
            res=false;
        }

        return res;
    }

    public Clientes inicioSesion(String usr, String psw) {

        Clientes cliente = buscarClientes("id",usr).get(0);
        return (cliente!=null)&&(cliente.getPsw().equals(psw)) ? cliente : null;

    }
    //------
    //Llamar a la función con los valores = null si no se han introducido
    public void crearCuentaPersona(String n, String pn, String sn, String pa, String sa, Date f, String c, String rc, String ca,
                                   int num, String p, String r, String city, int cp, String pais, boolean v, Persona.tipoP tp) throws Exception {
//f.compareTo(null)==0 || tp.compareTo(null)==0
        Date fechaact = new Date();
        if(n.compareTo("")==0 || pn.compareTo("")==0||pa.compareTo("")==0  || c.compareTo("")==0 || rc.compareTo("")==0 || ca.compareTo("")==0 || num == 0 || p.compareTo("")==0 || city.compareTo("")==0 || pais.compareTo("")==0 || cp==0 || f.compareTo(fechaact)==0) {
            throw new Exception("ERR1");
        }
        else if(c.compareTo(rc)!=0){
            throw new Exception("ERR2");
        }
        else{
            String InsertQueryBody = "INSERT INTO persona VALUES ('" + n + "','" + pn + "','" + sn + "','" + pa + "','" + sa + "','" + f + "','" + tp + "')";
            String InsertQueryBody2 = "INSERT INTO cliente VALUES ('" + n + "'," + null + "," + null + "," + null + ",'" + c + "'," + cp + ")";
            String InsertQueryBody3 = "INSERT INTO direccion (`cpostal`,`calle`,`numero`,`ciudad`,`pais`,`idCliente`,`region`,`valida`,`planta/puerta/oficina`)" +
                    " VALUES (" + cp + ",'" + ca + "'," + num + ",'" + city + "','" + pais + "','" + n + "','" + r + "'," + v + ",'" + p + "')";

            PreparedStatement preparedStatement1 = conn.prepareStatement(InsertQueryBody);
            PreparedStatement preparedStatement2 = conn.prepareStatement(InsertQueryBody2);
            PreparedStatement preparedStatement3 = conn.prepareStatement(InsertQueryBody3);

            preparedStatement1.executeUpdate();
            preparedStatement2.executeUpdate();
            preparedStatement3.executeUpdate();

            JOptionPane.showMessageDialog(new JFrame(), "La cuenta ha sido creada con exito");

        }

    }

    //Llamar a la función con los valores = null si no se han introducido
    public void crearCuentaEmpresa(String cif,String nombre,String calle,int numero,String planta,String ciudad,
                                   String pais,String region,int cp,Boolean valida,String psw,String psw2) throws Exception {
        if(cif.compareTo("")==0 || nombre.compareTo("")==0 || psw.compareTo("")==0 || psw2.compareTo("")==0 || calle.compareTo("")==0 || numero == 0 || planta.compareTo("")==0 || ciudad.compareTo("")==0 || pais.compareTo("")==0 || cp==0) {
            throw new Exception("ERR1");
        }else if (!psw.equals(psw2)) {
            throw new Exception("ERR2");
        }else{
            String InsertQueryBody = "INSERT INTO empresa VALUES ('" + cif + "','" + nombre + "'," + null + ")";
            String InsertQueryBody2 = "INSERT INTO cliente VALUES ('" + cif + "'," + null + "," + null + "," + null + ",'" + psw + "'," + cp + ")";

            String InsertQueryBody3 = "INSERT INTO direccion (`cpostal`,`calle`,`numero`,`ciudad`,`pais`,`idCliente`,`region`,`valida`,`planta/puerta/oficina`)" +
                    " VALUES (" + cp + ",'" + calle + "'," + numero + ",'" + ciudad + "','" + pais + "','" + cif + "','" + region + "'," + valida + ",'" + planta + "')";

            PreparedStatement preparedStatement1 = conn.prepareStatement(InsertQueryBody2);
            PreparedStatement preparedStatement2 = conn.prepareStatement(InsertQueryBody);
            PreparedStatement preparedStatement3 = conn.prepareStatement(InsertQueryBody3);

            preparedStatement1.executeUpdate();
            preparedStatement2.executeUpdate();
            preparedStatement3.executeUpdate();

            idEmpresa = cif;

            JOptionPane.showMessageDialog(new JFrame(), "La cuenta ha sido creada con exito");
        }

    }

    public void crearCuentaPersonaRelacionada(String n, String pn, String sn, String pa, String sa, Date f, String c, String rc, String ca,
                                              int num, String p, String r, String city, int cp, String pais, boolean v, String tp,String idEmpresa) throws Exception {

        if(n.compareTo("")==0 || pn.compareTo("")==0  || pa.compareTo("")==0  || c.compareTo("")==0 || rc.compareTo("")==0 || ca.compareTo("")==0 || num == 0 || p.compareTo("")==0 || city.compareTo("")==0 || pais.compareTo("")==0 || cp==0) {
            throw new Exception("ERR1");
        }
        else if(c.compareTo(rc)!=0){ //|| f.compareTo(null)==0  ||  tp.compareTo(null)==0
            throw new Exception("ERR2");
        }
        else{
            String InsertQueryBody = "INSERT INTO persona VALUES ('" + n + "','" + pn + "','" + sn + "','" + pa + "','" + sa + "','" + f + "','" + tp + "')";
            String InsertQueryBody2 = "INSERT INTO cliente VALUES ('" + n + "'," + null + "," + null + "," + null + ",'" + c + "'," + cp + ")";
            String InsertQueryBody3 = "INSERT INTO PersonaRelacionada VALUES ('" + n + "'," + null + ", '" + tp + "','" + idEmpresa + "'," + null +")";
            String InsertQueryBody4 = "INSERT INTO direccion (`cpostal`,`calle`,`numero`,`ciudad`,`pais`,`idCliente`,`region`,`valida`,`planta/puerta/oficina`)" +
                    " VALUES (" + cp + ",'" + ca + "'," + num + ",'" + city + "','" + pais + "','" + n + "','" + r + "'," + v + ",'" + p + "')";

            PreparedStatement preparedStatement1 = conn.prepareStatement(InsertQueryBody);
            PreparedStatement preparedStatement2 = conn.prepareStatement(InsertQueryBody2);
            PreparedStatement preparedStatement3 = conn.prepareStatement(InsertQueryBody3);
            PreparedStatement preparedStatement4 = conn.prepareStatement(InsertQueryBody4);

            preparedStatement1.executeUpdate();
            preparedStatement2.executeUpdate();
            preparedStatement3.executeUpdate();
            preparedStatement4.executeUpdate();

            JOptionPane.showMessageDialog(new JFrame(), "La cuenta ha sido creada con exito");

        }

    }

    /*
    public void crearCuentaPersonaRelacionada(String n, String pn, String sn, String pa, String sa, Date f, String c, String rc, String ca,
                                              int num, String p, String r, String city, int cp, String pais, boolean v, Persona.tipoP tp,String idEmpresa){

        if(n.compareTo("")==0 || pn.compareTo("")==0 || f.compareTo(null)==0 || pa.compareTo("")==0  || c.compareTo("")==0 || rc.compareTo("")==0 || ca.compareTo("")==0 || num == 0 || p.compareTo("")==0 || city.compareTo("")==0 || pais.compareTo("")==0 || cp==0) {
            JOptionPane.showMessageDialog(new JFrame(), "No se ha podido crear la cuenta porque hay datos obligatorios que no han sido rellenados o datos con formato incorrecto.");
        }
        else if(c.compareTo(rc)!=0){ //|| f.compareTo(null)==0  || tp.compareTo(null)==0
            JOptionPane.showMessageDialog(new Frame(), "La contraseña es distinta");
        }
        else{
            if (c.equals(rc)) {
                String InsertQueryBody = "INSERT INTO persona VALUES ('" + n + "','" + pn + "','" + sn + "','" + pa + "','" + sa + "','" + f + "','" + tp + "')";
                String InsertQueryBody2 = "INSERT INTO cliente VALUES ('" + n + "'," + null + "," + null + "," + null + ",'" + c + "'," + cp + ")";
                String InsertQueryBody3 = "INSERT INTO PersonaRelacionada VALUES ('" + idEmpresa + "'," + null + "," + tp + "," + n + ",'" + null +")";
                String InsertQueryBody4 = "INSERT INTO direccion (`cpostal`,`calle`,`numero`,`ciudad`,`pais`,`idCliente`,`region`,`valida`,`planta/puerta/oficina`)" +
                        " VALUES (" + cp + ",'" + ca + "'," + num + ",'" + city + "','" + pais + "','" + n + "','" + r + "'," + v + ",'" + p + "')";
                try {
                    PreparedStatement preparedStatement1 = conn.prepareStatement(InsertQueryBody);
                    PreparedStatement preparedStatement2 = conn.prepareStatement(InsertQueryBody2);
                    PreparedStatement preparedStatement3 = conn.prepareStatement(InsertQueryBody3);
                    PreparedStatement preparedStatement4 = conn.prepareStatement(InsertQueryBody4);

                    preparedStatement1.executeUpdate();
                    preparedStatement2.executeUpdate();
                    preparedStatement3.executeUpdate();
                    preparedStatement4.executeUpdate();

                    JOptionPane.showMessageDialog(new JFrame(), "La cuenta ha sido creada con exito");


                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(new JFrame(), "No se ha podido crear la cuenta por problemas de acceso a la base de datos");
                }
            }
        }

    }

     */

    public void borrarCuentaPersonaRelacionada(String n, int cp,String idEmpresa){


                String DeleteQueryBody = "DELETE FROM persona WHERE idCliente = '"+n+"'";
                String DeleteQueryBody2 = "DELETE FROM cliente WHERE id = '"+n+"'";
                String DeleteQueryBody3 = "DELETE FROM PersonaRelacionada WHERE idCliente = '"+n+"'";
                String DeleteQueryBody4 =  "DELETE FROM direccion WHERE id = '"+cp+"'";
                try {//
                    System.out.println(DeleteQueryBody);
                    PreparedStatement preparedStatement1 = conn.prepareStatement(DeleteQueryBody);
                    PreparedStatement preparedStatement2 = conn.prepareStatement(DeleteQueryBody2);
                    PreparedStatement preparedStatement3 = conn.prepareStatement(DeleteQueryBody3);
                    PreparedStatement preparedStatement4 = conn.prepareStatement(DeleteQueryBody4);

                    preparedStatement1.executeUpdate();
                    preparedStatement2.executeUpdate();
                    preparedStatement3.executeUpdate();
                    preparedStatement4.executeUpdate();

                    JOptionPane.showMessageDialog(new JFrame(), "La cuenta ha sido borrada con exito");


                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(new JFrame(), "No se ha podido crear la cuenta por problemas de acceso a la base de datos");
                }
            }




    //---

    public List<Direccion> buscarDireccion(String nombreColumna, int filtro){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Direccion> res = new LinkedList<Direccion>();
        String selectQueryBody = "SELECT * FROM direccion WHERE "+ nombreColumna +"=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            preparedStatement.setInt(1, filtro);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Direccion dir = new Direccion(rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(5), rs.getString(8), rs.getInt(9), rs.getString(10));
                res.add(dir);
                System.out.println(dir.toString());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<Direccion> buscarDireccion(){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Direccion> res = new LinkedList<Direccion>();
        String selectQueryBody = "SELECT * FROM direccion WHERE " + 0 + "=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            preparedStatement.setString(1, "0");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                res.add(new Direccion(rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(5), rs.getString(8), rs.getInt(9), rs.getString(10)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<Clientes> buscarClientes(String nombreColumna, String filtro){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
        * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
        * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
        * */
        List<Clientes> res = new LinkedList<Clientes>();
        String selectQueryBody = "SELECT * FROM cliente WHERE "+ nombreColumna +"=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            preparedStatement.setString(1, filtro);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                res.add(new Clientes(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getInt(6)));//new Direccion (rs.getInt(6))
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    /*
    public List<Clientes> buscarClientes(){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos

        List<Clientes> res = new LinkedList<Clientes>();
        String selectQueryBody = "SELECT * FROM cliente WHERE "+ 0 +"=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            preparedStatement.setString(1, "0");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                res.add(new Clientes(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), new Direccion (rs.getInt(6))));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    */


    public List<Transaccion> buscarTransacciones(){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Transaccion> res = new LinkedList<Transaccion>();
        String selectQueryBody = "SELECT * FROM transaccion ";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            //preparedStatement.setString(1,"0");
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                    res.add(new Transaccion(rs.getString(1), rs.getDate(2), rs.getDate(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return res;
    }

    public List<Transaccion> buscarTransacciones(String nombreColumna, String filtro){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Transaccion> res = new LinkedList<Transaccion>();
        String selectQueryBody = "SELECT * FROM transaccion WHERE "+ nombreColumna +"=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            //preparedStatement.setString(1,filtro);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                res.add(new Transaccion(rs.getString(1), rs.getDate(2), rs.getDate(3)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<Persona> buscarPersonas(String nombreColumna, String filtro){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Persona> res = new LinkedList<Persona>();
        String selectQueryBody = "SELECT * FROM persona";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            //preparedStatement.setString(1, filtro);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                //res.add(new Persona(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<Empresa> buscarEmpresas(String nombreColumna, String filtro){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Empresa> res = new LinkedList<Empresa>();
        String selectQueryBody = "SELECT * FROM empresa WHERE "+ nombreColumna +"=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            preparedStatement.setString(1, filtro);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Clientes cl = new Clientes(rs.getString(1));
                res.add(new Empresa(rs.getString(1), rs.getString(2), rs.getDate(3), cl.getDireccion()));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public List<Cuentas> buscarCuentas(){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Cuentas> res = new LinkedList<Cuentas>();
        String selectQueryBody = "SELECT * FROM cuentaEbury";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                res.add(new Cuentas(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5),rs.getString(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    public List<Cuentas> buscarCuentas(String nombreColumna, String filtro){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Cuentas> res = new LinkedList<Cuentas>();
        String selectQueryBody = "SELECT * FROM cuenta WHERE "+ nombreColumna +"=?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            preparedStatement.setString(1, filtro);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                res.add(new Cuentas(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getDate(5),rs.getString(6)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    public List<Direccion> buscarDireccion(String nombreColumna, String filtro){
        /* Aqui tenemos señoras y señores un codigo bien de chido para que
         * podamos hacer SELECT a la bbdd pero seleccionando una columna y una
         * restriccion, si queremos aplicar más de una condicion ajo y agua amigos
         * */
        List<Direccion> res = new LinkedList<Direccion>();
        String selectQueryBody = "SELECT * FROM direccion";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            //preparedStatement.setString(1, filtro);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                res.add(new Direccion(rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(5), rs.getString(8), rs.getInt(9), rs.getString(10)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }

    public String generarInformeSemanal() {
        String selectQueryBody = "SELECT ibanCuenta, apellido, nombre, calle, ciudad, cpostal, direccion.pais, cliente.id, cuentaEbury.id, fechaNacimiento " +
                "FROM persona, cuentaBanco, cuentaEbury, cliente, direccion " +
                "WHERE cuentaEbury.numeroCuenta = cuentaBanco.ibanCuenta AND cliente.id= cuentaEbury.id AND cliente.numeroIdentificacion = persona.dni;";
        String res = null;
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(selectQueryBody);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                res += rs.getString(1) + " ";
                res += rs.getString(2) + " ";
                res += rs.getString(3) + " ";
                res += rs.getString(4) + " ";
                res += rs.getString(5) + " ";
                res += rs.getInt(6) + " ";
                res += rs.getString(7) + " ";
                res += rs.getString(8) + " ";
                res += rs.getString(9) + " ";
                res += rs.getDate(10) + " ";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        System.out.println(res);
        return res;
    }
}


