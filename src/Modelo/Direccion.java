package Modelo;

public class Direccion {
    private int cpostal;
    private String calle;
    private int numero;
    private String ciudad;
    private String pais;
    private String plantaPuertaOficina;
    private String region;
    private boolean valida;


    public Direccion(int cpostal){
        DBaccess acceso = new DBaccess();
        Direccion direccion = acceso.buscarDireccion("cpostal",cpostal).get(0);
        this.cpostal = direccion.getCpostal();
        this.calle = direccion.getCalle();
        this.numero = direccion.getNumero();
        this.ciudad = direccion.getCiudad();
        this.pais = direccion.getPais();
    }
    public Direccion(int cpostal, String calle, int numero, String ciudad, String pais) {
        this.cpostal = cpostal;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCpostal() {
        return cpostal;
    }

    public void setCpostal(int cpostal) {
        this.cpostal = cpostal;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
