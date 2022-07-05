import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    @Test
    void testConstructor() {
        Queue<Double> q = new Queue<>(2);
        assertEquals(null, q.front());
        assertEquals(null, q.rear());
        assertEquals(0, q.elementCount());
        assertTrue(q.isEmpty());
        assertFalse(q.isFull());
    }

    @Test
    void testIsFull() {
        Queue<Double> q = new Queue<>(2);
        q.enqueue(1.1);
        assertFalse(q.isFull());
        q.enqueue(1.2);
        assertTrue(q.isFull());
        q.enqueue(1.3);
        assertTrue(q.isFull());
    }

    @Test
    void testIsEmpty() {
        Queue<Double> q = new Queue<>(2);
        assertTrue(q.isEmpty());
        q.enqueue(1.1);
        assertFalse(q.isEmpty());
        q.enqueue(1.2);
        assertFalse(q.isEmpty());
        q.dequeue();
        assertFalse(q.isEmpty());
        q.dequeue();
        assertTrue(q.isEmpty());
        q.dequeue();
        assertTrue(q.isEmpty());
    }

    @Test
    void testElementCount() {
        Queue<Double> q = new Queue<>(2);
        assertEquals(0, q.elementCount());
        q.enqueue(1.1);
        assertEquals(1, q.elementCount());
        q.enqueue(1.2);
        assertEquals(2, q.elementCount());
        q.enqueue(1.3);
        assertEquals(2, q.elementCount());
    }

    @Test
    void testFront() {
        Queue<Double> q = new Queue<>(2);
        assertEquals(null, q.front());
        q.enqueue(1.1);
        assertEquals(1.1, q.front());
        q.enqueue(1.2);
        assertEquals(1.1, q.front());
        q.enqueue(1.3);
        assertEquals(1.1, q.front());
        q.dequeue();
        assertEquals(1.2, q.front());
        q.dequeue();
        assertEquals(null, q.front());
        q.enqueue(1.4);
        assertEquals(1.4, q.front());
        q.dequeue();
        assertEquals(null, q.front());
    }

    @Test
    void testRear() {
        Queue<Double> q = new Queue<>(2);
        assertEquals(null, q.rear());
        q.enqueue(1.1);
        assertEquals(null, q.rear());
        q.enqueue(1.2);
        assertEquals(1.1, q.rear());
        q.enqueue(1.3);
        assertEquals(1.1, q.rear());
        q.dequeue();
        assertEquals(null, q.rear());
        q.dequeue();
        assertEquals(null, q.rear());
        q.enqueue(1.4);
        assertEquals(null, q.rear());
        q.dequeue();
        assertEquals(null, q.rear());
    }

    @Test
    void testEnqueue() {
        Queue<Double> q = new Queue<>(2);
        q.enqueue(1.1);
        assertEquals(1.1, q.front());
        assertEquals(null, q.rear());
        assertEquals(1, q.elementCount());

        q.enqueue(1.2);
        assertEquals(1.1, q.front());
        assertEquals(1.1, q.rear());
        assertEquals(2, q.elementCount());

        q.enqueue(1.3);
        assertEquals(1.1, q.front());
        assertEquals(1.1, q.rear());
        assertEquals(2, q.elementCount());
    }

    @Test
    void testDequeue() {
        Queue<Double> q = new Queue<>(2);
        q.enqueue(1.1);
        q.enqueue(1.2);
        q.enqueue(1.3);

        q.dequeue();
        assertEquals(1.2, q.front());
        assertEquals(null, q.rear());
        assertEquals(1, q.elementCount());

        q.dequeue();
        assertEquals(null, q.front());
        assertEquals(null, q.rear());
        assertEquals(0, q.elementCount());
    }

    @Test
    void testToString() {
        Queue<Double> q = new Queue<>(2);
        q.enqueue(1.1);
        q.enqueue(1.2);
        q.enqueue(1.3);
        assertEquals("[1.1, 1.2]", q.toString());

        q.dequeue();
        q.enqueue(2.1);
        assertEquals("[2.1, 1.2]", q.toString());

        q.dequeue();
        assertEquals("[2.1, null]", q.toString());
    }
}