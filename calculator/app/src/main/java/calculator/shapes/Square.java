package calculator.shapes;

public class Square extends Rectangle{

    public Square(){
    }

    public Square(int[] user_input){
        dimensions.put("side-length", user_input[0]);
    }

    public double calculate_area(){
        return Math.pow(dimensions.get("side-length"), 2);
    }
}
