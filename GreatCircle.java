
public class GreatCircle {
    public static void main(String[] args) {
        // take 4 user inputs x1, y1, x2, and y2
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        // Conversion of degrees to radians. C stands for converted
        double cx1 = Math.toRadians(x1);
        double cy1 = Math.toRadians(y1);
        double cx2 = Math.toRadians(x2);
        double cy2 = Math.toRadians(y2);
        // Calculation of distance, r = 6371 (given) according to question
        double r = 6371.0;
        double distance = (2 * r * Math.asin(Math.sqrt(Math.pow(Math.sin((cx2-cx1) / (2)), 2) + ((Math.cos(cx1) * Math.cos(cx2) * (Math.pow(Math.sin((cy2-cy1)/(2)), 2)))))));
        System.out.println(distance + " kilometers ");
    }
    
}