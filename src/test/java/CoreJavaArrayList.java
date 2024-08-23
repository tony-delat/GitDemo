import java.util.ArrayList;

public class CoreJavaArrayList {

    public static void main(String[] args) {

        //ArrayList allows to update the array size, whereas regular array cannot
        //be updated in size on execution.

        ArrayList<String> s = new ArrayList<String>();

        s.add("hello");
        s.add("world");
        s.add("selenium");

        System.out.println(s.get(1));

        //printing all with regular loop
        for(int i=0;i<s.size();i++){
            System.out.println(s.get(i));
        }

        //printing all with enhanced for
        for(String val: s){
            System.out.println(val);
        }

        //item is present in ArrayList
        System.out.println(s.contains("Something"));


    }

}
