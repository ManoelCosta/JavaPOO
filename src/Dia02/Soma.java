package Dia02;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int n1, n2, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        n1 = sc.nextInt();
        System.out.println("Insira outro numero: ");
        n2 = sc.nextInt();
        s = n1+n2;
        System.out.println("A soma entre "+n1+" e "+n2+" é igual a "+s);
    }
}
