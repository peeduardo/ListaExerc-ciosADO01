import java.util.Scanner;
public class lista1exe08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vamos ler quatro números e imprimir a média aritmética destes. ");

        System.out.println("Insira o primeiro valor: ");
        float n1 = input.nextFloat();

        System.out.println("Insira o segundo valor: ");
        float n2 = input.nextFloat();

        System.out.println("Insira o terceiro valor: ");
        float n3 = input.nextFloat();

        System.out.println("Insira o quarto valor: ");
        float n4 = input.nextFloat();

        float mediaArit = (n1 + n2 + n3 + n4) /4;
        System.out.println("A média aritmética destes valores, é igual a: " + mediaArit); 
    }
}