package me.ujjawal.learning_java.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * {@link java.io.Closeable} resources can be auto-closed when the control exits the try block by using the
 * try-with-resources format.
 */
public class TryWithResources {

    public static void main(String[] args) {
//        firstMethod();
        secondMethod();
    }

    private static void firstMethod() {
        Scanner scanner = new Scanner(System.in);
        keepReading(scanner);
//        scanner.close();
        String last = scanner.next();
        System.out.println("last --> " + last);
    }

    private static void secondMethod() {
        Scanner theScanner = new Scanner(System.in);
        try (Scanner scanner = theScanner) {
            keepReading(scanner);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        String last = theScanner.next();
        System.out.println("last --> " + last);
    }

    private static void keepReading(Scanner scanner) {
        while (true) {
            System.out.print("Enter an integer (0 to stop) --> ");
            int received = scanner.nextInt();
            System.out.println("received --> " + received);
            if (0 == received) {
                System.out.println("Stopping");
                break;
            }
        }
    }
}
