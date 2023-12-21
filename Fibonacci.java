public class Fibonacci {
    public static void main(String[] args) {
        int n = 11;
        int num1 = 0, num2 = 1;
        System.out.print(num1 + " " + num2 + " ");

        for (int i = 2; i < n; i++) {
            int next = num1 + num2;
            System.out.print(next + " ");
            // обновляем значения переменных
            num1 = num2;
            num2 = next;
        }
    }
}
