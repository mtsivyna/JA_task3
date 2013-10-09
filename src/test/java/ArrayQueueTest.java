import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Maksym
 * Date: 15.09.13
 * Time: 20:32
 * To change this template use File | Settings | File Templates.
 */
public class ArrayQueueTest {


    /**
     * Current method is used for testing get head element of queue functionality
     * @throws Exception
     */

    // Testing class without extending
    @Test
    public void noExtendQueueTest() throws Exception {

        ArrayQueue queue = new ArrayQueue(5);

        queue.addElement(3);
        queue.addElement(5);
        queue.addElement(7);
        queue.addElement(1);

        assertEquals(3, queue.getHeadElement());
        assertEquals(5, queue.getHeadElement());

        queue.addElement(4);
        queue.addElement(5);

        assertEquals(7, queue.getHeadElement());
        assertEquals(1, queue.getHeadElement());
        assertEquals(4, queue.getHeadElement());
        assertEquals(5, queue.getHeadElement());

        assertEquals(5, queue.getQueueSize());


    }

    // Testing class with extending and without getting head elements
    @Test
    public void ExtendQueueTest() throws Exception {

        ArrayQueue queue = new ArrayQueue(3);

        queue.addElement(1);
        queue.addElement(2);
        queue.addElement(3);
        queue.addElement(4);
        queue.addElement(5);
        queue.addElement(6);
        queue.addElement(7);
        queue.addElement(8);
        queue.addElement(9);

        assertEquals(9, queue.getQueueSize());


    }

    // Testing class with extending and with getting head elements
    @Test
    public void ExtendQueueTest1() {

        ArrayQueue queue = new ArrayQueue(3);

        queue.addElement(1);
        queue.addElement(2);
        queue.addElement(3);

        assertEquals(1, queue.getHeadElement());
        assertEquals(2, queue.getHeadElement());

        queue.addElement(5);
        queue.addElement(5);
        queue.addElement(6);

        assertEquals(4, queue.getQueueSize());


    }

    // Testing of getting not available head elements
    @Test
    public void GetUnAvailableHead() {

        ArrayQueue queue = new ArrayQueue(3);

        queue.addElement(1);
        queue.addElement(2);
        queue.addElement(3);

        assertEquals(1, queue.getHeadElement());
        assertEquals(2, queue.getHeadElement());
        assertEquals(3, queue.getHeadElement());
        assertEquals(0, queue.getHeadElement());

        assertEquals(3, queue.getQueueSize());
    }


}
