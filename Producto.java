public class Producto {

    private String identificación;
    private double costo;

    /* Contrucotor de la clase */
    public Producto(String identificador, double costo) {

        this.identificación = identificador;
        this.costo = costo;

    }

    /* Métodos get y set para cada atributo pasado por parámetros */
    public String getIdentificación() {
        return identificación;
    }

    public double getCosto() {
        return costo;
    }

    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        // Sobre escribiendo el método
        return this.identificación + " " +"RD$"+this.getCosto();
    }

    public static void main(String[] args) {
        /*Creando un objeto de la clase para llamar al méetodo toString(); */
        Producto producto = new Producto("Taza", 19.95);
       /*Imprimiendo el método desde una instancia de la clase */
        System.out.println(producto.toString());

    }

}