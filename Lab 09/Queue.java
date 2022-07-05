import java.util.Arrays;

/**
 * Generic queue.
 *
 * @param <E> various reference types.
 * @author Agatha Owora
 * @see QueueClient client class to test the Queue works as expected.
 */
public class Queue<E> {

    /**
     * Index of the front of the queue.
     */
    private int head;
    /**
     * Index of the back of the queue.
     */
    private int tail;
    /**
     * Number of elements in the queue.
     */
    private int actualCount;
    /**
     * Size of the queue.
     */
    private int queueSize;
    /**
     * Array holding the elements in the queue.
     */
    private E[] list;

    /**
     * Method to set up initial state of the queue.
     * The head, tail, and actualCount need to be initialized to 0.
     * Set the value of the queueSize and create the actual array object (refer to lab hint).
     *
     * @param queueSize the maximum size of the queue.
     */
    public Queue(int queueSize) {
		head = 0;
		tail = 0;
		actualCount = 0;
		this.list = (E[])new Object[queueSize];
		this.queueSize=queueSize;
    }

    /**
     * Method to check if the queue is full.
     *
     * @return true if full and false if not full.
     */
    public boolean isFull() {
		return (queueSize == actualCount);
    }

    /**
     * Method to check if the queue is empty.
     *
     * @return true if empty and false if not empty.
     */
    public boolean isEmpty() {
		return (actualCount == 0);
    }

    /**
     * Method to return the actual number of elements in the queue.
     *
     * @return element total count.
     */
    public int elementCount() {
        return actualCount;
    }

    /**
     * Method to return the element at the front of the queue.
     *
     * @return front element.
     */
    public E front() {
		return list[head];
    }

    /**
     * Method to return the element at the back of the queue.
     *
     * @return rear element.
     */
    public E rear() {
        return list[tail];
    }

    /**
     * Method to add an element to the queue.
     * If the queue is full, do nothing.
     * If the queue is not full, add the element passed to the queue.
     * Don't forget to update the tail and actualCount values.
     *
     * @param element item being added to the queue.
     */
    public void enqueue(E element) {
		if(isFull()){
		    return;
        }else{
		    list[tail] = element;
            tail=(tail+1)%queueSize;
            actualCount++;
        }
    }

    /**
     * Method to remove an element from the queue.
     * If the queue is empty, return null.
     * If the queue is not empty:
     *      1. Store the value of the element currently at the front of the queue.
     *      2. Set the value of the element currently at the front of the queue to null.
     *      3. Update the index of the front of the queue.
     *      4. Update the actualCount value.
     *      5. Return the original value of the element that was at the front of the queue before it was set to null.
     * Please note:
     *      1. Normally when an element is dequeued, there's no reason to set update that position to null.
     *      2. This is being done in this lab to help us clearly see which parts of the queue are empty.
     *      3. It's easy for us to use null because we are working with reference types.
     *
     * @return the element removed from the queue.
     */
    public E dequeue() {
        if(isEmpty()){
            return null;
        }else {
            E var1 = list[head];
            list[head] = null;
            head=(head+1)%queueSize;
            actualCount--;
            return var1;
        }
    }

    /**
     * Method to display the elements in the queue (refer to lab hint).
     *
     * @return queue elements.
     */
    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}