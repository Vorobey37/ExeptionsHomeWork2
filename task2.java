public class task2 {

    /*
     * Если необходимо, исправьте данный код:
     * try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
       } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
        }
    */
    public static void main(String[] args) {
        
        // Здесь ошибка в том, что не задан массив, программа не понимает, что такое intArray[8]?
        // Задим массив, к примеру:
          int []intArray = new int [10];
        try {
        int d = 0;
        double catchedRes1 = intArray[8] / d; 
        System.out.println("catchedRes1 = " + catchedRes1);
        
        // Раз уж мы задали массив, то нужно предусмотреть выход за пределы массива:
       } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e);
        }
    }
}
