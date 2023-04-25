public abstract class Polygon extends Figure implements Perimetr{
    private double[] sides;

    protected Polygon(double[] sides){
        this.sides = sides;
        for(double side: this.sides){
            if (side <= 0) throw new IllegalArgumentException("Side can not be negative");
        }
        
    }

    public double findPerimetr(){
        double perimetr = 0;
        for(double side: this.sides){
            perimetr+=side;
        }
        return perimetr;
    }
    public double[] getSides(){
        return this.sides;
    }
    
}