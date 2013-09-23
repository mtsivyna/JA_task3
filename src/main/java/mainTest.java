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

        System.out.println(methods.getHeadElement());
        System.out.println(methods.getHeadElement());
        System.out.println(methods.getHeadElement());
        System.out.println(methods.getHeadElement());

        methods.addElement(5);
        methods.addElement(6);
        methods.addElement(7);

        System.out.println(methods.getHeadElement());
        System.out.println(methods.getHeadElement());
        System.out.println(methods.getHeadElement());
        methods.addElement(5);
        methods.addElement(6);
        methods.addElement(7);
        System.out.println(methods.getHeadElement());
        System.out.println(methods.getHeadElement());
        System.out.println(methods.getHeadElement());
        //System.out.println(methods.getHeadElement());


        //}

       new ArrayQueueStatic(4);                   // Create object of ArrayQueueStatic class

            ArrayQueueStatic.addElement(1);
        ArrayQueueStatic.addElement(2);
        ArrayQueueStatic.addElement(3);
        System.out.println("----" + ArrayQueueStatic.getHeadElement());
        System.out.println("----" + ArrayQueueStatic.getHeadElement());
        System.out.println("----" + ArrayQueueStatic.getHeadElement());
        ArrayQueueStatic.addElement(4);
        ArrayQueueStatic.addElement(5);
        ArrayQueueStatic.addElement(6);

        System.out.println("----" + ArrayQueueStatic.getHeadElement());
        System.out.println("----" + ArrayQueueStatic.getHeadElement());
        System.out.println("----" + ArrayQueueStatic.getHeadElement());

    }
}
