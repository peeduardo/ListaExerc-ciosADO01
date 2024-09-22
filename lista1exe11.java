import java.util.Scanner;
public class lista1exe11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira um número: ");
        int n1 = input.nextInt();

        if (n1 < 0){
        System.out.println("O número é negativo");
        }
        else {
            System.out.println("Número não é negativo.");
        }
    }
}
