##Day 5 of Core Java

###Comparable vs Comparator in Java
[Reference](https://www.geeksforgeeks.org/comparable-vs-comparator-in-java/)

compareable needs to implement in the Class you want to compare, need to override its comparetO() methods. one class could only have one order.
if want to have more than one way of comparing objects in one class, needs to define a seperate class to do this camparing job, which class needs to implements comparator, and override its compare() method. when its come to order objects, use Collections.sort(list,comparator), which takes comparator as second parameter. 
example code:
`//A Java program to demonstrate Comparator interface 
import java.io.*; 
import java.util.*; 

// A class 'Movie' that implements Comparable 
class Movie implements Comparable<Movie> 
{ 
    private double rating; 
    private String name; 
    private int year; 

    // Used to sort movies by year 
    public int compareTo(Movie m) 
    { 
        return this.year - m.year; 
    } 

    // Constructor 
    public Movie(String nm, double rt, int yr) 
    { 
        this.name = nm; 
        this.rating = rt; 
        this.year = yr; 
    } 

    // Getter methods for accessing private data 
    public double getRating() { return rating; } 
    public String getName() { return name; } 
    public int getYear()     { return year; } 
} 

// Class to compare Movies by ratings 
class RatingCompare implements Comparator<Movie> 
{ 
    public int compare(Movie m1, Movie m2) 
    { 
        if (m1.getRating() < m2.getRating()) return -1; 
        if (m1.getRating() > m2.getRating()) return 1; 
        else return 0; 
    } 
} 

// Class to compare Movies by name 
class NameCompare implements Comparator<Movie> 
{ 
    public int compare(Movie m1, Movie m2) 
    { 
        return m1.getName().compareTo(m2.getName()); 
    } 
} 

// Driver class 
class Main 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<Movie> list = new ArrayList<Movie>(); 
        list.add(new Movie("Force Awakens", 8.3, 2015)); 
        list.add(new Movie("Star Wars", 8.7, 1977)); 
        list.add(new Movie("Empire Strikes Back", 8.8, 1980)); 
        list.add(new Movie("Return of the Jedi", 8.4, 1983)); 

        // Sort by rating : (1) Create an object of ratingCompare 
        //               (2) Call Collections.sort 
        //               (3) Print Sorted list 
        System.out.println("Sorted by rating"); 
        RatingCompare ratingCompare = new RatingCompare(); 
        Collections.sort(list, ratingCompare); 
        for (Movie movie: list) 
            System.out.println(movie.getRating() + " " + 
                            movie.getName() + " " + 
                            movie.getYear()); 


        // Call overloaded sort method with RatingCompare 
        // (Same three steps as above) 
        System.out.println("\nSorted by name"); 
        NameCompare nameCompare = new NameCompare(); 
        Collections.sort(list, nameCompare); 
        for (Movie movie: list) 
            System.out.println(movie.getName() + " " + 
                            movie.getRating() + " " + 
                            movie.getYear()); 

        // Uses Comparable to sort by year 
        System.out.println("\nSorted by year"); 
        Collections.sort(list); 
        for (Movie movie: list) 
            System.out.println(movie.getYear() + " " + 
                            movie.getRating() + " " + 
                            movie.getName()+" "); 
    } 
} 
`
### differences array and collection

                array                      Collection
        Fixed in size                   growable
        memory       not recommend                 recommend
        performence     recommend            not recommend   
        only homogeneous                    both    
        no data structure                   having   ds
        primitive and object                only object
### difference collectin and Collections
        + Collection is an interface which can be used to represent a group of individual objects as a single entity
        + Collections is an utility class present in java.util.package to define several utility methods(e.g. Sorting, Searching..) for collection objects
### difference List and Set
        List allow depulicates and preserve insertion order.
        Set  don't allow depulicates and don't preserve insertion order
### 9 key interfaces of collection
   1.   Collection:  root interface in collection framework. contains most  common methods that applicable for any collection object
   2.   List: child interface of collection, has implemented class(ArrayList,Linked List and Vector--stack).
        when to use? allow depulicates and preserve insertion order.
   3.  set: child interface if collection.has implemented class(hashset--linked hashset(1.4v))
        when to use? don't allow depulicates and don't preserve insertion order.
    4. sorted Set: child interface of set
        when to use? don't allow depulicates and don't preserve insertion order.but all objectts should be inserted arrcording to some sorting order
    5. NavigableSet: child interface of SortedSet. defines several methods for navigation purposes. implemented class -> TreeSet
    6. Queue: Child interface if Collection. a grop of objects prior to processing. e.g. email send list. (FIFO)
    7. has implemented class(PriorityQueue, BlockingQueue->(Linked Blocking Queue and PriorityBlockingQueue))
    *All these above interfaces (Collection,List,Set,SortedSet, NavigableSet and Queue) are for individual objects, IF we want key-value pairs, should go for Map*
    
  Map (not clild interface of collection, group of individual key value paris, key no dupulicate, values could. implemented class: HashMap->LinkedHashMap, )
    8. SortedMap: clild of Map. group of key-value pairs according to some order
    9. NavigableMap: child of sortedMap. implemented class TreeMap

### Collection Interface:
        - represent a group of individual objects as a single entity
        - Collection can be considered as root interface of Collection framework
        - to hold and transfer Objects, all Collection implements Serializable and Cloneable interface
        - Defines most common methods that are applicable for any collection object
        - add(Object o)/ addAll(Collection c)
        - remove(Object)/ removeAll(Collection c)
        - clear()
        - retainAll(Collection c)
        - isEmpty()
        - size()
        - contains()/ containsAll()
        - Object[] toArray()
        - Iterator iterator()
### List(I)
    index plays an important role in List: check dupulicate and preserve insertion order.
    - add(int index, Object o) /addAll(int index, Collection c) define the position to add
    - remove(int index)/ get(int index)/ Set(int index, Object o)
    - Object indexOf(A) / lastIndexOf(A)
    - listInterator()
### ArrayList(Class)
    - Resizable array
    - Duplicate allowed
    - Insertion Order
    - Heterogeneous     Object 
        but TreeSet, TreeMap have to be homogeneous, because they have to compare one to others in order to keep a proper order
     - null insertion is possible
     - constuctions
        1. ArrayList l = new ArrayList();
            new Capacity = (current capaciyu * 1.5)+1  default 10
        2. ArrayList l = new ArrayList(int initialCapacity)
        3. ArrayList l = new ArrayList(Collection c)
     - ArrayList and Vector implements RandomAccess interface, so we can accessrandom element with same speed
     - ArrayList is best choice if frequent operation is retrival operation
        IS worst choice if frequent operation is insertion or deletion in the middle(bec several shift are required)
### LinkedList(Class)
    - double link list
    - insertion order easy
    - duplicate allowed
    - heterogeneous allowed
    - null allowed
    - implemented serializable and clonable, but no RandomAccess
    - best -> frequent operation is insertion/ deletion
    - worst -> frequent is retrieval
    - methods
        addFirsst() / addLast()
        getFirst() / getLast()
        removeFirst() / removeLast()
    - Constructors
        LinkedList l = new LinkedList()
        LinkedList l = new LinkedList(Collection c)
### Vector(C)
    - Resizable array
    - Duplicate allow
    - Insertion order perserved 
    - null allowed
    - Heterogeneous
    - Serilizable and cloneable
    - RandomAccess
    - Synchronized Thread Safe 
    - best for data retrieval
    - Constructors:
        Vector v = new Vector()  10 default capacity new cpacity = 2*cc
        Vector v = new Vector(int initCapacity)
        Vector v = new Vector(int initCapacity, int incrementalCapacity)
        Vector v = new Vector(Collection c)
### Set (I)
    - Child of Collection
    - duplicates not allowed and insertion order not preserved
    - doesn't contain new methods. all from collection interface

### HashSet(C)
    - Hashtable
    - Duplicate not allow,if add duplicate, add() method return false
    - insertion order not perserved
    - Heterogeneous allow
    - null insertion allowed
    - serializable and cloneable not randomAccess
    - best choice for search operation
    - Constructors (HashSet, LinkedHashSet, HashMap, LinkedHashMap,WeakHashMap,Hashtable  all Hash Based have same constructors)
        HashSet hs = new HashSet(); 16 init size, FillRatio:0.75
        HashSet hs = new HashSet(int initCapa); load factor: 0.75
        HashSet hs = new HashSet(int initCapa, float loadFactor)
        HashSet hs = new HashSet(Collection c)
        load Factor/Fill Ratio: after reach this ratio, new Hash set will created

### LinkedHashSet(C)
    - Dupilate not allowed but insertion order perserved
    - hashtable + linked list
    - introduced in 1.4
    - best choice for developing cache based applications, where duplicate not allowed but insertion order must be perserved

### SortedSet(I)
    - Child of Set
    - having some sorting order
    - specific methods:
        + first()
        + last()
        + headSet(object o) o not included in 
        + tailSet(Object o) o is included
        + subset(Object o1, Object o2) contains o1, not containing o2
        + comparator()
            returns Comparator object that describes underlying sorting technique.  
    - default natural sorting order. comparator() returns null in this case
        numbers： anceding
        Strings: alphabetacl
### TreeSet(C)
    1. balanced tree -- underlying data structure
    2. duplicate not allowed
    3. Insertion order not
    4. Sorting order having
    5. Heterogeneous not support throw ClassCastException
    6. null allowed but only once
    7. constructors
        TreeSet ts = new TreeSet()
            default natural sorting
        TreeSet ts = new TreeSet(Comparator c) 
            customized sorting order
        TreeSet ts = new TreeSet(Collection c)
        TreeSet ts = new TreeSet(SortedSet s)
    8. null insertion
        for empty TreeSet as the first element null insertion is possible. but after inserting that null, any insertion will cause NullPointerException.
        for any non empty treeSet, null can not insert, will have NullPointerException
    9.  ClassCastException (CCE for short)
        + if we are depanding on default natural sorting order then objects should be homeogeneous and camparable. otherwise will get CCE 
        + an object is comparable iff the corresponding class implements java.long.comparable interface
        + String and all wrapper class already implements comparable interface. but StringBuffer does not.
### Comparable(I)
    1. java.lang
    2. public int compareTo(Object obj)
        obj1.compareTo(obj 2){
            return negetive iff obj1 come before obj2
            return postive iff obj1 come after obj2
            return 0 iff obj1 == obj2
    3. example:
        TreeSet t = new TreeSet()
        t.add("b");     
        T.add("z");         // z.compareTo("b") ==> + value
        t.add("a");         // a.compareTo('b') ==> - value
        syso(t)             // [a,b,z]
    4. having customized sorting order by using Comparator
    5. Comparable used for default Natural Sorting order whereas Comparator used for customerized Sorting order.
### Comparator(I)
    1. custormized sorting order
    2. java.util
    3. defines two methods: compare() and equal()
        public int compare(objet obj1, Object obj2){
            return -ve iff obj1 before obj2
            return +ve iff obj1 after obj2
            return 0 iff equal
        }
        public boolean equal()
        however, when we implement Comparator interface, only compare() method is mandatory to override. equal is optional
        e.g.
        `class MyComparator implements Comparator{
                compare(){}
            } `
### integer object into treeSet in descending order
`   
    Class myComparator implements Comparator{
        public int compare(Object obj1, Object obj2){
            Integer i1 = (Integer) obj1;
            Integer i2 = (Integer) obj2;
            return i2 - i1;
            // return +1; always insert after, keep insertion order
            // return -1; revse insert order
            //return 0 ; only keep first one
            // return i1.compareTo(i2) increasing order
            //return -i1compareTo(i2) decresing order
            // return i2.compareTo(i1) decreasing order
        }
    } 
    TreeSet t = new TreeSet(new MyComparator());
`

