package calculator.shapes;

public class Circle extends Shape {

    public Circle(){
    }

    public Circle(int[] user_input){
        dimensions.put("radius", user_input[0]);
    }

    public double calculate_area(){
        return Math.PI * Math.pow(dimensions.get("radius"), 2);
    }

}
