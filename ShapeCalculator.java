package Com.entities;
import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            // Step 1: Select Shape
            System.out.println("Select a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Square");
            System.out.println("4. Triangle");
            int shapeChoice = sc.nextInt();

            // Step 2: Select Calculation
            System.out.println("What would you like to calculate?");
            System.out.println("A. Area");
            System.out.println("B. Perimeter");
            char calcChoice = sc.next().toUpperCase().charAt(0);

            switch (shapeChoice) {
                case 1: // Rectangle
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width: ");
                    double width = sc.nextDouble();
                    if (calcChoice == 'A') {
                        System.out.println("Area of Rectangle = " + (length * width));
                    } else {
                        System.out.println("Perimeter of Rectangle = " + (2 * (length + width)));
                    }
                    break;

                case 2: // Circle
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    if (calcChoice == 'A') {
                        System.out.println("Area of Circle = " + (Math.PI * radius * radius));
                    } else {
                        System.out.println("Perimeter (Circumference) of Circle = " + (2 * Math.PI * radius));
                    }
                    break;

                case 3: // Square
                    System.out.print("Enter side length: ");
                    double side = sc.nextDouble();
                    if (calcChoice == 'A') {
                        System.out.println("Area of Square = " + (side * side));
                    } else {
                        System.out.println("Perimeter of Square = " + (4 * side));
                    }
                    break;

                case 4: // Triangle
                    if (calcChoice == 'A') {
                        System.out.print("Enter base: ");
                        double base = sc.nextDouble();
                        System.out.print("Enter height: ");
                        double height = sc.nextDouble();
                        System.out.println("Area of Triangle = " + (0.5 * base * height));
                    } else {
                        System.out.print("Enter side 1: ");
                        double s1 = sc.nextDouble();
                        System.out.print("Enter side 2: ");
                        double s2 = sc.nextDouble();
                        System.out.print("Enter side 3: ");
                        double s3 = sc.nextDouble();
                        System.out.println("Perimeter of Triangle = " + (s1 + s2 + s3));
                    }
                    break;

                default:
                    System.out.println("Invalid shape choice!");
            }

            // Step 3: Continue?
            System.out.print("Would you like to continue? (Yes/No): ");
            String cont = sc.next();
            if (cont.equalsIgnoreCase("No")) {
                continueProgram = false;
                System.out.println("Thank you!");
            }
        }
        sc.close();
    }
}
