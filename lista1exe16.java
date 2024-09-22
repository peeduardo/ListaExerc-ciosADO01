import java.util.Scanner;
public class lista1exe16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a hora inicial. Entre 0h a 23h: ");
        int horaInicial = input.nextInt();

        System.out.print("Insira a hora final. Entre 0h a 23h: ");
        int horaFinal = input.nextInt();

        int duracao;

        if (horaInicial < 0 & horaInicial > 23 & horaFinal < 0 & horaFinal > 23) {
            System.out.println("Horário inválido. As horas devem estar entre 0 e 23.");
        } else {
            if (horaFinal > horaInicial) {
                duracao = horaFinal - horaInicial;
            } else {
                duracao = (24 - horaInicial) + horaFinal; 
            }
            if (duracao < 1 & duracao > 24) {
                System.out.println("A duração do jogo deve ser entre 1 e 24 horas.");
            } else {
                System.out.println("A duração do jogo é: " + duracao + " horas.");
            }

        }
        
    }
}