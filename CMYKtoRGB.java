public class CMYKtoRGB {
    public static void main(String[] args) {
        // take 4 user inputs
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);
        // carry out the formula to convert CMYK to RGB
            double white = 1 - k;
            double red = Math.round((255 * white * (1 - c)));
            double green = Math.round((255 * white * (1 - m)));
            double blue = Math.round((255 * white * (1 - y)));
        // print the values of RGB
            System.out.println("red = " + (int) red);
            System.out.println("green = " + (int) green);
            System.out.println("blue = " + (int) blue);
        
    }
    
}