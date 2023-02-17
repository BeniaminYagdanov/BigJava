import java.util.Scanner;
public class JavaRush {
    public static void main(String[] args) {


    // Думать до конца не зависимо от времени
/**public static void main(String[]args){
 Scanner scan = new Scanner(System.in);
    int b = 0;
    boolean isExit = false;
    while (!isExit) {
 if (scan.hasNextInt()) {
     int v = scan.nextInt();
     b = b + v;
 }
 else if (scan.hasNextLine()) {
     String line = scan.nextLine();
   if  (line.equalsIgnoreCase("ENTER")) {
        isExit = true;
   }
 }}
}}**/
/**int v = 0;
       while (v<=10) {
           int sh = 0;
           while (sh <=20) {
               if (v == 0 || v == 10) {
                   System.out.print('B');
               } else if (sh == 0 || sh == 20) {
                   System.out.print('B');
               }else {
                   System.out.print(' ');
               }
               sh++;
           }
           System.out.println();
           v++;
       }
    }
}
 **/

        /*int sum = 0;      // НЕ правильный код уровень 4 лекция 5 со-временем исправить
        int number = 0;
        while (number <= 100) {
            if (number % 3 == 0) {
                number++;
                continue;
            }

            sum = sum + number;
            number++;
        }
        System.out.println(sum);

        int i = 0; // ГЕНИАЛЬНОЕ РЕШЕНИЕ ЗАДАЧИ
        while (i < 100)
        {
            i++; // вот и  вся проблема
            if ( (i % 3) == 0)
                continue;
            System.out.println(i);
        }
        */

    }
}




