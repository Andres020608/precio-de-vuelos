
import java.util.Scanner;  // Mueve la declaración de importación aquí

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;   
        int valor_defecto = 1000000;
        int valor_real = 0;
        
        System.out.println("Ingrese la edad del niño");
        edad = sc.nextInt();
        
        if (edad < 2) {
            System.out.println("El niño no puede viajar");
        } else if (edad >= 2 && edad < 5) {
            System.out.println("El valor de su boleto es de 0");
        } else if (edad >= 5 && edad < 11) {
            valor_real = valor_defecto * 1 / 2;
            System.out.println("El valor de su boleto es " + valor_real);
        } else if (edad >= 11 && edad < 15) {
            valor_real = valor_defecto * 3 / 4;
            System.out.println("El valor de su boleto es " + valor_real);
        } else if (edad >= 15) {
            System.out.println("El valor de su boleto es " + valor_defecto);
        }
    }
}
