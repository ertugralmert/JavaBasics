package javabasics.J01_operatorler;

import java.util.Scanner;

public class P05_Ornekler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int not1, not2, ort;
        System.out.println("""
                *********Aritmatik Operatorler***********
                """);
        System.out.print("1. notu giriniz: ");
        not1 = scanner.nextInt();
        System.out.print("2.notu giriniz: ");
        not2 = scanner.nextInt();
        ort =(not1+not2)/2;
        System.out.println("ortalma: "+ ort);
    }
}
