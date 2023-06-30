import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter mark 2: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter mark 3: ");
        int mark3 = scanner.nextInt();

        System.out.print("Enter mark 4: ");
        int mark4 = scanner.nextInt();

        int total = mark1 + mark2 + mark3 + mark4;

        if (total >= 90) {
            System.out.println("A+");
        } else if (total >= 85) {
            System.out.println("A");
        } else if (total >= 80) {
            System.out.println("B+");
        } else if (total >= 75) {
            System.out.println("B");
        } else if (total >= 70) {
            System.out.println("C+");
        } else if (total >= 65) {
            System.out.println("C");
        } else if (total >= 60) {
            System.out.println("D+");
        } else {
            System.out.println("D");
        }
        
        scanner.close();
    }
}
