package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        MyUser[] users = {myUser1, myUser2, myUser3};
        System.out.println("기본유저");
        System.out.println(Arrays.toString(users));

        System.out.println("Comparable 기본정렬");
        Arrays.sort(users);
        System.out.println( "Comparable: "+ Arrays.toString(users));

        System.out.println("Comparator id 정렬");
        Arrays.sort(users, new IdComparator());
        System.out.println("Comparator: " + Arrays.toString(users));

    }
}
