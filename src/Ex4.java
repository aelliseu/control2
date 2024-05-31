import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int a;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        a = in.nextInt();

        System.out.println("Факториал числа " + a + ": " + fac(a));
    }
    private static int fac(int k) {
        if(k <= 1){
            return 1;
        }else {
            return k * fac(k - 1);
        }
    }
}
