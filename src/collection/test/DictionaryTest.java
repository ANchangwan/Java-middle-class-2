package collection.test;

import java.util.HashMap;
import java.util.Scanner;


public class DictionaryTest {
    public static void main(String[] args) {
        HashMap<String, String> dict = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("==단어 입력 단계==");


        while(true){
            System.out.println("영어 단어 뜻을 입력하세요 (종료 q)");
            String command = scanner.nextLine();
            if(command.equals("q")){
                break;
            }
            if(!dict.containsKey(command)){
                System.out.println(command + "은(는) 사전에 없는 단어입니다!");
            }else{
                System.out.println(command+"의 뜻: "+dict.get(command));
            }
        }
    }
}
