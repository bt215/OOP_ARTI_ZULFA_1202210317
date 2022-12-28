package MODUL3_ZULFA;

import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
    public static void main(String[] args){
        System.out.println("===Menu program===");
        System.out.println("1.Square");
        System.out.println("2.Circle");
        System.out.println("3.Trapezoid");
        do {
            System.out.println("Select Menu:");
            Scanner input = new Scanner(System.in);
            double number = input.nextDouble();
            try {
                switch (number) {
                    case 1.0:
                    System.out.println("1.Square");
                    break;
                    case 2.0:
                    System.out.println("2.Circle");
                    break;
                    case 3.0:
                    System.out.println("3.Trapezoid");
                    break;
                    case 0.0:
                    System.out.println("3.Trapezoid");
                    break;
                    default:
                    System.out.println("3.Trapezoid");
                    continue;
                }
            }
        }
    }
}
