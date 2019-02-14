/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

public class UScalculator {

    /*
	 * Methode main hieronder kan je verwijderen nadat het importeren gelukt is.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to add, substract, multiply, divide, square, exponentiation");
        String choice = sc.nextLine();

        switch (choice) {
            case "add":
                {
                    System.out.println("pick your number");
                    int number1 = sc.nextInt();
                    int number2 = sc.nextInt();
                    System.out.println(add(number1, number2));
                    break;
                }
            case "subtract":
                {
                    System.out.println("pick your number");
                    int number1 = sc.nextInt();
                    int number2 = sc.nextInt();
                    System.out.println(subtract(number1, number2));
                    break;
                }
            case "multiply":
                {
                    System.out.println("pick your number");
                    int number1 = sc.nextInt();
                    int number2 = sc.nextInt();
                    System.out.println(multiply(number1, number2));
                    break;
                }
            case "divide":
                {
                    System.out.println("pick your number");
                    int number1 = sc.nextInt();
                    int number2 = sc.nextInt();
                    System.out.println(divide(number1, number2));
                    break;
                }
            case "square":
                {
                    System.out.println("pick your number");
                    int number1 = sc.nextInt();
                    int number2 = sc.nextInt();
                    System.out.println(square(number1));
                    break;
                }
            case "exponentiation":
                {
                    System.out.println("pick your number");
                    int number1 = sc.nextInt();
                    int number2 = sc.nextInt();
                    System.out.println(exponentiation(number1, number2));
                    break;
                }
            default:
                break;
        }
    }


    /*
	 * Werk de onderstaande methodes uit.
	 * 
	 * Gebruik enkel de optelling als expressie.
	 * 
	 * Maak gebruik van de nodige control flow structures om de bewerking te vervolledigen
	 * 
	 * Maak gebruik van gehele getallen.
     */
    public static int add(int number1, int number2) {

        return number1 + number2;
    }

    public static int subtract(int number1, int number2) {

        return number1 - number2;
    }

    public static int multiply(int number1, int number2) {
        int result = 0;

        while (number1 > 0) {
            result += number2;
            number1--;
        }

        return result;
    }

    /*
	 * Zorg ervoor dat number1 deelbaar is door number2
	 * 
	 * Of: wijzig de nodige types zodat je ook andere delingen kan maken.
     */
    public static int divide(int number1, int number2) {
        // HINT: misschien kan je de methode subtract hierbij gebruiken.
        int result = 0;
        while (number1 >= number2) { //zo lang number2 van number1 af kan blijft hij doorgaan
            number1 = subtract(number1, number2);
            result++;

        }

        return result;
    }

    /*
	 * Methode hieronder is voor een tweede machtsverheffing
     */
    public static int square(int number1) {
        // HINT: multiply???

        return multiply(number1, number1);
    }

    /*
	 * Methode hieronder is voor de verheffing van het grondgetal 'number1' tot een willekeurige macht, het exponent 'number2'
     */
    public static int exponentiation(int number1, int number2) {
        // HINT: multiply???
        int result = 0;

        for (int i = 1; i < number2; i++) {
            result = multiply(number1, number1);

        }

        return result;
    }

}
