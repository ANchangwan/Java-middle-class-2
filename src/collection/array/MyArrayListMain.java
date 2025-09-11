package collection.array;

public class MyArrayListMain {
    public static void main(String[] args) {
//        MyArrayListV1 list = new MyArrayListV1();
//        MyArrayListV2 list2 = new MyArrayListV2();
        MyArrayListV4<String> list = new MyArrayListV4<>();
        list.add("1");
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);
    }
}
