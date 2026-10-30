import java.util.Scanner;

public class Grader {
    public static String Grader(int score) {
        if(score > 100 || score < 0){
            return "Invalid score";
        }
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        }
        else if (score >= 70) {
            return "C";
        }
        else if(score >= 60) {
            return "D";
        }
        else {
            return "F";
        }
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score: ");
        int scoreScan = scanner.nextInt();
        System.out.println(Grader(scoreScan));
    }
}
