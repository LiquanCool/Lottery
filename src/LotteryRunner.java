import java.util.Scanner;

public class LotteryRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in;
        String num;
        System.out.print("Enter your lottery pick: ");
        in = s.nextInt();
        if (in == 0 || in == 1 || in == 2 || in == 3 || in == 4 || in == 5 || in == 6 || in == 7 || in == 8 || in == 9)
        {
            num = "0" + in;
            System.out.println("→" + num);
        }
        else
        {
            num = String.valueOf(in);
        }
        Lottery game1 = new Lottery();
        System.out.println(game1.toString());
        System.out.println(game1.getWinMessage(game1.determineWinnings(num)));
    }
}
