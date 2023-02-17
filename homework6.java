// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. 
// Формат данных Integer. //написать пару методов средствами HashMap


// import java.security.Key;
import java.util.HashMap;
// import java.util.HashSet;
// import java.util.Set;

public class homework6 {
    
    private static HashMap <Integer, Object> hashMap = new HashMap<>();
    private static final Object OBJ  = new Object();
    public static void main(String[] args) throws Exception {
        
        // HashSet<Integer> set = new HashSet<>();  //HashSet
        // set.add(25);
        // set.add(15);
        // set.add(35);
        // set.add(55);
        // set.add(85);
        // System.out.println("HashSet: " + set);
        add(25);
        add(15);
        add(35);
        add(55);
        add(85);
        // System.out.println(hashMap.keySet());
        System.out.println(getString());

        System.out.println(gettkey(0));
        System.out.println(gettkey(100));
    }

    private static int gettkey(int num) {
        return (Integer)hashMap.keySet().toArray()[num];
    }


    private static String getString(){
        return hashMap.keySet().toString();
    }

    public static void add(Integer numbers) {
        hashMap.put(numbers, OBJ);
    }            
}  




