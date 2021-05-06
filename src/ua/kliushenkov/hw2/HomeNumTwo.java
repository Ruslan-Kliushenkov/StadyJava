import java.util.Scanner;


public class HomeNumTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите координату x точки №1 ");
        int xCoordinateOne = input.nextInt();
        System.out.println("Введите координату y точки  №1 ");
        int yCoordinateone = input.nextInt();

        System.out.println("Введите координату x точки №2 ");
        int xCoordinateTwo = input.nextInt();
        System.out.println("Введите координату y точки №2 ");
        int yCoordiunateTwo = input.nextInt();

        System.out.println("Введите координату x точки №3 ");
        int xCoordinateThree = input.nextInt();
        System.out.println("Введите координату y точки №3 ");
        int yCoordinateThree = input.nextInt();

        double result = square(xCoordinateOne,yCoordinateone,xCoordinateTwo,yCoordiunateTwo,xCoordinateThree,yCoordinateThree);
        System.out.println("Площадь треугольника равна " + Math.abs(result));

        System.out.println("Введите число для проверки чётности");
        int number = input.nextInt();
        System.out.println(evenNumber(number)? "Ohh ye" : "nope man...");

        System.out.println("Введите число для сравнения №1");
        int feverOne = Math.abs(input.nextInt());
        System.out.println("Введите число для сравнения №2");
        int feverTwo = Math.abs(input.nextInt());
        System.out.println("Введите число для сравнения №3");
        int feverThree = Math.abs(input.nextInt());
        System.out.println("Наименьшее по модулю число = " + feverNumber(feverOne , feverTwo, feverThree ));

    }

    public static double square (double xCorOne, double yCorOne, double xCorTwo, double yCorTwo, double xCorThree, double yCorThree){
        double square =(((xCorOne - xCorThree)*(yCorTwo-yCorThree)) - ((yCorOne - yCorThree) * (xCorTwo - xCorThree))) / 2;
        return square;



    }

    public static boolean evenNumber(int num){
        boolean even = num % 2 == 0;
        return even;

    }

    public static int feverNumber(int one, int two, int three){
        int bigger = one < two ? one : two;
        return bigger < three? bigger : three;
    }
}
