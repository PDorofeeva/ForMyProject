import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double averageScore = scan.nextDouble();
        int marks = scan.nextInt();
        ForAverageScore result = new ForAverageScore(averageScore, marks);
    }
}