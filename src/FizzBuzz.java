/*
Criar uma função que faça um número como argumento e retorne "Fizz", "Buzz" ou "FizzBuzz".

Entrada: Receber um número.
Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ;
Se o número for apenas múltiplo de 3 -> "Fizz" ;
Se o número for apenas múltiplo de 5 -> "Buzz";
Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido;

Saída: Retorne a palavra correta conforme o seu múltiplo.
Caso o valor não seja múltiplo de 3 ou 5, exiba o número
 */


import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        int num = number.nextInt();

        if (num % 3 == 0 || num % 5 == 0 ) {
            if (num % 3 == 0) System.out.print("Fizz");
            if (num % 5 == 0) System.out.print("Buzz");
        }
        else {
            System.out.println(num);
        }
            System.out.println();
        }

    }