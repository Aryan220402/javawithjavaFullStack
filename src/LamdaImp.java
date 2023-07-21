//interface YTcontent{
//    void content();
////    void shorts();
//}
//class showData implements YTcontent{
//
//    @Override
//    public void content() {
//        System.out.println("hello here is some content");
//    }

//    @Override
//    public void shorts() {
//        System.out.println("hello showing another method data");
//    }
//}

//********************************************************8

interface  addTwoNumber{
    void Add(int num_one, int num_two);
}
public class LamdaImp {
    public static void main(String[] args) {
//        showData show=new showData();
//        show.content();
//        show.shorts();
//************************************************************************************
        //Using Flows Method.......
//        YTcontent yt=new YTcontent() {
//            @Override
//            public void content() {
//                System.out.println("hello here is some content");
//            }
//
//            @Override
//            public void shorts() {
//                System.out.println("hello showing another method data");
//            }
//        };
//        yt.content();
//        yt.shorts();

        //With Lambda Expression
//        YTcontent yt1 = () -> {
//            System.out.println("hello class");
//        };
//        yt1.content();

        //***************************
        addTwoNumber add= (one,two)->{  //add is anonymous class of interface
            System.out.print("Addition of Two Number is :"+ (one + two));
        };
       add.Add(20,30);

    }
}
