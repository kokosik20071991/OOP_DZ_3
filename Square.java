public class Square extends Rectangle{
    
    public Square(double side){
        super(side, side);
    }
    
    @Override
    public String toString() {
        return String.format("side: %s, ", this.getSides()[0]);
    }
    
}