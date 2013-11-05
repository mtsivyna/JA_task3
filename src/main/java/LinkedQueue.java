/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 11/5/13
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedQueue {

    private int[] array;            // Array of int elements
    private int storePosition;      // Value store position
    private int removePosition;     // Position of remove array element
    private int size = 0;           // queue size

    public LinkedQueue(int numberOfElements) {

        array = new int[numberOfElements];
    }

    void addElement(Queue c) {
        c.addElement(1);
        c.addElement(2);
        c.addElement(3);
        c.addElement(4);
        c.getHeadElement();
        c.getarray();
        c.getQueueSize();
    }

}
