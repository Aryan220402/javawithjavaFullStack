import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
    class infomation{
    public int id;
    public int rollno;
    public int marks;

    public infomation(int id, int rollno, int marks){
        this.id=id;
        this.rollno=rollno;
        this.marks=marks;
    }
        public String toString(){
            return "information{" +
                    "id-" + id +
                    ", rollno-'"+ rollno +'\''+
                    ", email-'" + marks +'\'' +
                    '}';
        }
    }
public class ArrayListDemo2 {
    public static void main(String[] args) {
                infomation obj1=new infomation(1,1,91);
        infomation obj2=new infomation(2,6,89);
        infomation obj3=new infomation(3,52,92);

        ArrayList<infomation> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

        for(infomation s: list){
            System.out.println(s);
        }
//        Iterator itrator=list.iterator();
//        while(itrator.hasNext()){
//            System.out.println(itrator.next());
//        }
    }
}


