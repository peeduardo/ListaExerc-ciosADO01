import java.util.Scanner;
public class lista1exe17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira quatro valores inteiros. Primeiro valor: ");
        int a = input.nextInt();

        System.out.println("Segundo valor: ");
        int b = input.nextInt();

        System.out.println("Terceiro valor: ");
        int c = input.nextInt();

        System.out.println("Quarto valor: ");
        int d = input.nextInt();

        if (b > c & d > a & (c + d) > (a + b) & c > 0 & d > 0 & a % 2 == 0){
            System.out.println("Valores aceitos.");
        } else {
            System.out.println("Valores não aceitos.");
        }
    }

}
