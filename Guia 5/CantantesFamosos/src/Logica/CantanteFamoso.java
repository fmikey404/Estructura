package Logica;

public class CantanteFamoso {
    String nombres;
    String discoConMasVentas;
    int copiasDisco;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombres, String discoConMasVentas, int copiasDisco) {
        this.nombres = nombres;
        this.discoConMasVentas = discoConMasVentas;
        this.copiasDisco = copiasDisco;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    public int getCopiasDisco() {
        return copiasDisco;
    }

    public void setCopiasDisco(int copiasDisco) {
        this.copiasDisco = copiasDisco;
    }
    
    
}
