public class Circle extends Figure implements LengthCircle{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
        if (this.radius <= 0) throw new IllegalArgumentException("Radiuse can not be negative!");
    }

    @Override
    public double findArea() {
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double findLength(){
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return String.format("radius: %s", this.radius);
    }

    
}