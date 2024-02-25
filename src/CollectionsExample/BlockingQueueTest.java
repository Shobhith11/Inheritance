package CollectionsExample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);
        OrderConsumer orderConsumer = new OrderConsumer(queue);
        OrderProcedure orderProcedure = new OrderProcedure(queue);

        new Thread(orderProcedure).start();
        new Thread(orderConsumer).start();

    }
}
