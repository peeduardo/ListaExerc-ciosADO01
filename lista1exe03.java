import java.util.Scanner;
public class lista1exe03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Vamos fazer um cálculo de dois números ao quadrado. Insira o primeiro número: ");
        int n1 = input.nextInt();
        
        System.out.println("Insira o segundo: ");
        int n2 = input.nextInt();

        int q1 = n1 * n2;
        int q2 = n2 * n2;

        double somaQuad = q1 + q2;

        System.out.println("O valor da soma dos números ao quadrado é de: " + somaQuad);
    }

}
