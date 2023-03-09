package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float a, b;

        System.out.println("Digite o primeiro valor:");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor:");
        b = scan.nextInt();

        float soma = soma(a, b);
        float subtrair = subtrair(a, b);
        float multiplicar = dividir(a, b);
        float dividir = dividir(a, b);

        System.out.println("somar: " + soma);
        System.out.println("subt: " + subtrair);
        System.out.println("mult: " + multiplicar);
        System.out.println("div: " + dividir);


    }

    public static float soma(float a, float b) {
        return a + b;
    }
    public static float subtrair(float a, float b) {
        return a - b;
    }
    public static float multiplicar(float a, float b) {
        return a * b;
    }
    public static float dividir(float a, float b) {
        return a / b;
    }
}
