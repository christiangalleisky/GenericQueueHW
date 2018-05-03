package edu.gcccd.csis;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenericQueueTest {

    @Test
    public void testQueueTailAndHead(){
        GenericQueue a = new GenericQueue(new String[]{"Hello", " out there", " world."});//test of non-default constructor
        assertEquals("Hello", a.getElements().get(0));//test of head position
        assertEquals(" world.", a.getElements().get(a.length()-1));//test of tail position
    }

    @Test
    public void testQueueEnqueue(){
        GenericQueue a = new GenericQueue();
        a.enqueue("Hello");
        assertEquals("Hello", a.getElements().get(a.length()-1));//test shows we add at the point a.length-1
        a.enqueue(" world.");
        assertEquals(" world.", a.getElements().get(a.length()-1));//test shows that we have added still at the point a.length-1
        a.enqueue(5);
        assertEquals(5, a.getElements().get(a.length()-1));//certainly adding at a.length-1
    }

    @Test
    public void testQueueDeque(){
        GenericQueue a = new GenericQueue();
        a.enqueue("Hello out there");//String variable
        a.enqueue(5);//integer variable
        a.enqueue('A');//character variable
        a.enqueue(null);//null variable
        assertEquals("Hello out there", a.dequeue());//FIFO Queue tests
        assertEquals(5, a.dequeue());
        assertEquals('A', a.dequeue());
        assertEquals(null, a.dequeue());
    }

    @Test
    public void testLengthMethod(){
        GenericQueue a = new GenericQueue();
        assertTrue(a.length() == 0);
        a.enqueue(5);
        assertTrue(a.length() == 1);
        a.enqueue(null);
        assertTrue(a.length() == 2);//data structure counts null as a standard variable
    }
}
