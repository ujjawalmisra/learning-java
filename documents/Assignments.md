# Assignments

Note: Please only pickup an assignment that has been allotted by the instructor.

## Assignment-1

Create a class SystemInfo.java in a proper package related to this assignment.

The class should be able to output the following:
1. Name of the current user
2. Home directory of the current user
2. System Memory
3. System CPU/Cores
4. System Disk size
5. OS build
6. OS version


## Assignment-2

Given 2 matrices A, B write neat, clean, reusable functions to:
1. A+B
2. A-B
3. A*B
4. k * (any matrix) ----- where k is a scalar
5. A' ---- compute transpose of any matrix
   
Note: A, B can be any matrices. I should be able to specify any 2 new matrices and call your functions without the need 
of changing anything else except the 2 matrices.

Note: Matrices will be 2-D, but the number of rows and cols can be dynamic.


## Assignment-3

There is an ecommerce company that wishes to manage it's Products through a catalogue. These products should have 
details that can get displayed on their website and mobile applications.
A Product can be of multiple types where each type might have different properties. Let's consider the following types 
of products:
1. Grocery
2. Electronics
   
Personal Care products cannot be returned.
   
Write a class hierarchy to represent the above types of products, along with their next level subtypes, if any. Also 
create few products of each subtype.


## Assignment-4

1. Implement a LRU Cache using Map
2. Use an appropriate data-structure to represent Category hierarchy of an ecommerce site, like Amazon. Allow:
   1. display of the hierarchy, 
   2. search of a category, at least.
    

## Assignment-5

Write a Parser to read a file _f_ that contains git log. The Parser should throw a user-defined checked exception if:
1. The file is not found
2. The file format is not correct as per the git log format
3. If it has incomplete information

Based on a date _d_, identify the statistics for:
1. Total Count of commits by each developer since date _d_
2. Count of commits by each developer since date _d_, for each day
3. List of developers who did not commit anything successively in 2 days
_f_ and _d_ can be passed as arguments from your main method.
   

## Assignment-6

First and foremost, get your basics of relational-databases in place. 
Take this tutorial on [PostgreSQL](https://www.tutorialspoint.com/postgresql/index.htm).


## Assignment-7

Read more about [Docker](https://www.tutorialspoint.com/docker/index.htm).
Go through [Docker Containers](https://github.com/ujjawalmisra/learning-java/blob/main/documents/Assignments-Submission-Guidelines.md).

Now you should be ready to work with PostgreSQL docker.

Additional tasks:
1. Generate 1 million records for students (id, first_name, last_name, mobile)
2. Load these records in the database
3. Create a table with 3 departments (CS, EE, Mech)
4. Assign departments to students randomly through a mapping table.
5. Extract data for students along with their department name in a new file.
6. Check how to reduce the size of the file.
7. Check how to understand how a query will be executed in the database.


## Assignment-8

Read up on OSI layers.


## Assignment-9

Write test cases for StudentService using Mockito for the dependency StudentDao.

Test cases should cover both the methods:
1. Student createStudent(String firstName, String lastName)
2. Student getStudent(Integer id)

and all the rules of their contract.


## Assignment-10

Write the following functionality for Product using [DAO pattern](https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm):
1. findAll
2. findById
3. save -- insert and update
4. deleteById
5. exists

Read the DB configuration from Properties file.


## Assignment-11

Write a Spring-Boot application that has:
1. API for fetching all Categories
2. API for fetching all Products
3. API for fetching all Products in a given Category
   
Start with a Hello-World API to test whether your application is up and accessible.
   
Next add the stubs for above APIs and check them incrementally.
   
Next add Services, DAOs and DB.
   
Write test cases for Controllers, Services, DAOs.
   
Use appropriate logging, with proper log levels.
   
Write proper documentation for your classes and methods wherever applicable.


## Assignment-12

This is an extension of Assignment-11.
1. How to work with Request Headers, Response Headers?
2. How to change the Response Body?
3. How to set a Response code?
4. Install Postman. Use it to hit your APIs. See how request headers can be set, how parameter can be passed, how response body can be passed?
5. Add an API to create Product.
6. Add an API to update Product.

