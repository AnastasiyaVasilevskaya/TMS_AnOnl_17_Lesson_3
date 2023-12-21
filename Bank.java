import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму вклада: ");
        float sum = scan.nextFloat();
        System.out.print("Введите количество месяцев: ");
        int month = scan.nextInt();
        for (int i = 1; i <= month; i++){
            sum += sum * 0.07;
        }
        String formattedSum = String.format("%.2f", sum);
        System.out.println("Итоговая сумма: " + formattedSum);
    }
}
