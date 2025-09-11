package list.test;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx3 {
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
        int sum = 0;
        for(Integer num : list) {
            sum += num;
        }

        System.out.println("정수의 합계: "+ sum);
        System.out.println("정수의 평균: "+ (double) sum/list.size() );

    }
}
