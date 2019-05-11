package Dia03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        a = sc.nextInt();

        if (a%2 == 0){
            System.out.println("Número par");
        }else{
            System.out.println("Numero impar");
        }

    }
}
