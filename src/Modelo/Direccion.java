package Modelo;

public class Direccion {
    private int cpostal;
    private String calle;
    private int numero;
    private String ciudad;
    private String pais;
    private String region;
    private boolean valida;
    private String plantaPuertaOficina;

    public Direccion(int cpostal){
        DBaccess acceso = new DBaccess();
        Direccion direccion = acceso.buscarDireccion("cpostal",cpostal).get(0);
        this.cpostal = direccion.getCpostal();
        this.calle = direccion.getCalle();
        this.numero = direccion.getNumero();
        this.ciudad = direccion.getCiudad();
        this.pais = direccion.getPais();
    }
    public Direccion(int cpostal, String calle, int numero, String ciudad, String pais, String region, int valida, String plantaPuertaOficina) {
        this.cpostal = cpostal;
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.pais = pais;
        this.region = region;
        if(valida==0) this.valida=false;
        else this.valida = true;
        this.plantaPuertaOficina = plantaPuertaOficina;

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

    public String getPlantaPuertaOficina() { return plantaPuertaOficina; }

    public String getRegion() { return region; }

    public boolean isValida() { return valida; }

    public void setPlantaPuertaOficina(String plantaPuertaOficina) { this.plantaPuertaOficina = plantaPuertaOficina; }

    public void setRegion(String region) { this.region = region; }

    public void setValida(boolean valida) { this.valida = valida; }
}
