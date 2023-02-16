import java.util.ArrayList;
import java.util.Random;

// коллекции java, для хранения данных


public class seminar3 {
    public static void main(String[] args) {
        int[] ints = new int[10];
        for (int i=0;i<ints.length;i++) {
            ints[i] = new Random().nextInt(100);
        } 

        // int[] tmp = new int[ints.length + 1];
        // tmp[0] = ints[0];
        // tmp[1] = 123;
        // for (int i=2;i<tmp.length;i++) {
        //     tmp[i] = ints[i-1];
        // } 
        // ints = tmp;

        ArrayList<Integer> list = new ArrayList<>();
    
        for (int i = 0; i < 10; i++) {
            list.add(12);
        }
        list.forEach(nik->System.out.println(nik+"!"));  //println - с переносом строки, print - горизонтально в строку


    public static void main2(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(); 
        System.out.println();
        }
    }
}
