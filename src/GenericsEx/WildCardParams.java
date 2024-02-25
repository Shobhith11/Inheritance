package GenericsEx;

import java.util.ArrayList;
public class WildCardParams {
    public static void main(String[] args) {
        WildCardParams wcp = new WildCardParams();
        wcp.myMethod(new ArrayList<Thread>());
    }

    public void myMethod(ArrayList<? extends Thread> l) {
        l.add(null);
        //l.add("abc");
    }
}
