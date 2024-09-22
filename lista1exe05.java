import java.util.Scanner;
public class lista1exe05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos calcular a área de um lado L. Digite o valor do lado L:");
        int L = input.nextInt();
        int area = L * L;
        System.out.println("A área do quadrado é igual a: " + area);
    }
        
}