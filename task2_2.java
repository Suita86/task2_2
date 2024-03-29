/*
 * Дан следующий код, исправьте его там, где требуется public static void
 * main(String[] args) throws Exception {
 * try {
 * int a = 90;
 * int b = 3;
 * System.out.println(a / b);
 * printSum(23, 234);
 * int[] abc = { 1, 2 };
 * abc[3] = 9;
 * } catch (Throwable ex) {
 * System.out.println("Что-то пошло не так...");
 * } catch (NullPointerException ex) {
 * System.out.println("Указатель не может указывать на null!");
 * } catch (IndexOutOfBoundsException ex) {
 * System.out.println("Массив выходит за пределы своего размера!");
 * }
 * }
 * public static void printSum(Integer a, Integer b) throws
 * FileNotFoundException {
 * System.out.println(a + b);
 * }
 */

 public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[2] = 9; // Индекс последнего элемента в массиве - 2, поэтому заменяем элемент с индексом 2
   } catch (ArithmeticException ex) { // Добавляем обработку исключения деления на ноль
       System.out.println("Деление на ноль!");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}