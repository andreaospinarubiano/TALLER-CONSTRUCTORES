public class AppVuelo {
    public static void main(String[]args){
        Vuelo vuelo1 = new Vuelo();

        vuelo1.setNumero("AV9401");
        vuelo1.setOrigen("Bogota");
        vuelo1.setDestino("Medellin");
        vuelo1.setCapacidadMaxima(100);
        vuelo1.setOcupacion(70);

        Vuelo vuelo2 = new Vuelo();

        vuelo2.setNumero("AV8512");
        vuelo2.setOrigen("Tolima");
        vuelo2.setDestino("Cartagena");
        vuelo2.setCapacidadMaxima(150);
        vuelo2.setOcupacion(50);

        System.out.println("VUELO 1");
        vuelo1.mostrarInfo();

        System.out.println("VUELO 2");
        vuelo2.mostrarInfo();

        System.out.println("GETTERS");
        System.out.println("Numero del vuelo 1: " + vuelo1.getNumero());
        System.out.println("Origen: " + vuelo1.getOrigen());
        System.out.println("Destino: " + vuelo1.getDestino());
        System.out.println("Capacidad maxima: " + vuelo1.getCapacidadMaxima());
        System.out.println("Ocupacion: " + vuelo1.getOcupacion());

        System.out.println("EMBARCAR");
        vuelo1.embarcar(20);
        System.out.println("Ocupacion actual: " + vuelo1.getOcupacion());
        vuelo1.embarcar(20);
        System.out.println("Ocupacion actual: " + vuelo1.getOcupacion());

        System.out.println("DESEMBARCAR");
        vuelo1.desembarcar(30);
        System.out.println("Ocupacion actual:" + vuelo1.getOcupacion());
        vuelo1.desembarcar(100);
        System.out.println("Ocupacion actual: " + vuelo1.getOcupacion());
    }
}
