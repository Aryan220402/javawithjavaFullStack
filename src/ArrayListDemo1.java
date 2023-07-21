import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Comparator;
import java.util.Iterator;
class student implements Comparable<student> {
    public Integer id;
    public String name;
    public Integer age;

    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "Id=" + id +
                ", Name-'" + name + '\'' +
                ", Age-'" + age + '\'' +
                '}';

    }

    //copareTo{ student = class , student = another object }
    public int compareTo(student student) {
//        if(id> student.id){
//            return 1;
//        } else if (id< student.id) {
//            return -1;
//        }
//        else{
//            return 0;
//        }

        // For Integer.
        return id.compareTo(student.id);
//        return name.compareTo(student.name);
    }
}
//class SortByName implements Comparator<student>(){
//
//}
//}

public class ArrayListDemo1  {
    public static void main(String[] args) {
        student obj1=new student(2,"Aryan",20);
        student obj2=new student(1,"Anvesh",21);
        student obj3=new student(3,"Sumit",22);

        ArrayList<student> list=new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        //Comparable is a interface having a function "compareTo().it work in same class.package-lang.Method-compareTo"
        Collections.sort(list);
        //Comparator in another class,package-Util. method-equals,campare.
        for(student s: list){
            System.out.println(s);
        }
    }
}

//List-Asynchronized,
//Vector-Synchronized,