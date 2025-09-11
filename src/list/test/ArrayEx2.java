package list.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요. (종료 0)");
        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);

        }
        System.out.println("출력");
        for (int i = 0; i < list.size(); i++) {

            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
