import java.util.ArrayList;
import java.util.List;
public class lamda2 {
    public static void main(String[] args) {
     List<String> list=new ArrayList<>();
     list.add("Aryan");
     list.add("Abhay");
     list.add("Anvesh");
     list.add("Akash");
//     for(String i: list){
//         System.out.println(i);
//     }
//        list.forEach((name)->System.out.println(name));
        list.forEach(System.out::println); //Method Referencing in Java 8.
    }
}
