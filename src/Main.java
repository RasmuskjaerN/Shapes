public class Main {
    public static void main(String[] args) {
	// write your code here

        Rectangle rect = new Rectangle(1,1,3,3);
        System.out.println("Rectangle Area is " + rect.area());
        System.out.println("Rectangle Circumfrence is "+rect.circumference());
        System.out.println("Rectangle Center is "+rect.centerX() + ", "+ rect.centerY());
        rect.RectangleRef(5,5);
        rect.isInside();
        }
        //branch test

}



