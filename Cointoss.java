import java.util.Random;
import java.util.Scanner;

public class Cointoss {
    private static final int gamelimit = 3;
    private int headNum;
    private int tailNum;

    public Cointoss() {
        headNum = 0;
        tailNum = 0;

        System.out.println("Who are you?");
        Scanner sc = new Scanner(System.in);
        System.out.print("> ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        sc.close();

        Random random = new Random();

        int status;

        System.out.println("Tossing a coin...");

        for (int i = 1; i <= gamelimit; i++) {
            System.out.print("Round " + i + ": ");

            status = random.nextInt(2);

            switch (status) {
                case 0:
                    headNum++;
                    System.out.println("Heads");
                    break;
                case 1:
                    tailNum++;
                    System.out.println("Tails");
                    break;
            }
        }
        System.out.println("Heads: " + headNum + ", Tails: " + tailNum);

        if (headNum > tailNum) {
            System.out.println(name + " won");
        } else {
            System.out.println(name + " lost");
        }
    }

    public static void main(String[] args) {
        new Cointoss();
    }
}