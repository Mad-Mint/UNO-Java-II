/**
 * Client/driver of the queue.
 *
 * @author Agatha Owora
 * @see Queue actual Queue implemetation.
 */
public class QueueClient {
    /**
     * Main method.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        Queue<String> q1 = new Queue<>(3);
        q1.dequeue();
        q1.enqueue("cat");
        q1.enqueue("rat");
        q1.enqueue("dog");
        q1.enqueue("fish");
        System.out.println("q1 elements: " + q1);       // q1 elements: [cat, rat, dog]

        Queue<Integer> q2 = new Queue<>(2);
        q2.dequeue();
        q2.enqueue(10);
        q2.enqueue(20);
        q2.dequeue();
        q2.dequeue();
        q2.enqueue(30);
        System.out.println("q2 elements: " + q2);       // q2 elements: [30, null]

        Queue<Character> q3 = new Queue<>(2);
        q3.enqueue('a');
        q3.enqueue('b');
        q3.dequeue();
        q3.dequeue();
        System.out.println("q3 elements: " + q3);       // q3 elements: [null, null]
    }
}
