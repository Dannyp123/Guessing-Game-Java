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
        System.out.println("Pick a number from 1 to 10 >> ");
        int num = reader.nextInt();

        if(num == randNum) {
            System.out.println("Great!");
        }
        else {
            System.out.println("Keep going!");
        }
    }

}
