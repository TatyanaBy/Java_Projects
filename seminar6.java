import java.util.ArrayList;
import java.util.Collections;
//Коллекции SET. Сделать статичный метод(коллекцию). Написать программу, кот.будет изображать из себя set, не используя метод set
public class seminar6 {
    public static void main(String[] args) throws Exception{
    ArrayList<Integer> array = new ArrayList<>();
    add(45, array);//добавить это число в array
    add(75, array);
    add(85, array);
    add(55, array);

    System.out.println(array);
    }

    public static void add(Integer numbers, ArrayList<Integer> array) {
        if (!array.contains(numbers)) {
            array.add(numbers);
            Collections.sort(array);
        }
    }
}
