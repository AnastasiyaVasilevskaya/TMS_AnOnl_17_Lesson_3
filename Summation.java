import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
        System.out.print("Введите целое положительное число: ");
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num >= 1) {
                    int sum = 0;
                    for (int i = 1; i <= num; i++){
                        sum += i;
                    }
                    System.out.println("Сумма от 1 до " + num + ": " +sum);
                    break;
                } else System.out.println("Введено число, которое не является положительным. Попробуйте ещё раз. Введите целое положительное число.");
            } else{
                System.out.println("Это не целое число. Попробуйте ещё раз. Введите целое положительное число.");
                scan.next(); //очистить буфер, чтобы избежать зацикливания
            }
        } while (true);
    }
}




