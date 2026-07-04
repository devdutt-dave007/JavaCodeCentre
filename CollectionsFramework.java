import java.util.*;
public class CollectionsFramework {
    public static void main(String[] args) {
//Collections is a set of classes and interfaces that provide a standardized way to work with collections of objects.
//the main purpose of collections is to store and manipulate a group of objects in a uniform manner.

//1. ArrayList: ArrayList is a class in java that implements the List interface.

        //Creating an ArrayList

        ArrayList<String> names = new ArrayList<>();//without any argument
        ArrayList<String> names1 = new ArrayList<>(Arrays.asList("John", "Jane", "Bob"));//with an argument
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        System.out.println(names);//[John, Jane, Bob]
        System.out.println(names1);//[John, Jane, Bob]

        //Methods of ArrayList

        //1.add() : adds only one element to the end of the ArrayList
        names.add("Alice");
        System.out.println(names);//[John, Jane, Bob, Alice]

        //2.addAll() : adds multiple elements of the specified Collection to the end of the ArrayList
        names.addAll(Arrays.asList("Emily", "David"));
        System.out.println(names);//[John, Jane, Bob, Alice, Emily, David]

        //3.remove() : removes the first occurrence of the specified element from the ArrayList
        names.remove("Jane");
        System.out.println(names);//[John, Bob, Alice, Emily, David]

        //4.removeIf() : removes all elements from the ArrayList that satisfy the given predicate
        names.removeIf(name -> name.startsWith("J"));//removes all elements that start with 'J'
        System.out.println(names);//[Bob, Alice, Emily, David]

        //5.clear() : removes all elements from the ArrayList
        names.clear();
        System.out.println(names);//[]

        //6.size() : returns the number of elements in the ArrayList
        System.out.println(names.size());//0

        //7.isEmpty() : checks if the ArrayList is empty
        System.out.println(names.isEmpty());//true

        //8.contains() : checks if the ArrayList contains the specified element
        System.out.println(names1.contains("Bob"));//true

        //9.indexOf() : returns the index of the first occurrence of the specified element in the ArrayList
        System.out.println(names1.indexOf("Bob"));//2

        //10.lastIndexOf() : returns the index of the last occurrence of the specified element in the ArrayList
        System.out.println(names1.lastIndexOf("Bob"));//2

        //11.get() : returns the element at the specified index in the ArrayList
        System.out.println(names1.get(2));//Bob

        //12.set() : sets the element at the specified index in the ArrayList to the specified value
        names1.set(2, "Alice");
        System.out.println(names1);//[John, Jane, Alice]

        //13.toArray() : returns an array containing all the elements in the ArrayList
        String[] namesArray = names1.toArray(new String[names1.size()]);
        for(String name:namesArray)
        {
            System.out.println(name+", ");
        }//John, Jane, Alice,

        //14.sort() : sorts the elements of the ArrayList in ascending order
        names1.sort(null);
        System.out.println(names1);//[Alice, John, Jane]

        //15.reverse() : reverses the order of the elements in the ArrayList
        System.out.println(names1.reversed());//[John, Jane, Alice]

        //16.subList() : returns a view of the portion of the ArrayList between the specified startIndex and endIndex (exclusive)
        System.out.println(names1.subList(1, 3));//[Jane, John]

        //17.clone(): returns a shallow copy of the ArrayList
        ArrayList<String> names2 = (ArrayList<String>) names1.clone();
        System.out.println(names2);

        //18.Iterator: Iterator is an interface that provides a way to iterate over a collection of elements.
        Iterator<String> it = names1.iterator();
        while(it.hasNext())//hasNext() checks if there are more elements to iterate over
        {
            System.out.println(it.next());//next() returns the next element in the collection
        }

//2.LinkedList: LinkedList is a class in java that implements the List interface.
        //Creating a LinkedList
        LinkedList<String> cars = new LinkedList<>();//without any argument
        LinkedList<String> cars2 = new LinkedList<>(Arrays.asList("BMW", "Mercedes", "Toyota"));//with an argument
        cars.add("BMW");
        cars.add("Mercedes");
        cars.add("Toyota");
        System.out.println(cars);//[BMW, Mercedes, Toyota]
        System.out.println(cars2);//[BMW, Mercedes, Toyota]

        //Methods of LinkedList

        //1.add() : adds only one element to the end of the LinkedList
        cars.add("Volkswagen");
        System.out.println(cars);//[BMW, Mercedes, Toyota, Volkswagen]

        //2.addAll() : adds multiple elements of the specified Collection to the end of the LinkedList
        cars.addAll(Arrays.asList("Ford", "Audi"));
        System.out.println(cars);//[BMW, Mercedes, Toyota, Volkswagen, Ford, Audi]

        //3.remove() : removes the first occurrence of the specified element from the LinkedList
        cars.remove("BMW");
        System.out.println(cars);//[Mercedes, Toyota, Volkswagen, Ford, Audi]
        //4.addFirst() : adds the specified element to the beginning of the LinkedList
        cars.addFirst("Honda");
        System.out.println(cars);//[Honda, Mercedes, Toyota, Volkswagen, Ford, Audi]

        //5.addLast(): adds the specified element to the end of the LinkedList
        cars.addLast("Hyundai");
        System.out.println(cars);//[Honda, Mercedes, Toyota, Volkswagen, Ford, Audi, Hyundai]

        //6.getFirst(): returns the first element of the LinkedList
        System.out.println(cars.getFirst());//Honda

        //7.getLast(): returns the last element of the LinkedList
        System.out.println(cars.getLast());//Hyundai

        //8.removeFirst(): removes the first element of the LinkedList
        cars.removeFirst();
        System.out.println(cars);//[Mercedes, Toyota, Volkswagen, Ford, Audi, Hyundai]

        //9.removeLast(): removes the last element of the LinkedList
        cars.removeLast();
        System.out.println(cars);//[Mercedes, Toyota, Volkswagen, Ford, Audi]

        //Note:
        // These methods come from the Queue interface.
        // They are preferred over add(), remove(), and element()
        // when using LinkedList as a Queue.

        //10.offer() : inserts the specified element at the end of the queue.
        //Returns true if the insertion succeeds.
        cars.offer("Kia");
        System.out.println(cars);//[Mercedes, Toyota, Volkswagen, Ford, Audi, Kia]

        //11.poll(): removes the first element of the LinkedList if it is not empty, otherwise returns null
        cars.poll();
        System.out.println(cars);//[Toyota, Volkswagen, Ford, Audi, Kia]

        //12.peek(): returns the first element of the LinkedList without removing it, or null if the LinkedList is empty
        System.out.println(cars.peek());//Toyota
        System.out.println(cars);//[Toyota, Volkswagen, Ford, Audi, Kia]
        //13.element(): returns the first element of the LinkedList without removing it,
        //or throws NoSuchElementException if the LinkedList is empty
        System.out.println(cars.element());//Toyota

//3.vector: Vector is a class in java that implements the List interface.it is a FIFO (First In First Out) data structure.
        //Creating a Vector
        Vector<String> fruits = new Vector<>();//without any argument
        Vector<String> fruits2 = new Vector<>(Arrays.asList("Apple", "Banana", "Orange"));
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        //Methods of Vector

        //addElement(): adds the specified element to the end of the Vector
        fruits.addElement("Mango");
        System.out.println(fruits);//[Apple, Banana, Orange, Mango]

        //elementAt(): returns the element at the specified index in the Vector
        System.out.println(fruits.elementAt(2));//Orange

        //firstElement(): returns the first element of the Vector
        System.out.println(fruits.firstElement());//Apple

        //lastElement(): returns the last element of the Vector
        System.out.println(fruits.lastElement());//Mango

        //removeElement(): removes the first occurrence of the specified element from the Vector
        fruits.removeElement("Banana");
        System.out.println(fruits);//[Apple, Orange, Mango]

        //removeElementAt(): removes the element at the specified index from the Vector
        fruits.removeElementAt(1);
        System.out.println(fruits);//[Apple, Mango]

        //setElementAt(): sets the element at the specified index to the specified value
        fruits.setElementAt("Grapes", 1);
        System.out.println(fruits);//[Apple, Grapes]

        //capacity(): returns the current capacity of the Vector
        System.out.println(fruits.capacity());//10

//4.Stack: Stack is a class in java that implements the Stack interface.it is a LIFO (Last In First Out) data structure.
        //Creating a Stack
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack);

        //Methods of Stack
        //push(): adds the specified element to the top of the Stack
        stack.push("D");
        System.out.println(stack);//[A, B, C, D]

        //pop(): removes the element from the top of the Stack
        System.out.println(stack.pop());//D
        System.out.println(stack);//[A, B, C]

        //peek(): returns the element at the top of the Stack without removing it
        System.out.println(stack.peek());//C
        System.out.println(stack);//[A, B, C]

        //search(): returns the index of the first occurrence of the specified element in the Stack, or -1 if the element is not found
        System.out.println(stack.search("A"));//2
        System.out.println(stack.search("X"));//-1

        //empty(): checks if the Stack is empty
        System.out.println(stack.empty());//false

//5.PriorityQueue: PriorityQueue is a class in java that implements the Queue interface.it is a priority queue,
//which means that the elements are sorted according to their priority.
        //Creating a PriorityQueue
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("A");
        priorityQueue.add("C");
        priorityQueue.add("B");
        System.out.println(priorityQueue);//[A, C, B]

        //Methods of PriorityQueue
        //offer(): inserts the specified element into the PriorityQueue.
        priorityQueue.offer("D");
        System.out.println(priorityQueue);//[A, C, B, D]

        //poll(): removes the first element from the PriorityQueue if it is not empty, otherwise returns null.
        //Note: This method removes the element with the lowest priority, and after removal it re-orders the PriorityQueue.
        priorityQueue.poll();
        System.out.println(priorityQueue);//[B, C, D]

        //peek(): returns the first element of the PriorityQueue without removing it, or null if the PriorityQueue is empty.
        System.out.println(priorityQueue.peek());//B
        System.out.println(priorityQueue);//[B, C, D]

        //comparator(): returns the comparator used to sort the elements in the PriorityQueue.
        System.out.println(priorityQueue.comparator());//null

//6.ArrayDeque: ArrayDeque is a class in java that implements the Deque interface.it is a double-ended queue.
//Which means that we can add and remove elements from both ends of the deque.
        //Creating an ArrayDeque
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("A");
        deque.add("B");
        deque.add("C");
        System.out.println(deque);//[A, B, C]

        //Methods of ArrayDeque
        //offerFirst()
        //offerLast()
        //pollFirst()
        //pollLast()
        //peekFirst()
        //peekLast()
        //addFirst()
        //addLast()
        //removeFirst()
        //removeLast()
        //push()
        //pop()
         }
}