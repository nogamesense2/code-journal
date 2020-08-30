public class RightTriangle {
    public static void main(String[] args) {
        // take 3 user inputs for each side of the triangle 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // declare a boolean variable to say its true if a^2 + b^2 = c ^2 and all integers are positive . Else print false
        boolean right = (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) && a > 0 && b > 0 && c > 0)
                      || (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) && a > 0 && b > 0 && c > 0)
                      || (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2) && a > 0 && b > 0 && c > 0);
        System.out.println(right);
    }
    
}