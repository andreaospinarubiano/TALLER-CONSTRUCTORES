public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public String getOrigen(){
        return origen;
    }

    public void setOrigen(String origen){
        this.origen = origen;
    }

    public String getDestino(){
        return destino;
    }

    public void setDestino(String destino){
        this.destino = destino;
    }

    public int getOcupacion(){
        return ocupacion;
    }

    public void setOcupacion(int ocupacion){
        if (ocupacion >= 0 && ocupacion <= capacidadMaxima){
            this.ocupacion = ocupacion;
        } else {
            System.out.println("La ocupacion no es valida");
        }
    }

    public int getCapacidadMaxima(){
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima){
        this.capacidadMaxima = capacidadMaxima;
    }

    public void mostrarInfo(){
        System.out.println("Numero de vuelo es: " + numero);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Ocupacion: " + ocupacion);
        System.out.println("Capacidad maxima: " + capacidadMaxima);
    }

    public void embarcar(int pasajeros){
        if (ocupacion + pasajeros <= capacidadMaxima){
            ocupacion = ocupacion + pasajeros;
            System.out.println("Se embarcaron " + pasajeros + " pasajeros.");
        } else {
            System.out.println("No hay suficiente espacio para embarcar " + pasajeros + " pasajeros.");
        }
    }

    public void desembarcar (int pasajeros){
        if (ocupacion - pasajeros >= 0){
            ocupacion = ocupacion - pasajeros;
            System.out.println("Se desembarcaron " + pasajeros + " pasajeros.");
        } else {
            System.out.println("No se pueden desembarcar " + pasajeros + " pasajeros.");
        }
    }
}
