// Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки). 
public class seminar2 {
    public static void main(String[] args) {
    word("приветик" , "приветики");
    }

public static void word(String str1, String str2) {
    System.out.println(str1.contains(str2));

}
public static void word2(String str1, String str2) {
    
}
// word(s1,s2);
// word(s1, new StringBuilder(s2).reverse().toString());
// int i1 = 3;
// int i2 = 56;
// int i3 = i1 + i2;
// String.valueOf(i3); //превратит в строку
}


//Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождением в обратном порядке)