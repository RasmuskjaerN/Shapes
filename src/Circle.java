public class Circle extends Shapes{

    final double pi = Math.PI;


    public Circle(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }
    public void CircleRef(double refX, double refY) {
        this.refX = refX;
        this.refY = refY;
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
        return pi*Math.pow(rad(),2);
    }

    @Override
    public double circumference() {
        return 2*pi*rad();
    }

    @Override
    public boolean isInside() {
        //https://www.geeksforgeeks.org/find-if-a-point-lies-inside-or-on-circle
        if ((x1 - refX) * (x1 - refX) + (y1 - refY) * (y1 - refX) <= Math.pow(rad(),2)) {
            System.out.println("Reference point is inside the circle");
            return true;

        } else {
            System.out.println("Reference point is outside the circle");
            return false;
        }
    }

    @Override
    public double centerX() {
        return x1;
    }

    @Override
    public double centerY() {
        return y1;
    }

    @Override
    public double rad() {
        return calculateRadius();
    }

    @Override
    public double calculateRadius() {
        return Math.sqrt(Math.pow(side1(),2)+Math.pow(side2(),2));
    }


}


