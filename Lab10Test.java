import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class Lab10Test {

    @Test
    public void testStackCreation1() {
        Stack<Integer> stack = new Stack<>();
        assertNotNull(stack, "Stack should not be null when created");
    }

    @Test
    public void testStackCreation2() {
        Stack<Integer> stack = new Stack<Integer>();
        assertNotNull(stack, "Stack should not be null when created");
    }

    @Test
    public void testStackPush1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        assertEquals(10, stack.peek(), "Top of stack should be 10 after pushing 10");
    }

    @Test
    public void testStackPush2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(20);
        assertEquals(20, stack.peek(), "Top of stack should be 20 after pushing 5 then 20");
    }

    @Test
    public void testStackPop1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        assertEquals(7, stack.pop(), "Pop should return 7");
    }

    @Test
    public void testStackPop2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(9);
        assertEquals(9, stack.pop(), "Pop should return the most recent item");
    }

    @Test
    public void testStackPeek1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        assertEquals(4, stack.peek(), "Peek should return 4");
    }

    @Test
    public void testStackPeek2() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.peek(), "Peek should return the top item");
        assertEquals(2, stack.size(), "Peek should not remove an item");
    }

    @Test
    public void testQueueCreation1() {
        Queue<Integer> queue = new LinkedList<>();
        assertNotNull(queue, "Queue should not be null when created");
    }

    @Test
    public void testQueueCreation2() {
        Queue<Integer> queue = new LinkedList<Integer>();
        assertNotNull(queue, "Queue should not be null when created");
    }

    @Test
    public void testQueueAdd1() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        assertEquals(10, queue.peek(), "Front of queue should be 10 after adding 10");
    }

    @Test
    public void testQueueAdd2() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(20);
        assertEquals(5, queue.peek(), "Front of queue should stay 5 after adding 5 then 20");
    }

    @Test
    public void testQueueRemove1() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(7);
        assertEquals(7, queue.remove(), "Remove should return 7");
    }

    @Test
    public void testQueueRemove2() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(9);
        assertEquals(3, queue.remove(), "Remove should return the first item added");
    }

    @Test
    public void testQueuePeek1() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(4);
        assertEquals(4, queue.peek(), "Peek should return 4");
    }

    @Test
    public void testQueuePeek2() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        assertEquals(1, queue.peek(), "Peek should return the front item");
        assertEquals(2, queue.size(), "Peek should not remove an item");
    }

    @Test
    public void testQueueSize1() {
        Queue<Integer> queue = new LinkedList<>();
        assertEquals(0, queue.size(), "New queue should have size 0");
    }

    @Test
    public void testQueueSize2() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.remove();
        assertEquals(1, queue.size(), "Queue size should be 1 after adding two and removing one");
    }
}
