package src.collections.queue;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class LearnQueue {
    public static void main(String[] args) {
//   Priority Queue
//        Removing added elements in queue depends on priority

//        Creating the queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //        Queue<Integer> pq = new PriorityQueue<>(); we can also
//        default size of priority queue is 11.
//        Priority queue has head at start and tail at end
//        Deletion can be done from head /Start
//        Insertion can be done from tail/end.

//        Adding the elements   -> offer, add
        pq.add(8);
        pq.offer(2);
        pq.offer(3);
        pq.add(9);

//        note :- Priority queue is not maintain sorted order internally.
//                but head is the highest priority element.
//        In Integers, we have the lowest number have the highest priority. so head will be the lowest number.
        System.out.println(pq);

//        Retrieval of element  -> peek
//        we can only retrieve head element only in priority queue
//        In empty queue we get peek value is null
        System.out.println(pq.peek());

//        Remove the element    -> poll, remove
//        poll will remove the head the element
//        we call poll on empty queue it removes the null
//        if you call the remove throws the exception
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

//       Verify / To check element is present or not
        System.out.println(pq.contains(8));

//        we want iterator queue
//        If we use foreach it will not consider the priority just it will iterate on queue
        for ( Integer integer: pq){
            System.out.println(integer);
        }

//      because of that we use the while loop
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

//    To get size
        System.out.println(pq.size());
//    To clear total queue
        pq.clear();

//     To mention the priority we use comparator specially for objects
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());

//        Array Deque
//        default size of  array deque is 17.
//        Array Deque queue has head at start and tail at end
//        Deletion & Insertion can be done from both head & tail
//        It follows the insertion order.

        ArrayDeque<String> ad = new ArrayDeque<>();

//        Adding the elements   -> offer, offerFirst, offerLast, add , addFirst, addLast
        ad.add("pavan");
        ad.addFirst("aparna");
        ad.addLast("nikhil");
        ad.offer("Divyash");
        ad.offerFirst("snehal");
        ad.offerLast("shubham");

        System.out.println(ad);

//        Retrieval of element  -> peek, peekFirst, peekLast
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());


//        Remove the element    -> poll, pollFirst, pollLast, remove , removeFirst, removeLast

//        all priority methods can be performed by array deque

//        LinkedList
        LinkedList<String> ad1 = new LinkedList<>();
        ad1.add("pavan");
        ad1.addFirst("aparna");
        ad1.addLast("nikhil");
        ad1.offer("Divyash");
        ad1.offerFirst("snehal");
        ad1.offerLast("shubham");
        System.out.println(ad1);
    }
}
