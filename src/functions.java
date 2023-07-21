import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class functions {
    public static void main(String[] args) {


//        ArrayList<Integer> list=new ArrayList<Integer>();
//        list.add(12);
//        list.add(10);
//        list.add(11);
//        list.add(13);

        //Second approach for creating list.
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        List<Integer> result=new ArrayList<>();
        List<String> result=new ArrayList<>();
        List<String> names=Arrays.asList("Anvesh","Aryan","Abhay","Chetan");
        
//        for(int i : num){
//            int table=i*6;
//            result.add(table);
//        }
//        result.forEach(System.out::println);
//        result=num.stream().map((n)-> n * 6).collect(Collectors.toList());
//        System.out.println(result);
        //       result.forEach(System.out::println);
        result=names.stream().filter((name)->name.length()<6).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(names);


    }
}
