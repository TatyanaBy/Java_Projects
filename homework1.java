import java.util.Arrays;
import java.util.Random;

// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
// 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
// Пункты реализовать в методе main
// *Пункты реализовать в разных методах
//int i = new Random().nextInt(k); //это кидалка случайных чисел!)

public class homework1 {
    
/**
 * @param arg
 */
public static void main(String[] arg) {
// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

    // int max = 2000; 
    // int min = 0;  
    // int i = new SecureRandom().nextInt(max - min) + min; 
    // System.out.println(i); 

    int min = 0;
    int max = 2000;
    int diff = max - min;
    Random random = new Random();
    int i = random.nextInt(diff + 1) + min;
    System.out.println(i); 
    
 // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    int n = getMaxBit(i);
    System.out.println(n); 

 // 3 Найти все кратные n числа большие i и сохранить в массив m1. 
 // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
    
    int c = 0; 
    int[] m1 = new int[c];
    for (int j = i; j < Short.MIN_VALUE; j++) {
        if (j%n == 0);
        m1[c++] = j;
    }
    int[] m2 = new int[c];
    for (int j = i; j < Short.MAX_VALUE; j++) {
        if (j%n != 0);
        m2[c++] = j;
    }
    System.out.println(Arrays.toString(m1));
    System.out.println(Arrays.toString(m2));
    
}

private static int getMaxBit(int i) {
    return Integer.toBinaryString(i).length();
}

}