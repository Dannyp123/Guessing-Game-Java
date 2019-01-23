import java.util.Random;
import java.util.Scanner;

public class Game {

    int randNum = makingRandomNumber();

    public int makingRandomNumber() {
        Random randint = new Random();
        int num = randint.nextInt(10) + 1;
        return num;
    }
    public void guessingTheNum() {
        Scanner reader = new Scanner(System.in);
        boolean n = true;
        while (n == true) {
            System.out.println("Pick a number from 1 to 10 >> ");
            int num = reader.nextInt();

            if(num == randNum) {
                System.out.println("You guessed right my friend!");
                System.exit(0);
            }
            else {
                System.out.println("Nope...guess more!");
            }
        }

    }

}
