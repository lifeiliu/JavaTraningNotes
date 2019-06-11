# Day 3 String, 
### String and StringBuffer -API
1.1 java.lang.String
    - String is final class
    - String objects immutable
    - exact charcters Memory
1.2 java.lang.StringBuffer
    - StringBuffer Objects Are mutable
    - 16 Additional Charachers Memory
        sb.capacity() 
    - StringBuffer Methods Are ThredSafe
1.3 java.lang.StringBuilder
    -  StringBuilder exactly similar to StringBuffer, only difference is
        that StringBuilder is not threadsafe.
1.4 java.lang.StringTokenizer
1.5 different ways to create String object?
    - around 15 constructors in String class
    - what is different in create constructor and literay approch 
    - new String s = new String("Java")
        and String s = "Java" 
    - difference in  String constant pool, which is a special place where the collection of references to string objects are placed. 
    - if using same String literal, there reference are pointing to same physical memory in the String constant pool.
    e.g. `public class StringConstantPool {
                public static void main(String[] args) {
                    String s = "prasad";
                    String s2 = "prasad";
                    System.out.println(s.equals(s2));    //true
                    System.out.println(s == s2);        //true
                }
            }`
    img: (http://www.thejavageek.com/wp-content/uploads/2013/06/StringLiteralsReferred.png)
    - when using constructor, create a object in String constant pool, even create same String Value. 
    e.g. 
    `public class StringConstantPool {
            public static void main(String[] args) {
                String s = "prasad";
                String s2 = new String("prasad");
                System.out.println(s.equals(s2));       //true
                System.out.println(s == s2);            //false   
            }
        }`

    [a good article on his](http://www.thejavageek.com/2013/06/19/the-string-constant-pool/)
    
    1.6 intern() Method? [reference](https://www.geeksforgeeks.org/interning-of-string/)
    String.intern() is a method of storing only one copy of each distinct String Value, which must be immutable.By applying String.intern() on a couple of strings will ensure that all strings having the same contents share the same memory.
    1.7 char charAt(int)  
        - String trim() elimiating white space in the begin and end
        - String toLowerCase()/toUpperCase()
        - char[] toCharArray()

        - String subString(start) from start position to end
        - String subString(start, end) 
        - String[] split(reg exp)
        - matchs(reg exp)
        - indexof() lastIndexOf() 
            can also search for a String,and point start search pos
        - startsWith()/endsWith()
        - valueOf()  interview questin: hava a float value, how to parse to String value. static method: String.valueOf(anyType)
        
        need to remember String, Date, Calender, StringBuffer,
        Collections API methods! 
        *important to practise, important for business logic*
        using equals to compare StringBuffer and a String
        will return false. bcz differnt type. how to compare content
        string.contentEquals(stringBuffer)
        - string.replace("regEx","replacement")

    ### Java.Util.*
         Date              ===> depricated
         Calender          ===> abstract class
         GreogorianCalender===> concrete Class 
         StringTokenizer
         Random
         Locale
         Scanner

    #### Date & Calender
            how to choose, just desplay date, use Date
            calculate==> Calender
            Date Class
             Months     ==> 0 to 11  ==> 0-Jan, 11-Dec
             Week Days  ==> 0 to 6   ==> 0-Sunday, 6-Saturday
            Calendar Class: 
            Week Days ==> 1 to 7   ==> 1-Sunday, 7-Saturday

            Calender add() and roll() difference:
            add() increase month and year acorrdingly 
            roll() wont change month and year

    #### StringTokenizer

    ### JUNIT 4.0
        Errors:
         - Compile time errors
         - Run time errors          ==> Exception handle 
         - Logical Errors           ==> Testing

        Manual Testing
                ==> Black Box Testing
                    don't know implemention, just know input and output
        Automation Testing
                ==> Selenium
                ==> QTP
                ==> JUNIT (white box testing)

### Collections
Interfaces:
java.util.*
  1. Collection
  2. List
  3. Set
  4. SortedSet
  5. Queue
  6. Iterator
  7. ListIterator
  8. Enumeration
  9. Map
  
Collections Frame Work:

ArrayList al=new ArrayList();

1) Auto Growable and Auto Shrinking entity

2) We are able to store different data type of objects.

3) We are having tested and proven sorting and searching algorithams are in place.

4) If we want to transfer bulk amount of data from one layer 
    to another layer in side of entrepriase applications 
    collections are very useful.

5) Collections Are used as a temporary data bases.


1) Some Collections allows duplicates and 
    some collections doesnt allow duplicates.

2) Some collections store the elements in sorted order some 
    collections stores the elements in random order.

3) Some collections allows multiple null values and 
    some collections doesnt allow multiple null values..

4) Some Collections preserve the insertion order some or not.

========================
2 Types of Collections:
========================

1) Single D Collections

    Elements are added either in row or in column order.

2) Two D Collections

    Elements are added as a key and Value pair

    [ 111   Srinivas    >> Entry

      112   Reddy ]

      Key       Value
      Object    Object

java.util.*

Interfaces:                     Classes:
===========                     =========
1) Collection                   1) LinkedList           11) WeakHashMap

2) List                         2) ArrayList            12) IdentityHashMap

3) Set                          3) Vector               13) Properties

4) SortedSet                    4) HashSet              14) Hashtable

5) Queue                        5) LinkedHashSet        15) ConcurrentHashMap

6) Iterator                     6) TreeSet              16) Dictionary

7) ListIterator                 7) Stack                17) Collections

8) Enumeration                  8) HashMap              18) Arrays

9) Map                          9) TreeMap              etc...

10) SortedMap                   10) LinkedHashMap

11) Comparator

12) NavigableSet

13) NavigableMap

        etc..
1 D Collection:


                        java.util.Collection(I)
                                ||
                                ||
==================================================================================
1) List  [ I ]              2) Set [ I ]                    4) Queue [ I ]
                                ||
                                ||
                            3) SortedSet [ I ]

java.util.Collection:
=======================
1) It is available on top of hierarchy of all the collection framework interfaces.

2) An Object of Collection interface allows us to add duplicates. 
   And Allows us to add multiple null values also.

3) Collection interface object displays the data in random order.

4) Collection interface object allows us to retrieve the data 
    only in forward direction but not in back word direction.
    
5) We are able to add the element at end position only.

===============
List Interface:
===============
*** List Preserves the insertion order.

1) We Can add and remove the elements at any given position

2) Allows us to add duplicate entry's, as well as multiple null values

3) Bi-Directional Entity.

4) This is an ordered collection, i.e here insertion order is preserved.

5) Allows multiple null values

            List
                ===> LinkedList      ====> Good When Ever You Are doing 
                                            freequent add,editions and deletions 
                                            
                ===> ArrayList       ====> ArrayList Performance more
                                            and memory wont wasted  
                
                ===> Vector          ====> Thread Safety
                
===============
java.util.Set:
===============

1)  Set interface object allows us to add the value only at the end.

2)  Set interface object does not allow duplicates.

3)  Set interface object allows display the data in random order.

4)  Set interface object allows retrieving the data in forward direction.

5)  It allows only single null value.

    ===> HashSet Is A Concrete Class Implementation For Set Interface.
    
    ===> LinkedHashSet Is Also A Concrete Class Which 
            Maintains Insertion Order, 
            And it does not allow duplicates, 
            and does not multiple null values.
            
=====================
java.util.SortedSet:
=====================
1)  SortedSet interface object allows us to add the value only at the end.
2)  SortedSet interface object does not allow duplicates.
3)  SortedSet interface object allows display the data in sorted order.
4)  SortedSet interface object allows retrieving the data in forward direction.

    ===> TreeSet Is A Concrete Class Implementation For SortedSet Interface.

    
    public int getSecondSmallestElement(int inputArray[]){
            // Business Logic
            // Duplicates Need To Be Removed
            // Then We Need Sorting
            // Then We Fetch Second Smallest Element
            SortedSet<Integer> myIntSet=new TreeSet<Integer>();
            for(int i=0;i<inputArray.length;i++){
                    myIntSet.add(inputArray[i]);
            }
            Syso(myIntSet);// [1,2,3,10,23,34,45,56,67,90];
    }
    
    int inputArray[]={10,23,34,23,10,3,45,67,2,1,90,56};
    

Collections:

            Server      Servlet Code
Web Application:===================>DepartmentList.java ==> EmployeeDAO==========> Employee Table
            Request
                                    List<EmployeeVO> displayDeptList(int deptNo)
DepartmentSearch.jsp                            {

Dept Number [ 10 ]                              //select *from emp where deptno=10;
                                            while(rs.next())        
[ Submit  ]                 
                                            {   
                                                empVO
                                                list.add(evo);
                                
                                            }
                                    }

1) Collection Varaible Working as a Temporary data base.

Note:
    
If we want to transfer bulk amount of data 
from one layer to another layer will use collection varaible.



Different Ways To Fetch The Data From List:
===========================================

1) Iterator Interface           ==> Forward Directional

2) ListIterator Interface       ==> Forward And Back Ward Directional

3) For Each Loop
etc..

Note:
=====
1) In All The Wrapper Classes
    From Object Class
    
    toString();
    equals();
    hashCode();
    
    Comparable Interface
    
    compareTo();
    
    
 Date, String, StringBuffer class   
        toString();
        equals();
        hashCode();


