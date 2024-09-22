import java.util.Scanner;
public class lista1exe02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Vamos imprimir a potência. Insira o valor da base: ");
        int base = input.nextInt();
        
        System.out.println("Insira o expoente: ");
        int expo = input.nextInt();
        
        System.out.println("A potência será de: " + Math.pow(base, expo));
    }

}
