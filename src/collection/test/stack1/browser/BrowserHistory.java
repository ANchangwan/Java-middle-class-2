package collection.test.stack1.browser;

import java.util.ArrayDeque;

public class BrowserHistory {
    ArrayDeque<String> deque = new ArrayDeque<>();
    private String currentPage = null;
   public void visitPage(String url) {
       deque.push(url);
   }
   public String goBack() {
       if(!deque.isEmpty()) {
           currentPage = deque.pop();
           return currentPage;
       }
       return null;
   }
}
