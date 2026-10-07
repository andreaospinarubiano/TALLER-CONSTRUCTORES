public class AppDeposito {
    public static void main(String[] args){
        DepositoAgua deposito1 = new DepositoAgua();
        DepositoAgua deposito2 = new DepositoAgua();

        deposito1.setCapacidad(100);
        deposito1.setVolumenActual(80);

        deposito2.setCapacidad(50);
        deposito2.setVolumenActual(10);

        deposito1.setDepositoDesborde(deposito2);

        System.out.println("ESTADO INICIAL");
        System.out.println("\nDeposito principal: ");
        deposito1.mostrarEstado();
        System.out.println("\nDeposito de desborde: ");
        deposito2.mostrarEstado();

        System.out.println("\nAGREGAR AGUA");
        deposito1.agregarAgua(40);

        System.out.println("\nESTADO FINAL");
        System.out.println("\nDeposito principal");
        deposito1.mostrarEstado();
        System.out.println("\nDeposito de desborde");
        deposito2.mostrarEstado();

        System.out.println("\nQUITAR AGUA");
        deposito1.quitarAgua(30);
        deposito1.mostrarEstado();

        deposito1.quitarAgua(200);
        deposito1.mostrarEstado();

    }
}
