public class Rectangle extends Shapes{

    public Rectangle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }


    @Override
    public double side1() {
        return (x2-x1);
    }

    @Override
    public double side2() {
        return (y2-y1);
    }

    @Override
    public double side3() {
        return 0;
    }

    @Override
    public double area() {
        return (side1())*(side2());
    }

    @Override
    public double circumference() {
        return 2*(side1()+side2());
    }

    @Override
    public boolean isInside() {
        return false;
    }

    @Override
    public double centerX() {
        double centerRectX=(side1()/2);
        return centerRectX;
    }

    @Override
    public double centerY() {
        double centerRectY=(side2()/2);
        return centerRectY;
    }


}
