package Modelo;

import java.util.Date;

public class Persona {
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String dni;

    public Persona(String nombre, String segundoNombre, String apellido, String segundoApellido, Date fechaNacimiento, String dni) {
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
    }

    public Persona(String dni){
        DBaccess acceso = new DBaccess();
        Persona persona = acceso.buscarPersonas("dni", dni).get(0);
        this.nombre = persona.getNombre();
        this.segundoNombre = persona.getSegundoNombre();
        this.apellido = persona.getApellido();
        this.segundoApellido = persona.getSegundoApellido();
        this.fechaNacimiento = persona.getFechanaciMiento();
        this.dni = persona.getDni();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechanaciMiento() {
        return fechaNacimiento;
    }

    public void setFechanaciMiento(Date fechanaciMiento) {
        this.fechaNacimiento = fechanaciMiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    }
}
