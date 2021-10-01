public class Main {

    private static void displayArea(Shapes shape){
        System.out.println("Display the area of shape named "+shape.getName() + " Width=" + shape.getWidth() + " Height=" + shape.getHeight()
                + " The area is " + shape.calculateArea());
    }
    public static void main(String[] args) {
	// write your code here
        Shapes[] allShapes = new Shapes[2];
        allShapes[0] = new Rectangle("rect", 10,20);
        allShapes[1] = new Triangle("Tri",10,20);

        for (int i = 0; i<allShapes.length; i++) {
            displayArea(allShapes[i]);
        }

    }


}
