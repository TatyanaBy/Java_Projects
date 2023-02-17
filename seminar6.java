import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
//Коллекции SET. Сделать статичный метод(коллекцию). Написать программу, кот.будет изображать из себя set, не используя метод set. 

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class seminar6 {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJ = new Object();
    public static void main(String[] args) throws Exception{
    // ArrayList<Integer> array = new ArrayList<>(); один из способов,
    // add(45, array);//добавить эти числа в array
    // add(75, array);
    // add(85, array); 
    // add(55, array);
    add(35);
    add(65);
    add(85);
    add(105);

    System.out.println(hMap.keySet());
    System.out.println(getString());
    System.out.println(isEmpty());
    
    // Object[] tmp = hMap.keySet().toArray();
    // for (int index = 0; index < tmp.length; index++) {
    //     System.out.println((Integer)tmp[index]+" ");
    // } 
        System.out.println(gettKey(0));
        try {
            System.out.println(gettKey(110));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage()); //если возникает исключение. Возвращает краткое сообщение об исключении
        }

        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
//метод приним.индекс и возвращающий ошибку, еси=ли выйдет за пределы
    private static int gettKey(int num) {
        return (Integer)hMap.keySet().toArray()[num];
    }
    
    //метод который будет перечислять значение ключей

    // HashSet<Integer, Object> hSet = new HashSet<>();// когда создаем hashset, на самом деле создаем hashmap
    // метод to string
    private static boolean isEmpty() {
        return hMap.isEmpty();
    } 
    private static String getString() {

        return hMap.keySet().toString();
    };

    public static void add(Integer numbers) {
        hMap.put(numbers, OBJ);
        // if (!hMap.contains(numbers)) {
        //     hMap.put(numbers, numbers);
        //     Collections.sort(hMap);

        }
    }


