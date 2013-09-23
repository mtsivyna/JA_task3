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


        assertEquals(7, queue.getHeadElement());
        assertEquals(1, queue.getHeadElement());
        assertEquals(4, queue.getHeadElement());
        //assertEquals(0, queue.getHeadElement());

        assertEquals(5, queue.getQueueSize());


    }

    @Test
    public void ExtendQueueTest() {

        ArrayQueue queue = new ArrayQueue(1);
        queue.addElement(1);
        assertEquals(1, queue.getQueueSize());
        queue.addElement(2);
        queue.addElement(3);
        assertEquals(2, queue.getQueueSize());

    }
}
