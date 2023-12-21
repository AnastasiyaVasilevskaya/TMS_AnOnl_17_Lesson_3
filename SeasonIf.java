import java.util.Scanner;

public class SeasonIf {
    public static void main(String[] args) {
        System.out.print("Введите номер месяца - ");
        Scanner num = new Scanner(System.in);
        int monthNumber = num.nextInt();
        String month;
        if(monthNumber == 1){
            month = "Январь";
        } else if (monthNumber == 2) {
            month = "Февраль";
        } else if (monthNumber == 3) {
            month = "Март";
        } else if (monthNumber == 4) {
            month = "Апрель";
        } else if (monthNumber == 5) {
            month = "Май";
        } else if (monthNumber == 6) {
            month = "Июнь";
        } else if (monthNumber == 7) {
            month = "Июль";
        } else if (monthNumber == 8) {
            month = "Август";
        } else if (monthNumber == 9) {
            month = "Сентябрь";
        } else if (monthNumber == 10) {
            month = "Октябрь";
        } else if (monthNumber == 11) {
            month = "Ноябрь";
        } else if (monthNumber == 12) {
            month = "Декабрь";
        } else {
            month = null;
        }
        if (month != null){
            System.out.println(month + " - ваш месяц под номером " + monthNumber);
        }else System.out.println("Месяца под таким номером не существует! :(");
    }
}
