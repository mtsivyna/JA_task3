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

    // Number of added elements
    int numberOfElements = 1;

    // Queue size
    int queueSize = 1;

    // Creating new array
    ArrayQueue methods = new ArrayQueue(numberOfElements);

    /**
     * Current method used for testing extend queue functionality
     * @throws Exception
     */
    @Test
    public void extendQueueTest() throws Exception {

        // Array initialization
        for (int arraySize = 0; arraySize < numberOfElements; arraySize++) {
            methods.addElement(arraySize);
        }

        // Increase queue length by 3 elements
        methods.extendQueue();

        // Verify that extendQueue method add last 3 elements into the queue
        assertEquals(0, methods.getArrayElement(numberOfElements + 2));
        assertEquals(0, methods.getArrayElement(numberOfElements + 1));
        assertEquals(0, methods.getArrayElement(numberOfElements));
    }

    /**
     * Current method is used for adding elements functionality
     * @throws Exception
     */
    @Test
    public void addElementTest() throws Exception {

        // Case 1. When number of added elements equals to queue size
        if (numberOfElements == queueSize) {

            // Array initialisation
            for (int arraySize = 0; arraySize < numberOfElements; arraySize++) {
                methods.addElement(arraySize);

                // Verify that elements have been stored into the queue
                assertEquals(arraySize, methods.getArrayElement(arraySize));
            }
        }

        // Case 2. When number of added elements less than queue size
        else if (numberOfElements < queueSize) {

            // Array initialisation
            for (int arraySize = 0; arraySize < numberOfElements - 1; arraySize++) {
                methods.addElement(arraySize);

                // Verify that elements have been stored into the queue
                assertEquals(arraySize, methods.getArrayElement(arraySize));
            }

            // Verify that last element in queue equals to 0
            assertEquals(0, methods.getArrayElement(numberOfElements - 1));
        }

        // Case 3. When number of added elements more than queue size
        else {

            // Array initialisation
            for (int arraySize = 0; arraySize < numberOfElements; arraySize++) {
                methods.addElement(arraySize);

                // Verify that elements have been stored into the queue
                assertEquals(arraySize, methods.getArrayElement(arraySize));
            }

            // Adding value (value index = queue size + 1) into the queue
            methods.addElement(numberOfElements);

            // Verify that last value was stored into the first array position
            assertEquals(numberOfElements, methods.getArrayElement(0));
        }
    }

    /**
     * Current method is used for testing get head element of queue functionality
     * @throws Exception
     */
    @Test
    public void getHeadElementTest() throws Exception {

        // Case 1. When number of added elements equals to queue size
        if (numberOfElements == queueSize) {

            // Array initialisation
            for (int arraySize = 0; arraySize < numberOfElements; arraySize++) {
                methods.addElement(arraySize);

                // Verify that last stored value is equals to element returned by getHeadElement method
                assertEquals(methods.getArrayElement(arraySize), methods.getHeadElement());
            }
        }

        // Case 2. When number of added elements less than queue size
        else if (numberOfElements < queueSize) {

            // Array initialisation
            for (int arraySize = 0; arraySize < numberOfElements - 1; arraySize++) {
                methods.addElement(arraySize);

                // Verify that last stored value is equals to element returned by getHeadElement method
                assertEquals(methods.getArrayElement(arraySize), methods.getHeadElement());
            }
        }

        // Case 3. When number of added elements more than queue size
        else {

            // Array initialisation
            for (int arraySize = 0; arraySize < numberOfElements; arraySize++) {
                methods.addElement(arraySize);

                // Verify that last stored value is equals to element returned by getHeadElement method
                assertEquals(methods.getArrayElement(arraySize), methods.getHeadElement());
            }
        }
    }

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
        queue.addElement(9);

        assertEquals(7, queue.getHeadElement());
        assertEquals(1, queue.getHeadElement());
        assertEquals(4, queue.getHeadElement());
        assertEquals(9, queue.getHeadElement());

        assertEquals(5, queue.getQueueSize());



// проверить что размер массива все еще 5
    }
}
