import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //1.Iterable,2.Collection,3.List,4.Queue,5.set,6.dequque,7.SortedSet.

//        ArrayList<String> list=new ArrayList<>();
//        list.add("ram");
//        list.add("sita");
//        list.add("ravan");
//        list.add("meghnath");
//        System.out.println(list);
////      Using Iterate
//        Iterator itrator=list.iterator();
//        while(itrator.hasNext()){  //hashnext see the next value.
//            System.out.println(itrator.next());
//        }
//        System.out.println("*************************************");
//        for(String s: list){
//            System.out.println(s);
//        }
//        System.out.println("***************************");
//        list.set(1,"Laxman");
//        System.out.println(list.get(1));
        //itrator gives the forward iteration power.
        ArrayList<String> list=new ArrayList<>();
        list.add("ram");
        list.add("sita");
        list.add("ravan");
        list.add("meghnath");
        System.out.println("****************************************");
        System.out.println("Before Sorting : "+ list);
        Collections.sort(list);
        System.out.println("****************************************");
        System.out.println("After Sorting : "+ list);
    }
}
