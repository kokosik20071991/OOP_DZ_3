public class Triangle extends Polygon{
    public Triangle(double sideA, double sideB, double sideC){
        super(new double[] {sideA, sideB, sideC});
        double a = this.getSides()[0];
        double b = this.getSides()[1];
        double c = this.getSides()[2];
        if(a+b <= c || b + c <= a || a + c <= b) throw new IllegalArgumentException("There is no such triangle");
    }

    public double findArea(){
        double p = findPerimetr()/2;
             
        return Math.sqrt(p*(p - this.getSides()[0])*(p - this.getSides()[1])*(p - this.getSides()[2]));
    }
    @Override
    public String toString() {
        return String.format("a = %s, b =  %s, c = %s ", this.getSides()[0], this.getSides()[1], this.getSides()[1]);
    }
}