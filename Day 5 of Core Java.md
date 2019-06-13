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
    