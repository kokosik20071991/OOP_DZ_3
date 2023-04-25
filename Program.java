import java.util.ArrayList;
import java.util.Scanner;
public class Program {
    public static void findAllPerimetr(ArrayList<Figure> figures){
        for(Figure figure: figures){
            if (figure instanceof Perimetr){
                System.out.println(((Perimetr)figure).findPerimetr());
            }
            if (figure instanceof LengthCircle){
                System.out.println(((LengthCircle)figure).findLength());
            }
        } 
    }
    public static void findAllArea(ArrayList<Figure> figures){
        for (Figure figure: figures){
            System.out.println(figure.findArea());
        }
    }
    
    public static void menu(CollectionFigures allFigure, Scanner sc){
        System.out.println("1. Show all");
        System.out.println("2. Add Figure");

        System.out.println("Chose number");
        int number = sc.nextInt();
        switch(number){
            case 1: 
            allFigure.showAll();
            menu(allFigure, sc);
            case 2:
            //allFigure.addCircle(allFigure, sc);;
        }
    }
    public static void main(String[] args) {
        // Задание без коллекции
        ArrayList<Figure> figures = new ArrayList<>();
        Figure square1 = new Square(5);
        Figure rectangle1 = new Rectangle(5, 10);
        
        Figure triangle1 = new Triangle(3, 2, 2);
        Figure circle1 = new Circle(2);

        figures.add(square1);
        figures.add(rectangle1);
        figures.add(triangle1);
        figures.add(circle1);

        //findAllArea(figures);

        // Задание с коллекцией
        CollectionFigures allFigure1 = new CollectionFigures();
        
        allFigure1.showAll(); //Показывет информацию о фигуре

        Scanner sc = new Scanner(System.in);

        allFigure1.addFigure(sc); // Добавление фигуры
        System.out.println("New");
        allFigure1.showAll();

        allFigure1.removeFigure(2); // Удаление фигуры с индексом 2 (можно менять)
        System.out.println("Remove");
        allFigure1.showAll();

        allFigure1.changeFigure(2, sc); 
        System.out.println("Show changes"); // Замена фигуры с индексом
        allFigure1.showAll();

        System.out.println("Sort by area"); // Сортировка по площади
        allFigure1.sortOfArea();
        allFigure1.showAll();


    }
}