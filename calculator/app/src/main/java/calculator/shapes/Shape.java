package calculator.shapes;

import java.util.HashMap;

public abstract class Shape {

    protected HashMap<String, Integer> dimensions = new HashMap<String, Integer>();

    public void help(){
        System.out.println("This is a shape!  The current supported operations are: calculate_area, dimensions");
    }

    public void dimensions(){
        for (String dimension : dimensions.keySet()) {
            System.out.println("The " + dimension + " is: " + dimensions.get(dimension));
        }
    }

    public abstract double calculate_area();
}

