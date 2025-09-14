package collection.map.test.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
   private Deque<String> history = new ArrayDeque<>();
   private String currentPage = null;

    public void visitHistory(String url) {
        if(currentPage != null) {
            history.push(currentPage);
        }
        currentPage = url;
        System.out.println("방문: "+ url);
    }

    public String goBack() {
        if(!history.isEmpty()) {
            String currentPage = history.pop();
            System.out.println("뒤로가기 ㅣ: "+ currentPage);
            return currentPage;
        }
        return null;
    }
}
