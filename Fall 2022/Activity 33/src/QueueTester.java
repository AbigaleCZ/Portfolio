public class QueueTester {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue("Tom");
        queue.enqueue("Jane");
        queue.enqueue("Beth");
        // System.out.println(queue.displayQueue());
        queue.enqueue("John");
        queue.enqueue("Mary");
        // System.out.println(queue.displayQueue());
        String empty = "";
        if (queue.isEmpty()) {
            empty = "true";
        }
        else {
            empty = "false";
        }
        // System.out.println("Queue is empty: " + empty);
        // System.out.println("Number of items in queue: " + queue.size());
        // System.out.println("The head of the queue is " + queue.peek());
        // System.out.println("Remove " + queue.dequeue());
        queue.dequeue();
        // System.out.println(queue.displayQueue());
        // System.out.println("Queue is empty: " + empty);
        // System.out.println("Number of items in queue: " + queue.size());
        // System.out.println("The head of the queue is " + queue.peek());
        System.out.println("Remove " + queue.dequeue());
        System.out.println("The head of the queue is " + queue.peek());
    }
}
