public class program2 {
    


/**
 * @param args
 */
public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello!");
    // String str = sb.toString();
    // System.out.println(sb.capacity());
    // sb.reverse();  //разворачивают строку/
    // sb.delete(2, sb.length()-2);

    sb.insert(sb.length()/2, "to the"); // смещение
    // sb.insert(0, null);
    sb.deleteCharAt(0);  //убирает символ по индексу

    System.out.println(sb);

    double begin = System.currentTimeMillis();
    String str = "";
    for (int i = 0; i < 20000; i++) {
        str += Character.getName(i);
    }
       System.out.println(System.currentTimeMillis() - begin);


    begin = System.currentTimeMillis();
    StringBuilder stringBuilder = new StringBuilder();  //работает быстрее, чем String
    for (int i = 0; i < 20000; i++) {
        stringBuilder.append (Character.getName(i));
    }
        System.out.println(System.currentTimeMillis() - begin);

    }
}



    

