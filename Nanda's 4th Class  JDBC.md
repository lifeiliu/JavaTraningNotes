#Nanda's 4th Class  JDBC

##SQL

###Constraints:
	- PK			A combination of a NOT NULL and UNIQUE. Uniquely identifies each row in a table
	- FK			Uniquely identifies a row/record in another table
	- Index			Used to create and retrieve data from the database very quickly
	- Unique		Ensures that all values in a column are different
	- Composite		
	- Not Null 		Ensures that a column cannot have a NULL value

###Tables and Views
    A table contains data, a view is just a SELECT statement which has been saved in the database (more or less, depending on your database).
    The advantage of a view is that it can join data from several tables thus creating a new view of it. Say you have a database with salaries and you need to do some complex statistical queries on it.Instead of sending the complex query to the database all the time, you can save the query as a view and then SELECT * FROM view
### Cursors



#docker command
## docker pull -->download images
## docker images -->find images 
## docker run -it -d imageid   -->run the image
## docker ps  -->find containers 
## docker exec -it container-id bash -->execute the container
## docker login  -->login 
## docker tag imageid uername/tagname
## docker push username/tagname
