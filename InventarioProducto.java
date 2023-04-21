public class InventarioProducto extends Producto {

    protected int cantidad;
    protected int ganancia;

    public InventarioProducto(String identificación, double costo, int cantidad, int ganancia) {
        super(identificación, costo);
        this.cantidad = cantidad;
        this.ganancia = ganancia;

    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;
    }

    public int getGanancia() {

        return this.ganancia;
    }

    public void setGanancia(int ganancia) {

        this.ganancia = ganancia;
    }

    public double precioFinal() {
        return this.getCosto() + this.ganancia;

    }

    @Override
    public String toString() {

        return this.getCantidad() + " " + this.getIdentificación() + ": " + "RD$" + this.getCosto()
                + " + RD$" + this.getGanancia() + " = " + "RD$"
                + this.precioFinal();

    }

    public static void main(String[] args) {
        InventarioProducto in = new InventarioProducto("Taza", 19.95, 10, 40);
        System.out.println(in.toString());

    }

}