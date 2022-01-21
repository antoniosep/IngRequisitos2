package Modelo;

import java.util.Date;

public class Empresa {
    private String nombre;
    private String nif;
    private Date fechaCierre;
    private Direccion direccion;


    public Empresa(String nombre, String nif, Date fechaCierre, Direccion direccion) {
        this.nombre=nombre;
        this.nif=nif;
        this.fechaCierre=fechaCierre;
        this.direccion = direccion;
    }

    public Empresa(String nif){
        DBaccess acceso = new DBaccess();
        Empresa empresa = acceso.buscarEmpresas("nif",nif).get(0);
        this.nombre = empresa.getNombre();
        this.nif = empresa.getNif();
        this.fechaCierre = empresa.getFechaCierre();
        this.direccion = empresa.direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setFechaCierre(Date fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public String getNombre() { return nombre; }

    public String getNif() {
        return nif;
    }

    public Date getFechaCierre() {
        return fechaCierre;
    }
}
