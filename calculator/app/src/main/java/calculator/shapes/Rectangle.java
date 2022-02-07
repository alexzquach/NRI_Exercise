package calculator.shapes;

public class Rectangle extends Shape {


    public Rectangle(){
    }

    public Rectangle(int[] user_input){
        dimensions.put("length", user_input[0]);
        dimensions.put("width", user_input[1]);
    }

    public double calculate_area(){
        return dimensions.get("length") * dimensions.get("width");
    }

}
