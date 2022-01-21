public class ReturnValue {
    public static void main(String[] args) {
        System.out.println(rectangleAreaPrinter(5.2, 30.7));
        System.out.println(rectangleAreaPrinter(51.2, 10.7));
        System.out.println(rectangleAreaPrinter(5.2, 50.7));
        System.out.println(rectangleAreaPrinter(1.2, 30.7));
        System.out.println(rectangleAreaPrinter(15.2, 15.7));
        System.out.println(stringPrinter(15.2, 15.7, measureRectangle(15.2, 15.7)));
    }

    public static double measureRectangle(double length, double width) {
        return length * width;
    }

    public static String rectangleAreaPrinter(double length, double width) {
        return ("The area of a rectangle with length " + length + " and width of " + width + " is equal to "
                + measureRectangle(length, width) + "\n");
    }

    /**
     * Function name: stringPrinter. <-----
     * 
     * @param length (double)
     * @param width  (double)
     * @param area   (double)
     * @return area (double)
     *
     *         Inside the function:
     *         1. return the area of rectangle. area = length * width.
     */
    public static String stringPrinter(double length, double width, double area) {

        return ("The area of a rectangle with length " + length + " and width of " + width + " is equal to "
                + area);
    }

}