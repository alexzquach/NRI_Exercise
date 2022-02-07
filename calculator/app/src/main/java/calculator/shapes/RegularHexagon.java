package calculator.shapes;

public class RegularHexagon extends Shape {

    public RegularHexagon(){
    }

    public RegularHexagon(int[] user_input){
        dimensions.put("side-length", user_input[0]);
    }

    public double calculate_area(){
        return Math.round((3 * Math.sqrt(3) / 2) * Math.pow(dimensions.get("side-length"), 2));
    }

}
