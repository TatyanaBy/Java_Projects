//на семинаре 1
import java.util.Random;
import java.util.Scanner;

public class program { // в теле нельзя писать код, можно объявить только переменные Public наш класс,
                       // который сами создали

    /**
     * @param arg
     */
    public static void main(String[] arg) { // переменная main
        // print ("Hello, friend!");
        int i = 0; // 32 бита целочисленный
        long l = 0; // 64 бита целочисленный

        byte b = 0;
        short s = 0;

        float f = 0.0f; // 32 бита дробный
        double d = 0.0; // 64 бита дробный
        boolean b1 = true;

        char c = 1; // 16 бит беззнаковый char это буква, он хранит букву

        String str = "Hi Hi Goodbye"; // с большой буквы пишется Строка У строк есть много методов

        str += " Hello";

        int[] aI = new int[10];
        int[] tmp = new int[aI.length + 5];

        aI = tmp;

        // //массивы
        // int[] aI = new int[10]; // нужно точно сказать заранее сколько элементов
        // будет в массиве. На примере массив хранит в себе 10 элементов
        // aI[0] = 10;
        // print(String.valueOf(aI.length)); //al.lenght это всегда int, а print
        // принимает только string и чтобы преобразовать в стринг для печати,
        // //добавляем класс String.

        // int[] aI = new int[10];
        Random rnd = new Random(); //название класса, объявили Random внешний класс

        for (int j = 0; j < aI.length; j++) {
        aI[j] = rnd.nextInt();
        }

        // for (int j = 0; j < aI.length; j++) {
        // print(String.valueOf(aI[j])) ;
        // }
        // System.out.println(aI); //возвращает адрес....
        // print(str);
        // str.toLowerCase(); //возвращает новую строку в кот.все буквы мал
        // print(str);

        // print(str);
        // print(str.toLowerCase()); //вернул мал.буквы вместо больших
        // print(String.valueOf(str.compareTo("el")));
        // print(String.valueOf(str.contains("ele")));
        // str.concat("new");
        // print(str.substring(3,str.length()/2)); //цифра 3 в примере убирает первые
        // три символа соответственно, а / 2
        // //- убирает вторую строку
        // print(str.replace('H', 'Q')); // меняет символ, можно также и цеоые слова
        // заменить

        // String[] strA = str.split(" "); // делит строку, получается на каждой строке
        // for (int j = 0; j < strA.length; j++) {
        //     print(strA[j]);
        // }

        // print(String.valueOf(str.charAt(str.length() - 5)));
        // String s1 = "Hi Hi Goodbye";
        // if (str == s1) {   //вместо str == s1 можно писать str.equals(s1)
        //     print("OK");
        // }

        // print(Integer.toBinaryString(rnd.nextInt(128)));  //возвращает двоичное представление от рандомного числа
        // print(String.valueOf(Integer.toBinaryString(rnd.nextInt(128)).length()));  //возвращает кол-во цифр в полученном числе?
        // print("Hi".repeat(10));  //повторить столько раз сколько запросили
      
            // Scanner scanner = new Scanner (System.in, "Cp866");

            // String newString = scanner.nextLine();
            // print(newString);
        }
    

    private static void print(String str) { // переменная print
        System.out.println(str);
    }

}
