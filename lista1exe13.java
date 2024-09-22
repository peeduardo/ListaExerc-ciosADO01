import java.util.Scanner;
public class lista1exe13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Defina três números e informe o maior deles.");
        
        System.out.println("Insira o primeiro valor: ");
        int n1 = input.nextInt();

        System.out.println("Insira o segundo valor: ");
        int n2 = input.nextInt();

        System.out.println("Insira o terceiro valor: ");
        int n3 = input.nextInt();

        if (n1 > n2 & n1 > n3){
            System.out.println("O maior valor é :" + n1);
        } 
        if (n2 > n1 & n2 > n3){
            System.out.println("O maior valor é: " + n2);
        }
        if (n3 > n1 & n3 > n2){
            System.out.println("O maior valor é: " + n3);
        }
    }

}
