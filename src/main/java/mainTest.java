/**
 * ArrayQueue.java
 * This class describe test for ArrayQueue / ArrayQueueStatic
 * @version    1.1 09/08/13
 * @author     Maksym Tsivyna
 */
public class mainTest {
    /**
     * Running test for ArrayQueue / ArrayQueueStatic
     * @param args
     */
    public static void main(String args []) {
        ArrayQueue methods = new ArrayQueue(4);    // Create object of ArrayQueue class
        /*for (int elementsPosition = 1; elementsPosition <= 7; elementsPosition++) {
            methods.addElement(elementsPosition);
            System.out.println(methods.getElement() + "\n");
        }*/

        methods.addElement(1);

        methods.addElement(2);

        methods.addElement(3);

        methods.addElement(4);

        //methods.extendQueue();
        methods.addElement(5);
        methods.addElement(5);




        System.out.println(methods.getHeadElement() + "\n");
        System.out.println(methods.showArrayElement(3));                 // Show result queue
       /* new ArrayQueueStatic(4);                   // Create object of ArrayQueueStatic class
        for (int elementsPosition = 1; elementsPosition <= 7; elementsPosition++) {
            ArrayQueueStatic.addElement(elementsPosition);
            ArrayQueueStatic.removeElement();
        }
        ArrayQueueStatic.showResultArray();        // Show result queue
    */
    }
}
