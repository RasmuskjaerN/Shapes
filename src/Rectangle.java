public class Rectangle extends Shapes{


    public Rectangle(String name, int width, int height) {
        super(name, width, height);
    }

    public int calculateArea(){
        return width*height;
    }


}
