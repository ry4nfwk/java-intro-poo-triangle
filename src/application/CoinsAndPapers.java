package application;

import java.util.Scanner;

public class CoinsAndPapers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int result;
        System.out.println("NOTAS:");
        result = (int)N / 100;
        System.out.println(result + " nota(s) de R$ 100.00");
        N %= 100; //76 ?
        result = (int) N / 50;
        System.out.println(result + " nota(s) de R$ 50.00");
        N %= 50;
        result = (int) N / 20;
        System.out.println(result + " nota(s) de R$ 20.00");
        N %= 20;
        result = (int) N / 10;
        System.out.println(result + " nota(s) de R$ 10.00");
        N %= 10;
        result = (int) N / 5;
        System.out.println(result + " nota(s) de R$ 5.00");
        N %= 5;
        result = (int) N / 2;
        System.out.println(result + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        N %= 2;
        N *= 100;
        result = (int) N / 100;
        System.out.println(result + " moeda(s) de R$ 1.00");
        N %= 100;
        result = (int) N / 50;
        System.out.println(result + " moeda(s) de R$ 0.50");
        N %= 50;
        result = (int) N / 25;
        System.out.println(result + " moeda(s) de R$ 0.25");
        N %= 25;
        result = (int) N / 10;
        System.out.println(result + " moeda(s) de R$ 0.10");
        N %= 10;
        result = (int) N / 5;
        System.out.println(result + " moeda(s) de R$ 0.05");
        N %= 5;
        result = (int) N / 1;
        System.out.println(result + " moeda(s) de R$ 0.01");
        sc.close();
    }
}
