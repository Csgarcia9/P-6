/* Clase de prueba que implementa la interfaz*/
class Vehiculo implements Estacionamiento {

    private int tiempo;
    private double precioHora = 5.0;

    /* Sobreescritura de los métodos de la interfaz */
    @Override
    public double factura() {
        return tiempo * precioHora;
    }

    /*
     * Devuelve el devuelve el metodo de tipo boolean si le pasan el parametro de
     * tipo Parking
     */
    @Override
    public boolean hayPlaza(Parking parking) {
        return parking.hayPlaza();
    }

    /*
     * Paquea el vehiculo si el parametro es de tipo Parking, de no ser asi no lo
     * hace y envia el mesaje del else
     */
    @Override
    public void parquea(Parking parking) {
        if (hayPlaza(parking)) {
            parking.parquea();
        } else {
            System.out.println("No hay plazas disponibles en el parking.");
        }
    }

    /* Pasando el tiempo de instancia en el parking */
    @Override
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public static void main(String[] args) {
        /*
         * Se crean dos objetos, uno de tipo Parking pasando la capacidad
         * Se crean el de tipo Vehiculo para usar la interfaz y para usar el método
         * parquea le pasamos el objeto Parking.
         */
        Parking parking = new Parking(10);
        Vehiculo vehiculo = new Vehiculo();

        vehiculo.setTiempo(2);
        vehiculo.parquea(parking);
        System.out.println("El importe a pagar es: $" + vehiculo.factura());
        parking.liberaPlaza();
    }

}
