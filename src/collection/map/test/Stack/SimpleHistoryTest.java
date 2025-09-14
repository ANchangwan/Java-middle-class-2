package collection.map.test.Stack;

import java.util.ArrayDeque;

public class SimpleHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitHistory("google.com");
        browserHistory.visitHistory("youtube.com");
        browserHistory.visitHistory("facebook.com");



    }
}
