import java.util.Scanner;
public class lista1exe04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ao inserir um número, irei imprimir o valor consecutivo. Insira o primeiro valor desejado: ");
        int n1 = input.nextInt();
        System.out.println("Insira mais um número: ");
        int n2 = input.nextInt();
        int vf1 = n1 + 1;
        int vf2 = n2 + 1;
        System.out.printf("O valores são: %d e %d\n", vf1, vf2);
    }

}
