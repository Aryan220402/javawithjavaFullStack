interface mytest1{
    String data();
}
interface mytest2{
    String data(String name);
}
interface mytest3{
    int calculate(int num_one,int num_two);
}
public class TP {
    public static void main(String[] args) {
//        mytest1 t1= new mytest1() {
//            @Override
//            public String data() {
//                return null;
//            }
//        };
//        t1.data();
        mytest1 t1=()->"Aryan";
        mytest2 t2=(name)->"Aryan";

        mytest3 t3=(num_one,num_two)->{
            return (num_one + num_two);
        };
    }
}
