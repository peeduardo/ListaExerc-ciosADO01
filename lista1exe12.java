import java.util.Scanner;
public class lista1exe12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os valores de L e R para verificar o cálculo da área e imprimir o maior.");
        
        System.out.println("Insira L");
        int L = input.nextInt();

        System.out.println("Insira R:");
        int R = input.nextInt();

        int areaR = R * R;
        int areaL = L * L;

        if (areaL > areaR){
            System.out.println("O valor maior é o QUADRADO de lado L");
        }
        else if (areaR > areaL){
            System.out.println("O valor maior é o CÍRCULO de raio R");
        }

    }

}
