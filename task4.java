import java.util.Scanner;

public class task4 {
    
    /*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

    public static void main(String[] args) {
        
        
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.println("Введите: ");
            String result = scan.nextLine();
            if (result == "") {
                throw new RuntimeException("Пустые строки вводить нельзя!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }  
    }
}
