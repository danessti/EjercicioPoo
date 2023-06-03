public class Carro {

    private String marca;

    private String modelo;

    private int anio;

    private String color;

    private boolean acelerar, girar, frenar;

    public Carro(String marca, String modelo, int anio, String color) {

        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;

    }

    public Carro() {}

    public String getMarca() { return "La marca del carro es: " + marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return "El modelo del carro es: " + modelo; }

    public void setModelo(String modelo) { this.modelo = modelo;}

    public int getAnio() { return anio; }

    public void setAnio(int anio) { this.anio = anio; }

    public String getColor() { return "El color del carro es: " + color; }

    public void setColor(String color) { this.color = color; }

    public String mostrarInformacion() {

        return "Marca del carro: " + marca + ", modelo del carro: " + modelo +
                ", Anio del carro: " + anio + ", color del carro: " + color;

    }

    public void setAcelerar(String acelerar) {

        if (acelerar.equalsIgnoreCase("si")) {
            this.acelerar = true;
        } else {
            this.acelerar = false;
        }

    }

    public String getAcelerar() {

        if (acelerar) {
            return "El carro esta en movimiento";
        } else {
            return "El carro esta estatico";
        }

    }

    public void setFrenar(String frenar) {

        if (frenar.equalsIgnoreCase("si")) {
            this.frenar = true;
        } else {
            this.frenar = false;
        }

    }

    public String getFrenar() {

        if (frenar) {
                return "El carro esta frenando";
        } else {
            return "El carro continua con la accion anterior";
        }

    }

    public void setGirar(String girar) {

        if (girar.equalsIgnoreCase("derecha")) {
            this.girar = true;
        } else {
            this.girar = false;
        }

    }

    public String getGirar() {

        if (girar) {
            return "El carro esta girando a la derecha";
        } else {
            return "El carro esta girando a la izquierda";
        }

    }

}