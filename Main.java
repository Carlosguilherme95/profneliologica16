import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        int x = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < x; i++){
         int contadoroficial = (i + 1);
         if(contadoroficial % 2 != 0){
             System.out.println(contadoroficial);
         }
        }
    }
}

/**
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
 * X, se for o caso.
 * Exemplo:
 * Entrada: Saída:
 * 8 1
 * 3
 * 5
 * 7
 */