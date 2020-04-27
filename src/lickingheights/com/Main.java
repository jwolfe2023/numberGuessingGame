package lickingheights.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            gameLoop();

            System.out.println("Thank You For Playing!");

        }

    public static void gameLoop() {

        Scanner keyboard = new Scanner(System.in);

        int i = 0;
        int a = 0;

        System.out.println("Welcome to the number guessing game!");
        System.out.println("The rules are simple!");
        System.out.println("I pick a number between 1-100 then you try to guess it!");
        System.out.println("Try to guess the number in the least amount of tries! :D");
        System.out.println("--------------------------------------------------------");
        System.out.println("Lets Start!");

        String input;
        do {
            logicLoop();

                a++;

            System.out.println("Do you want to play again? (\"Yes\") or (\"No\") ");

            input = keyboard.nextLine();

            if (input.equalsIgnoreCase("Yes")) {

                i++;

            } else if (input.equalsIgnoreCase("No")) {

                a++;

            }

            else {

                System.out.println("You did not follow directions!");
                System.out.println(" ");

            }

        } while (i == a);

    }

    public static void logicLoop() {

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        int randomNumber = ((int) (Math.random() * 100));

        int inputNumber;

        int count = 0;

        do {

            System.out.println(" ");
            System.out.println("Enter a number between 1 to 100!");


            inputNumber = keyboard.nextInt();
            count++;

            if (inputNumber > randomNumber) {
                System.out.println("Your Number is too High!");

            } else if (inputNumber < randomNumber) {
                System.out.println("Your Number is too Low");
            }

        } while (inputNumber != randomNumber);

        {

            System.out.println("Congrats you found the number in only " + count + " Tries!");

        }

    }

}