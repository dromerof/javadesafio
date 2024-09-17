import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("******************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + "$" + saldo);
        System.out.println("\n******************************");

        String menu = """
                *** Escriba el numero de la opcion deseada***
                1 - Consultar saldo
                2 - Retirar 
                3 - Depositar
                4 - salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 4) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo actualizado es: " + "$" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que sea retirar");
                    double valorRetirar = teclado.nextDouble();
                    if (valorRetirar > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo = saldo - valorRetirar;
                        System.out.println("El saldo actualizado es: " + "$" + saldo);
                    }
                    break;

                case 3:
                    System.out.println("¿Cual es el valor que sea depositar?");
                    double valorDepositar = teclado.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("El saldo actualizado es: " + "$" + saldo);
                    break;

                case 4:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        }

    }
}
