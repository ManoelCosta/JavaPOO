package Dia03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int  nota;
        Scanner sc = new Scanner(System.in);
        while (a < 10){
            nota = sc.nextInt();
            System.out.print("Aluno " + (a + 1)+" ");
            while (b < nota) {
                System.out.print("*");
                b++;
            }
            b = 0;
            a++;
        }
    }
}

