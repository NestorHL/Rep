package repo;
import java.util.Scanner;
public class a {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca dos numeros");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();
    double suma = num1 + num2;
    System.out.println("La suma de los dos numeros es " + suma);
    if (suma % 2 == 0) {
      System.out.println("La suma de los dos numeros es par" );
      
    }else {
      
      System.out.println("La suma de los dos numeros es impar" );
    }
    sc.close();
  }
}
