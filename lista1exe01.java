import java.util.Scanner;
public class lista1exe01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vamos fazer uma multiplicação de dois números. Insira o primeiro valor: ");
        int n1 = input.nextInt();

        System.out.println("Insira o segundo: ");
        int n2 = input.nextInt();

        int res = n1 * n2;
        
        System.out.println("O valor final será de " + res);
    }
}
