public class Carros {
    // Atributos
    String marca;
    String modelo;
    String anoFab;
    String cor;

    //Constructors

    //DEFAULT
    public Carros() {
    }

    //CHEIO
    public Carros(String marca, String modelo, String anoFab, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.cor = cor;
    }

    //Getters and Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(String anoFab) {
        this.anoFab = anoFab;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
