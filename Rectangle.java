public class Rectangle extends Polygon{
    public Rectangle(double length, double weigth){
        super(new double[] {length, weigth, length, weigth});
    }

    public double findArea(){
        return this.getSides()[0]*this.getSides()[1];
    }
    @Override
    public String toString() {
        return String.format("length: %s, weight: %s", this.getSides()[0], this.getSides()[1]);
    }
}