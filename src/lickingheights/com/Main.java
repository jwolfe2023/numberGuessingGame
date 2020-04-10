package lickingheights.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        do {
            gameloop();

            logicloop();
        } while(true) {
            System.out.println("Do you want to play again? (\"Yes\")  or (\"No\")");
            String answer = keyboard.nextLine();
        }
    }

    public static void gameloop() {


    }

    public static void logicloop() {

        Scanner keyboard;

        keyboard = new Scanner(System.in);

        int randomNumber = ((int) (Math.random() * 100));

        int inputNumber;

        do {
            System.out.println("Enter a number between 1 to 100!");


            inputNumber = keyboard.nextInt();

            if (inputNumber > randomNumber) {
                System.out.println("Your Number is too High!");

            } else if (inputNumber < randomNumber) {
                System.out.println("Your Number is too Low");
            }
        } while (inputNumber != randomNumber);
        {

            System.out.println("Congrats you found the number!");

        }

    }

}