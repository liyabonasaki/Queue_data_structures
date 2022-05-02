/**
 * @author Liyabona Saki
 * Queue data structure implementation
 */


package cput.ac.za;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        QueueImpl qi = new QueueImpl();

        qi.enQueue(5);
        qi.enQueue(10);
        qi.enQueue(15);
        qi.enQueue(1);
        qi.enQueue(12);

        qi.show(); // shows elements in queue

		qi.deQueue(); //removes elements in queue

        qi.isEmpty(); //check if queue is empty

        qi.isFull(); //checks status of queue

		qi.getSize(); //gets the size of queue


    }

}
