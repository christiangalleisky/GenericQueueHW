package edu.gcccd.csis;


import java.util.ArrayList;
import java.util.Arrays;

public class GenericQueue<E> {

    private ArrayList<E> elements;

    public GenericQueue() {
        this.elements = new ArrayList<>();
    }

    public GenericQueue(E[] elements) {
        this.elements = new ArrayList<>(Arrays.asList(elements));
    }

    /**
     * Takes the element at index 0 off the ArrayList that makes up the Queue.
     * @return Returns a String.
     */
    public <E> Object dequeue(){
        Object r = this.elements.remove(0);
        return r;
    }

    /**
     * Adds to the highest index in the ArrayList that makes up the Queue.
     * @param element takes any object as an argument.
     */
    public void enqueue(E element) {
        this.elements.add(element);
    }

    // current length of the queue
    public int length() {
        return elements.size();
    }

    /**
     * Accessor for class GenericQueue.
     * @return returns the only member of the class, elements.
     */
    public ArrayList getElements(){
        return this.elements;
    }
}
