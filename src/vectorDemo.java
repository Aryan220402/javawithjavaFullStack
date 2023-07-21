import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        System.out.println(v);
        Enumeration e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println("***********************************");
        Iterator itrator=v.iterator();
        while(itrator.hasNext()){
            System.out.println(itrator.next());
        }
    }
}
