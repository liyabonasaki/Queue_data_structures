/**
 * @author Liyabona Saki
 * Queue data structure implementation
 */

package cput.ac.za;


public class QueueImpl {

    int queue [] = new int[5];
    int rear;
    int size;
    int front;
    int data;

    public void enQueue(int data) {

        try {
            queue[rear] = data;
            rear++;
            size++;

        }catch(Exception e) {
            System.out.println("The Queue is full !");
            e.getStackTrace();
        }

    }

    public int deQueue(){

        data = queue[front];

        front++;
        size--;

        return data;
    }

    public int getSize() {
        System.out.println("Size : " + size);
        return size;
    }

    public void isEmpty(){
        try {
            if(size == 0) {
                System.out.println("The Queue is empty");
            }else {
                System.out.println("The Queue have elements inside");
            }

        }catch(Exception e) {
            System.out.println("Sorry something happen!! ");
            e.getStackTrace();
        }

    }

    public void isFull() {
        if(size == 5) {
            System.out.println("The queue is full!");
        }else {
            System.out.println("The queue is not Full! ");
        }
    }

    public void show(){
        for(int i = 0 ; i<size ; i++) {
            System.out.println("Element : " + queue[front+i]);
        }
    }
}
