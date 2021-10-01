public class Main {
    public static void main(String[] args) {
	// write your code here

        Rectangle rect = new Rectangle(1,1,3,3);
        System.out.println("\n Rectangle: ");
        System.out.println("Rectangle Area is " + rect.area());
        System.out.println("Rectangle Circumfrence is "+rect.circumference());
        System.out.println("Rectangle Center is "+rect.centerX() + ", "+ rect.centerY());
        rect.RectangleRef(5,5);
        rect.isInside();

        Circle circ = new Circle(10,10,20,20);
        System.out.println("\n Circle: ");
        System.out.println("Circle Radius is "+circ.rad());
        System.out.println("Circle Area is " + circ.area());
        System.out.println("Circle Circumference is "+circ.circumference());
        System.out.println("Circle Center is "+circ.centerX() + ", "+ circ.centerY());
        circ.CircleRef(10,10);
        circ.isInside();


        }
        //branch test

}



