/**
 * ArrayQueue.java
 * This class describe test for ArrayQueue / ArrayQueueStatic
 * @version    1.1 09/08/13
 * @author     Maksym Tsivyna
 */
public class ArrayQueueTest {

    /**
     * Running test for ArrayQueue / ArrayQueueStatic
     * @param args
     */
    public static void main(String args []) {

        ArrayQueue methods = new ArrayQueue(5);   // Create object of ArrayQueue class

        for (int elementsPosition = 1; elementsPosition <= 7; elementsPosition++) {
            methods.addElement(elementsPosition);
            methods.removeElement();
        }

        methods.showResultArray();                 // Show result queue

        new ArrayQueueStatic(4);                   // Create object of ArrayQueueStatic class

        for (int elementsPosition = 1; elementsPosition <= 7; elementsPosition++) {
            ArrayQueueStatic.addElement(elementsPosition);
            ArrayQueueStatic.removeElement();
        }

        ArrayQueueStatic.showResultArray();         // Show result queue
    }
}
