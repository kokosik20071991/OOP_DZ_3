import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CollectionFigures {
    public  ArrayList<Figure> allFigure = new ArrayList<>();
    {
        allFigure.add(new Square(8));
        allFigure.add(new Rectangle(2, 6));
        allFigure.add(new Triangle(5, 6, 7));
        allFigure.add(new Circle(8));
    }

    public int getSize(){
        return allFigure.size();
    }

    public void showAll(){
        int counter = 1;
        for(Figure figure: allFigure){
            System.out.printf("%d. %s: , %s ", counter, figure.getClass().getSimpleName(), figure.toString());
            if (figure instanceof Perimetr){
                System.out.printf("perimetr: %.1f, ", ((Perimetr)figure).findPerimetr());
            }
            if (figure instanceof LengthCircle){
                System.out.printf("length: %.1f, ", ((LengthCircle)figure).findLength());
            }
            System.out.printf("area: %.1f \n", figure.findArea()); 
            System.out.println("-----------------------------------------------------");
            counter++;
        }
    }

    public Figure addSquare(Scanner sc){
        System.out.println("Enter side of square: ");
        double side = sc.nextDouble();
        return new Square(side);
    }
    public Figure addCircle(Scanner sc){
        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        return (new Circle(radius));
    }
    public Figure addRectangle(Scanner sc){
        System.out.println("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter weigth of rectangle: ");
        double weigth = sc.nextDouble();
        return (new Rectangle(length, weigth));
    }
    public Figure addTriangle(Scanner sc){
        System.out.println("Enter first side of triangle: ");
        double sideA = sc.nextDouble();
        System.out.println("Enter second side of triangle: ");
        double sideB = sc.nextDouble();
        System.out.println("Enter third side of triangle: ");
        double sideC = sc.nextDouble();
        return (new Triangle(sideA, sideB, sideC));
    }
    public void addFigure(Scanner sc){
        System.out.println("1. Add Square");
        System.out.println("2. Add Rectangle");
        System.out.println("3. Add Triangle");
        System.out.println("4. Add Circle");
        System.out.println("Chose number");
        int num = sc.nextInt();
        switch(num){
            case 1:
                this.allFigure.add(addSquare(sc));
                break;
            case 2:
                this.allFigure.add(addRectangle(sc));
                break;
            case 3:
                this.allFigure.add(addTriangle(sc));
                break;
            case 4:
                this.allFigure.add(addCircle(sc));
                break;
        }
    }
    public void removeFigure(int num){
        if(num < allFigure.size()) this.allFigure.remove(num);
    }

    public void changeFigure(int num, Scanner sc){
        if (num < this.allFigure.size()) {
            System.out.println("1. Add Square");
            System.out.println("2. Add Rectangle");
            System.out.println("3. Add Triangle");
            System.out.println("4. Add Circle");
            System.out.println("Chose number of figure for changing");
            int numberFigure = sc.nextInt();
            Figure newFigure = new Circle(1);
            switch(numberFigure){
                case 1:
                newFigure = addSquare(sc);
                break;
                case 2: 
                newFigure = addRectangle(sc);
                break;
                case 3: 
                newFigure = addTriangle(sc);
                break;
                case 4: 
                newFigure = addCircle(sc);
                break;
            }
            this.allFigure.set(num, newFigure);
        }
    }
    public void sortOfArea(){
        Comparator<Figure> byArea = Comparator.comparing(Figure::findArea);
        this.allFigure.sort(byArea);
    }

}