import java.util.Scanner;

public class Task_08 {
    public static void main(String[] args) {
        System.out.println("Задание 8");
        double t, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите временной промежуток между вспышкой молнии и громом (секунд): ");
        t = sc.nextDouble();
        s = t * V;
        System.out.println("Расстояние до места удара молнии: " + s + "метров");
    }
}
