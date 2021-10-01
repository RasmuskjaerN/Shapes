public class Triangle extends Shapes{

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        //first point
        this.x1 =x1;
        this.y1 =y1;
        //second point
        this.x2 =x2;
        this.y2 =y2;
        //third point
        this.x3 =x2;
        this.y3 =y1;

    }


    @Override
    public double side1() {
        double xSide = Math.pow(((x2)-(x1)),2);
        double ySide = Math.pow(((y2)-(y1)),2);
        return Math.sqrt((xSide+ySide));
    }

    @Override
    public double side2() {
        double xSide2 = Math.pow(((x3)-(x2)),2);
        double ySide2 = Math.pow(((y3)-(y2)),2);

        return Math.sqrt((xSide2+ySide2));
    }

    @Override
    public double side3() {
        double xSide3 = Math.pow(((x1)-(x3)),2);
        double ySide3 = Math.pow(((y1)-(y3)),2);
        return Math.sqrt((xSide3+ySide3));
    }

    @Override
    public double area() {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1)+x3*(y1-y2))/2.0);
    }

    @Override
    public double circumference() {
        return side1()+side2()+side3();
    }

    @Override
    public boolean isInside() {

        double d = ((y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3));
        double a = ((y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3)) / d;
        double b = ((y3 - y1)*(x1 - x3) + (x1 - x3)*(y1 - y3)) / d;
        double c = 1 - a - b;

        return 0 <= a && a <= 1 && 0 <= b && b <= 1 && 0 <= c && c <= 1;

    }

    @Override
    public double centerX() {
        return (x3 + x2 + x1)/3;
    }

    @Override
    public double centerY() {
        return (y3+y2+y1)/3;
    }

    @Override
    public double rad() {
        return 0;
    }

    @Override
    public double calculateRadius() {
        return 0;
    }


}
