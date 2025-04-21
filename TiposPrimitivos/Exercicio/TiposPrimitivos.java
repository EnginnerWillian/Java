package Exercicio;

import java.util.Scanner;

public class TiposPrimitivos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        float nota = teclado.nextFloat();
        System.out.printf("A nota de %s é %.1f \n", nome, nota);

    }
}
