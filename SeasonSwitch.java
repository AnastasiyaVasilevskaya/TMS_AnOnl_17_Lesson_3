import java.util.Scanner;

public class SeasonSwitch {
    public static void main(String[] args) {
        System.out.print("Введите номер месяца - ");
        Scanner num = new Scanner(System.in);
        int numberOfMonth = num.nextInt();

        String month = switch(numberOfMonth){
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";

            default -> null;
        };

        if(month != null){
        System.out.println(month + " - ваш месяц под номером " + numberOfMonth);
        }else System.out.println("Месяца под таким номером не существует! :(");

    }
}