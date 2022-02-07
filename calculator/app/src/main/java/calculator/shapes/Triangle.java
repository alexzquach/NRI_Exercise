package calculator.shapes;

public class Triangle extends Shape {


    public Triangle(){
    }

    public Triangle(int[] user_input){
        dimensions.put("base", user_input[0]);
        dimensions.put("height", user_input[1]);
    }

    public double calculate_area(){
        return (dimensions.get("base") * dimensions.get("height")) / 2;
    }

}
