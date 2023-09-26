import java.util.Scanner;

public class task1 {

    /*
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
     * Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, 
     * необходимо повторно запросить у пользователя ввод данных.
     */
    public static void main(String[] args) {
        
        System.out.println(floatNumber());
    }

    public static Float floatNumber() {

        boolean flag = true;
        Scanner scan = new Scanner(System.in);

        while (flag) {

            try {

                System.out.println("Введите число типа float: ");
                String input = scan.nextLine();
                float output = Float.parseFloat(input);
                flag = false;
                scan.close();
                return output;
            }
            catch (NumberFormatException e) {

                System.out.println("Это не тип float, попробуйте снова!");
            }
        }
        
        return null;
    }
}
