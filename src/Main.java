public class Main {
    public static void main(String[] args) {
	// write your code here

        Rectangle rect = new Rectangle(1,1,3,3);
        System.out.println("Rectangle Area is " + rect.area());
        System.out.println("Rectangle Circumference is "+rect.circumference());
        System.out.println("Rectangle Center is "+rect.centerX() + ", "+ rect.centerY());
        System.out.println();

        Triangle tria = new Triangle(11,11,22,22,33,33);
        System.out.println(tria.isInside());
        }
        //branch test

}



