package calculator;

import java.util.*;
import java.util.Scanner;


import calculator.shapes.*;


public class App {
    public static void main(String[] args) throws Exception {
        // Our Supported Shapes
        List<String> supported_shapes = new ArrayList<String>();
        supported_shapes.add("CIRCLE");
        supported_shapes.add("RECTANGLE");
        supported_shapes.add("SQUARE");
        supported_shapes.add("TRIANGLE");
        supported_shapes.add("HEXAGON");

        boolean valid_shape;
        boolean another_shape = true;
        Scanner user_input = new Scanner(System.in);

        while(another_shape){
            valid_shape = false;

            // 1) Prompt the user for the shape they'd like the area for
            System.out.println("Welcome to our Area Calculator Application!  Please enter the type of shape you want to calculate the area of: ");
            String user_shape = user_input.nextLine();

            while (!valid_shape){
                user_shape = user_shape.toUpperCase().trim();
                // Check if the user entered shape is supported
                if (supported_shapes.contains(user_shape)){
                    valid_shape = true;
                }else{
                    System.out.println("This shape is not yet supported!  Please enter the type of shape you want to calculate the area of: ");
                    user_shape = user_input.nextLine();
                }
            }

            int[] dimensions;
            // 2) Prompt the user for the dimensions depending on the shape they have entered
            Shape our_shape;

            // CHECK WHAT SHAPE WE HAVE
            if (user_shape.equals("CIRCLE")){
                // Prompt for dimensions
                System.out.println("Please enter a radius: ");
                int radius = Integer.parseInt(user_input.nextLine());
                dimensions = new int[1];
                dimensions[0] = radius;

                // Build our shape
                our_shape = new Circle(dimensions);
                System.out.println("The area of this shape is: " + our_shape.calculate_area());
                our_shape.dimensions();
            }else if (user_shape.equals("SQUARE")){
                // Prompt for dimensions
                System.out.println("Please enter a side length: ");
                int side_length = Integer.parseInt(user_input.nextLine());
                dimensions = new int[1];
                dimensions[0] = side_length;

                // Build our shape
                our_shape = new Square(dimensions);
                System.out.println("The area of this shape is: " + our_shape.calculate_area());
                our_shape.dimensions();
            }else if (user_shape.equals("TRIANGLE")){
                // Prompt for dimensions
                System.out.println("Please enter a base length: ");
                int base = Integer.parseInt(user_input.nextLine());
                System.out.println("Please enter a height: ");
                int height = Integer.parseInt(user_input.nextLine());

                dimensions = new int[2];
                dimensions[0] = base;
                dimensions[1] = height;

                // Build our shape
                our_shape = new Triangle(dimensions);
                System.out.println("The area of this shape is: " + our_shape.calculate_area());
                our_shape.dimensions();
            }else if (user_shape.equals("RECTANGLE")){
                // Prompt for dimensions
                System.out.println("Please enter a length: ");
                int length = Integer.parseInt(user_input.nextLine());
                System.out.println("Please enter a width: ");
                int width = Integer.parseInt(user_input.nextLine());

                dimensions = new int[2];
                dimensions[0] = length;
                dimensions[1] = width;

                // Build our shape
                our_shape = new Rectangle(dimensions);
                System.out.println("The area of this shape is: " + our_shape.calculate_area());
                our_shape.dimensions();
            }else if (user_shape.equals("HEXAGON")){
                // Prompt for dimensions
                System.out.println("Please enter a side length: ");
                int side_length = Integer.parseInt(user_input.nextLine());

                dimensions = new int[1];
                dimensions[0] = side_length;

                // Build our shape
                our_shape = new RegularHexagon(dimensions);
                System.out.println("The area of this shape is: " + our_shape.calculate_area());
                our_shape.dimensions();
            }
            
            // Check if the user wants to entire another shape
            System.out.println("Would you like to enter another shape? Y/N");

            if (user_input.nextLine().toUpperCase().trim().equals("N")){
                System.out.println("Goodbye.");
                another_shape = false;
                // Close our app
                user_input.close();
            }

        }

    }
}
