public class DepositoAgua {
    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    public double getCapacidad(){
        return capacidad;
    }

    public void setCapacidad(double capacidad){
        if (capacidad > 0){
            this.capacidad = capacidad;

            if (volumenActual > capacidad){
                double sobrante = volumenActual - capacidad;
                volumenActual = capacidad;

                if (depositoDesborde != null){
                    depositoDesborde.agregarAgua(sobrante);
                } else {
                    System.out.println("No hay deposito para recibir el sobrante: " + sobrante);
                }
            }
        } else {
            System.out.println("La capacidad debe ser mayor que cero.");
        }
    }

    public double getVolumenActual(){
        return volumenActual;
    }

    public void setVolumenActual(double volumenActual){
        if (volumenActual >= 0 && volumenActual <= capacidad){
            this.volumenActual = volumenActual;
        } else {
            System.out.println("El volumen no es valido");
        }
    }

    public DepositoAgua getDespositoDesborde(){
        return depositoDesborde;
    }

    public void setDepositoDesborde(DepositoAgua depositoDesborde){
        this.depositoDesborde = depositoDesborde;
    }

    public void mostrarEstado(){
        System.out.println("Capacidad: " + capacidad + " litros");
        System.out.println("Volumen actual: " + volumenActual + " litros");
        System.out.println("Espacio libre: " + (capacidad - volumenActual) + " litros");
    }

    public void agregarAgua(double cantidad){
        if (cantidad <= 0){
            System.out.println("La cantidad debe ser mayor que cero");
            return;
        }

        double espacioLibre = capacidad - volumenActual;

        if(cantidad <= espacioLibre){
            volumenActual = cantidad + volumenActual;
        } else {
            double sobrante = cantidad - espacioLibre;
            volumenActual = capacidad;

            System.out.println("El deposito se desbordo. Sobrante: " + sobrante + " litros");

            if(depositoDesborde != null){
                depositoDesborde.agregarAgua(sobrante);
            } else {
                System.out.println("No hay deposito conectado para recibir el agua");
            }
        }
    }

    public void quitarAgua(double cantidad){
        if(cantidad <= 0){
            System.out.println("La cantidad debe ser mayor que cero.");
            return;
        }
        if (cantidad <= volumenActual){
            volumenActual = volumenActual - cantidad;
        } else {
            volumenActual = 0;
            System.out.println("No hay suficiente agua.");
        }
    }
}