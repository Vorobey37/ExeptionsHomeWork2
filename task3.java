public class task3 {
    
    /*
     * Дан следующий код, исправьте его там, где требуется
     */

    /*
     * public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
     */



    
    public static void main(String[] args) throws Throwable {
    //было throws Exception, все-таки Exception - это подкласс Throwable, а у нас дальше Throwable фигурирует

        try {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = { 1, 2 };
        abc[3] = 9;
        // Не предусмотрено еще деление на ноль для общей картины
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
            // была нарушена последовательность, т.к. самый общий класс должен стоять в конце
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws NullPointerException /*было: throws FileNotFoundException*/ {
        System.out.println(a + b);
    }

}
