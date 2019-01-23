import java.util.Random;
import java.util.Scanner;

public class Game {

    int randNum = makingRandomNumber();

    public int makingRandomNumber() {
        Random randint = new Random();
        int num = randint.nextInt(100) + 1;
        return num;
    }
    public void guessingTheNum() {
        Scanner reader = new Scanner(System.in);
        boolean n = true;

        System.out.print("Pick a number from 1 to 100 ");
        while (n == true) {
            int num = reader.nextInt();

            if(num == randNum) {
                System.out.println("You guessed right my friend!");
                System.exit(0);
            }
            else if(num < randNum) {
                System.out.println("Your are to low..Guess Higher!");
            }
            else if (num > randNum) {
                System.out.println("You are to high..Guess Lower!");
            }
        }

    }

}
