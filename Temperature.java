import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.print("Введите температуру на улице - ");
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        if(t <= -20){
            System.out.println("Дубак");
        } else if (t > -20 && t <= -5) {
            System.out.println("Нормально");
        } else if (t > -5) {
            System.out.println("Тепло");
        }
    }
}
