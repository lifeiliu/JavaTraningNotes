# Day1 core java
Object Oriented Principles:
===========================
1) Class

2) Object

3) Data Abstraction

4) Data Encapsulation

5) Inheritance

6) Polymorphisam

7) Dynamic Binding

8) Message Passing	


>> Data Security

>> Code Reusability	

>> The Way of coding is very easy and understandable, 
	We can easily corelate to real world scenarios.


1. primary data type and default value
	- java has no garbage values

	byte			0
	short      		0
	int 			0
	long			0
	float			0.0
	double			0.0
	char 
	boolean			false

2. class
	- user defined data type
	- blue print that can pack data members and member methods togather
	- class defination only once, and just a templete does not take any physical memory
3. object 
	- instance of class
		instance is allocating sufficient amount of memory in run time
		using `new` keyword-- Dynamic Memory Allocation Operator
	- real world entity
	===============================
	3.1 state of object
	- the data which is stored in the object member location at the current point of time 
	- object will contain state and behavior. state means data contained by the object, behavior 
	  means what activities can do by the object.
	- init object data 

4. what are different ways of create an object?
    - new operator
    - clone method
    - De-serialization 
    - Class.forName().newInstance
    - factory methods
5. software development process or SDLC
	- Requirment Analysis and gathering 
	  User story
	    - nouns ==> class
	    - abjectives ==> data members 
	    - verbs      ==> member methods
	  e.g.
	  Employee Management Systems

	- Design
		- UI design
		- server side code  PSodu code
		- Database design 
	- code
	- test
	- intergration and mantaining

6. constructors 
   - parameterized and non-parameterized
   - system has a non-parameterized constructor if there is none in class
   

7. this keyword   [greekforgreek] {https://www.geeksforgeeks.org/this-reference-in-java/}

8. static keyword

	8.1 static and instance variable
	8.2 static and instance methods
	8.3 static and instance block
    - instance is object. each and every object are created with its own space in memory
    - for the entire class, it has a common space for static variables, which means the data of static
      variables are shared with all this type objects
    - 

9. Inheritance    *memory allocation when create derived classes*
   - it is suggistable to create an object for Bottom Most Derived Class.
		- Even though we are creating an object for bottom most derived class	
			first memory will be allocated for base class properties and base class methods
			later memory will be reserved for derived class properties and methods.
		- Application Control Always Lies In Derived Class Only.
        - By Using Sub Class Reference 
            We Can Access Base Class Properties And Base Class Methods
            As Well As Sub Class Properties And Sub Class Methods.
            Vice Versa Relation Not Possible.
	9.1 super
	 - variable level 
	 - method level 
	 - construction level
10. final 
	 - variable level 
	 - method level 
	 - Class level
11. signleton 
12. SE time  software engineering

====     Types Of Relations In Java:
                                        OOAD
        - IS A Relationship        >> Generalization ===> Inheritance
        
        - part of relationship  >> composition    high dependant on each other
            The composition is the strong type of association. An association is said to composition if an Object owns another object and another object cannot exist without the owner object. Consider the case of Human having a heart. Here Human object contains the heart and heart cannot exist without Human.

        - HAS A Relationship       >> Aggregation
            Aggregation is a weak association. An association is said to be aggregation if both Objects can exist independently. For example, a Team object and a Player object. The team contains multiple players but a player can exist without a team.
            a class _has a list of_ other class's objects.
            e.g. a department **has a list of **students
                 a school **has a list of** departments

        - USES A Relationship      >> Association     
            two classes are used in the third class.          
[more about composition/ aggregation and association]{https://www.geeksforgeeks.org/association-composition-aggregation-java/}


========================================================
Software Development Process
1. Agile
        - sprint
            - product backlog
            - sprint backlog
            - sprint review meeting / week
            - sprint interspection meeting / after sprint release
            - Daily standup meeting
               - what did i do yestoday
               - what am i doing today
               - any issues I stuck in
2. Task Management
   - PM/TL assigning a task:
     - when can you deliver?
     - i need this by 2 weeks
     - can you start research on this, we will take it up by 2 months
3. Testing tpyes;
    - Unit Testing   -DEV
    - Smoke / ADHoc testing 
        randomly doing something on url, just do the clicks. if any page has exceptions, then the system fails. at the very high level, doesn't know anything with the system
        this is smoke testing.

    - SIT -QA/BA
    - Regression Testing
    - UAT
    - Load/proformance test
    - PROD testing
4. Team Members
    - PM
    - Architect
    - DEV
        -Back-end
        Full-stack
        UI
    QA
        -manual testers
        - Automation testers
    BA
    DBA
    UX
5. Review meeting
    - senior developer meet every week? risk evaluate? release date? track all activities with PM softwares. 
  introspection 
    - bug report, all people meet, 

6. code quality test 
    - your code should pass 95% test. 

how the industry agrees from all SDLC model to Agile?
- need of customer and tech evention
- what is water fall like?   interaction with customer once few month.  <2000
- business e-commence retail stores have more and more customers, they want different expectations of different group users. they want to grow their business.  
- within Agile, 1-2 weeks have something delivery to customer.
- problems of Agile:  interaction between developer and customer is huge. 1 side good, understand better. other side, they interrupts and change their idea frequently. 
- how to deal? project manager needs to strong, they should say no properly, in a smart way. developer needs to say no to manager also, needs to know own limitation. 
- client always having many software vendors, they want the best. perform not good? fired.
- PM walk to you hand you a task, ask you how much time you can finish?
   a smart answer is, I need some time to understand, talk with XX, gather info, I will come to you let you know.
- SIT system intergration Testing
   developer delivery to QA
   unit test needs to do while developing.
   inter-midterm relese => testing 
   continuous developing with bug fix, at the end of the sprint. 
- what i did yesteday, what's my plan today, other tech issue.
- everyday update your work to manager. 9pm everyday. happy ending email
  on Friday, has some issue. report friday, told manager you are resarching on it, and give update on monday.
  on Monday, tells need help, happy manager!

  QA knows the whole system, if don't understand business domain , ASK BA then QA

  Question: 
  As a developer, you r handed a task and YOU know it is completely new for you. how to handle this situation?
    - research first, collect all information. what is you known and don't know. talk with people, need help, and am i in the right direction, REMEBER TO SEND THANK YOU IN PERSON AND IN EMAIL.
      ATTITUTE MATERS A LOT!