import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int x1, x2, x3, y1, y2, y3;
        double per;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите координаты первой точки: ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        System.out.println("Введите координаты второй точки: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        System.out.println("Введите координаты третий точки: ");
        x3 = in.nextInt();
        y3 = in.nextInt();

        per = len(x1, y1, x2 ,y2) + len(x1, y1, x3, y3) + len(x2, y2, x3, y3);

        System.out.println("Длина первой стороны равна: " + len(x1, y1, x2 ,y2));
        System.out.println("Длина второй стороны равна: " + len(x1, y1, x3, y3));
        System.out.println("Длина третьей стороны равна: " + len(x2, y2, x3, y3));
        System.out.println("Периметр треугольника равна: " + per);
    }

    public static double len(int x, int y, int xk, int yk) {
        return(Math.sqrt(Math.pow( x - xk, 2) + Math.pow( y - yk, 2)));
    }
}
