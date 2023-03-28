import java.util.Scanner;

public class CajeroAutomatico {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double saldo = 5000; // Saldo inicial de la cuenta
    int opcion;

    System.out.println("Bienvenido al cajero automático");
    System.out.println("1. Consultar saldo");
    System.out.println("2. Retirar dinero");
    System.out.println("3. Salir");

    do {
      System.out.print("Elija una opción: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("Su saldo es: $" + saldo);
          break;
        case 2:
          System.out.print("Ingrese la cantidad a retirar: ");
          double cantidad = scanner.nextDouble();

          if (cantidad > saldo) {
            System.out.println("Fondos insuficientes");
          } else {
            saldo -= cantidad;
            System.out.println("Retire su dinero");
            System.out.println("Su nuevo saldo es: $" + saldo);
          }
          break;
        case 3:
          System.out.println("Gracias por utilizar nuestro cajero automático");
          break;
        default:
          System.out.println("Opción inválida");
          break;
      }
    } while (opcion != 3);
  }
}
