package collection.set;

public class StringHashMain {
    static final int CAPACITY = 10;
     public static void main(String[] args) {

         char a = 'A';
         char b = 'B';

         System.out.println("hachcode(A): " + hashCode("A"));

         System.out.println("hachcode(B): " + hashIndex(hashCode("A")));
         System.out.println("hachcode(C): " + hashIndex(hashCode("C")));
         System.out.println("hachcode(D): " + hashIndex(hashCode("AB")));


     }
     static int hashCode(String str){
         char[] chars = str.toCharArray();
         int sum = 0;
         for(char c : chars){
             sum += (int) c;
         }
         return sum;
     }

     static int hashIndex(int value){
         return value % CAPACITY ;
     }
}
