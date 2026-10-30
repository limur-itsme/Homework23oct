import java.util.Scanner;
public class Main {
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
    public static void generatePattern(int size, int type) {

        switch (type) {

            case 1:
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4:
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 5:
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = size - 1; i >= 1; i--) {
                    for (int j = 1; j <= size - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= 2 * i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid pattern type!");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter pattern size: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size must be positive.");
            scanner.close();
            return;
        }

        System.out.println("\nChoose a pattern:");
        System.out.println("1. Right Triangle");
        System.out.println("2. Inverted Right Triangle");
        System.out.println("3. Pyramid");
        System.out.println("4. Inverted Pyramid");
        System.out.println("5. Diamond");

        System.out.print("Enter your choice: ");
        int type = scanner.nextInt();

        generatePattern(size, type);
    }
}


