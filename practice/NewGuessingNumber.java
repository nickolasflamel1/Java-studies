import java.util.Scanner;

public class NewGuessingNumber {

    public static void linha() {
        System.out.println();
    }

    public static int RandomNum(int x, int y) {
        return (int) (x + Math.random() * (y - x));
    }

    public static void main(String[] args) {

        short loop = 1;
        short numberOfAttempts = 5;
        int randomNum = RandomNum(0, 100);

        Scanner input = new Scanner(System.in);

        System.out.println("Im thinking in a number between 0 and 100. Can you guess the number?");

        while (loop == 1) {

            System.out.println("You have " + numberOfAttempts + " chances");
            linha();
            System.out.print("Enter a number: ");
            int user_input = input.nextInt();

            while (user_input != randomNum) {
                //checking the player attempts
                if (numberOfAttempts == 0) {
                    System.out.println("Your attempts over, you lost :(");
                    System.out.println("The random number was: " + randomNum);
                    break;
                } else {
                    System.out.println("Number of attempts " + numberOfAttempts);
                }
                //checking if the user input is lesser or higher than the random number
                if (user_input < randomNum) {
                    System.out.println("Too Low");
                    if(user_input - randomNum <= 10) {
                        System.out.println("close");
                    } else if(user_input - randomNum > 10 && user_input - randomNum <= 30) {
                        System.out.println("Almost there");
                    }
                } else {
                    System.out.println("Too High");
                    if(user_input - randomNum <= 10) {
                        System.out.println("close");
                    } else if(user_input - randomNum > 10 && user_input - randomNum <= 30) {
                        System.out.println("Almost there");
                    }
                }
                linha();
                //input another trying
                System.out.print("Enter another number: ");
                user_input = input.nextInt();

                //checking if the player won the game
                if (user_input == randomNum) {
                    System.out.println("Congratulations you won the game!!!");
                }
                numberOfAttempts--;
            }

            linha();
            linha();
            System.out.println("Do you wanna play again?");
            System.out.println("[1] to yes or [2] to no");
            loop = input.nextShort();
            if (loop == 1) {
                System.out.println("Do you wanna chose the random number?");
                System.out.println("[1]yes or [2]no?");
                short answer = input.nextShort();

                if (answer == 1) {
                    System.out.println("[1] Easy - Between 250 and 500");
                    System.out.println("[2] Medium - Between 500 and 1000");
                    System.out.println("[3] Easy - Between 100 and 200");
                    System.out.println("[4] Hard - Between 0 and 1000");
                    System.out.println("[5] Expert - Between 99 and 1000000");
                    int options = input.nextInt();

                    switch (options) {
                        case 1 -> {
                            randomNum = RandomNum(250, 500);
                            numberOfAttempts = 10;
                            System.out.println("Now is between 250 and 500");
                        }
                        case 2 -> {
                            randomNum = RandomNum(500, 1000);
                            numberOfAttempts = 12;
                            System.out.println("Now is between 500 and 1000");
                        }
                        case 3 -> {
                            randomNum = RandomNum(100, 200);
                            numberOfAttempts = 5;
                            System.out.println("Now is between 100 and 200");
                        }
                        case 4 -> {
                            randomNum = RandomNum(0, 1000);
                            numberOfAttempts = 15;
                            System.out.println("Now is between 0 and 1000");
                        }
                        case 5 -> {
                            randomNum = RandomNum(99, 100000);
                            numberOfAttempts = 20;
                            System.out.println("Now is between 99 and 1000000");
                        }
                    }
                    System.out.println("---------------------------------");
                } else {
                    randomNum = (int) (Math.random() * 100);
                    numberOfAttempts = 5;
                    System.out.println("Still Between 0 and 100. Good luck again!");
                }
                linha();
            } else {
                linha();
                System.out.println("Thanks for playing!!");
            }
        }
        input.close();
    }
}

	

