import java.util.*;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Manish Mishra");
        list.add("Praveen Mittal");
        list.add("Ashish Tiwari");
        System.out.println(list);

        ArrayList<String> obj = new ArrayList<>();
        obj.add("Ankit");
        list.add(2,"tuneet");
        obj.addAll(list);
        System.out.println(obj);
//        System.out.println(obj.getFirst());

        list.indexOf("puneet");
        list.addFirst("Anvesh");
        list.addLast("Adarsh");
        System.out.println(list.getFirst());

        System.out.println(list.getLast());

        System.out.println(list);

        System.out.println(list.removeLast());
//        list.clear();
        System.out.println(list);


        LinkedList<String> clonelist = new LinkedList<>();
        clonelist = (LinkedList)list.clone();
        System.out.println(clonelist);
//        


    }
}
