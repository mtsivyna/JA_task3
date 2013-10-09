/**
 * ArrayQueue.java
 * This class describe test for ArrayQueue / ArrayQueueStatic
 * @version    1.1 09/08/13
 * @author     Maksym Tsivyna
 */
public class mainTest {
    /**                                                             +
     * Running test for ArrayQueue / ArrayQueueStatic
     * @param args
     */
    public static void main(String args []) {


        ArrayQueue methods = new ArrayQueue(3);    // Create object of ArrayQueue class
        /*for (int elementsPosition = 1; elementsPosition <= 7; elementsPosition++) {
            methods.addElement(elementsPosition);
            System.out.2println(methods.getElement() + "\n");
        }*/

        methods.addElement(1);
        methods.addElement(2);
        methods.addElement(3);
        System.out.println("- "+methods.getHeadElement());
        System.out.println("- "+methods.getHeadElement());




        //









    }
}
