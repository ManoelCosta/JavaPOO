package Dia02;

public class Calculos {
    public static void main(String[] args) {
        String valor1 = "5", valor2 = "9";
        int a = Integer.parseInt(valor1), b = Integer.parseInt(valor2);
        System.out.println("Os valores são "+valor1+" e "+valor2);
        System.out.println("Somados são: "+(a+b));
        System.out.println("Subtraídos são: "+(b-a));
        System.out.println("Multiplicados são: "+(a*b));
        double d = Float.parseFloat(valor1)/Float.parseFloat(valor2);
        System.out.println("Divididos são: "+d);



    }
}
