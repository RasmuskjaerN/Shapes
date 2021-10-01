public class Triangle extends Shapes{

    public Triangle(String name, int width, int height) {
        super(name, width, height);
    }

    public int calculateArea(){
        return width*height/2;
    }

}
