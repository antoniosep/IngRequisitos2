package Modelo;

import java.util.Date;

public class Persona {
    private String primernombre;
    private String segundoNombre;
    private String primerapellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    private String nif;
    private String  contrasena;
    private String rcontrasena;
    private String calle;
    private int numero;
    private String planta;
    private String region;
    private String ciudad;
    private int CP;
    private String Pais;
    private boolean Valida;


    public Persona(String n, String pn, String sn, String pa, String sa, Date f, String c, String rc, String ca, int num, String p, String r, String city, int cp, String pais, boolean v ){
        this.nif=n;
        this.primernombre=pn;
        this.segundoNombre=null;
        this.primerapellido=pa;
        this.segundoApellido=null;
        this.fechaNacimiento=f;
        this.contrasena=c;
        this.rcontrasena=rc;
        this.calle=ca;
        this.numero=num;
        this.planta=p;
        this.region=null;
        this.ciudad=city;
        this.CP=cp;
        this.Pais=pais;
        this.Valida=false;

    }

    public String getPrimernombre() {
        return primernombre;
    }

    public void setPrimernombre(String primernombre) {
        this.primernombre = primernombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public void setPrimerapellido(String primerapellido) {
        this.primerapellido = primerapellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRcontrasena() {
        return rcontrasena;
    }

    public void setRcontrasena(String rcontrasena) {
        this.rcontrasena = rcontrasena;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public boolean isValida() {
        return Valida;
    }

    public void setValida(boolean valida) {
        Valida = valida;
    }


/*
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
*/
}
