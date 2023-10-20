
public class Calculator {
    public int add(int x, int y){
        return x + y;
    }

    public double divide(int x, int y) {
        if (y == 0) {
            System.err.println("Error: Division by Zero");
            return Double.NaN;
        }
        return (double)x / y;
    }
}