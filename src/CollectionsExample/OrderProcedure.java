package CollectionsExample;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class OrderProcedure implements Runnable{

    private BlockingQueue<String> queue;

    public OrderProcedure(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        try {
            queue.put("Mac Book Pro");
            queue.put("Dell Laptop");
            queue.put("Iphone");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
