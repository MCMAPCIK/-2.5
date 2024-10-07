import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int week = 7;
        int day = 234;
        int Polnweek = day / week;
        System.out.println(Polnweek + " Полных недели");
    }
}