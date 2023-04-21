/*Se crea la interfaz, en ella solo se explica que se va implementar pero no como hacerlo */
interface Estacionamiento {
    /* Métodos que vamos a implementar en la clase de prueba */
    double factura();

    boolean hayPlaza(Parking parking);

    void parquea(Parking parking);

    void setTiempo(int tiempo);
}

/* Clase Parking que será lo que va recibir la implementación de la interfaz */
class Parking {
    private int capacidad;
    private int plazasDisponibles;

    /* Constructor de la clase que acepta un parámetro */
    public Parking(int capacidad) {
        this.capacidad = capacidad;
        this.plazasDisponibles = capacidad;
    }

    /*
     * Se agrega un método booleano para validar que haya plaza o parqueo que
     * retorna el atributo mayor que 0
     */
    public boolean hayPlaza() {
        return plazasDisponibles > 0;
    }

    /* Para disminuir las plazas cuando se parquea alguien */
    public void parquea() {
        plazasDisponibles--;
    }

    /*
     * Para aumentar la plaza luego de parquear y decir que hay parqueo disponible
     */
    public void liberaPlaza() {
        plazasDisponibles++;
        System.out.println("Parqueo disponible");
    }
}
